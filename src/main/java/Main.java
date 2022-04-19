import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //if number is divisible by 5 = fizz
        //if number is divisible by 3 = buzz
        //if both = FizzBuzz
        //if neither return input number

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int inputNumber = scanner.nextInt();


        if (inputNumber % 5 == 0 && inputNumber % 3 == 0)
            System.out.println("FizzBuzz");
        else if (inputNumber % 3 == 0)
            System.out.println("Buzz");
        else if (inputNumber % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(inputNumber);
    }
}
