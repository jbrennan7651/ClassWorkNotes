import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    //this calculator should give monthly mortgage payments given user inputs
    //annual interest rate should be /12
    public static void main(String[] args) {

        int principal ;
        double interest ;
        byte period ;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between $1k - $1M: ");
        }
        //this asks the user to input their principal loan amount

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextDouble();
            if (interest > 0 && interest <= 100)
                break;
            System.out.println("Enter a number from 0 to 100");
            //this asks the user to input their annual interest
        }

        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();
            if (period > 0)
                break;
            System.out.println("Enter a number greater than 0");
            //most loans will not exceed 127 years so byte is used
        }

        double rate = interest/1200;
        // interest is /1200 due to user entry as a % and not as a decimal (3.45 not .0345)
        // this is 12 months * 100% = 1200


        //the following equation is used for calculation:
        // M = P [r(1+r)^n / (1+r)^n -1]
        //where P is the principal, r is the rate, n is the number of payments
        //and M is the monthly payment result
        double numerator = Math.pow(1 + rate , period * 12);
        //calculates the numerator using Math.pow where double a is being raised to the power of double b
        double denominator = Math.pow((1 + rate), period * 12);
        double payment = principal * (rate*(numerator))/(denominator-1);
        //this calculates the monthly payments
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(payment);
        //reformats the number from payment as a currency
        System.out.println("Your monthly payment is: " + result);




    }
}
