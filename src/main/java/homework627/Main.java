package homework627;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BrennanException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color (Red/Blue): ");
        String color = scanner.nextLine();
        System.out.println("Enter age (0-10): ");
        String ageString = scanner.nextLine();

        try{
            setColor(color);
            setAge(ageString);
        }
        catch(BrennanException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Have a nice day!");
        }
    }

    public static void setColor(String color) throws BrennanException{
        System.out.println("Color is: " + color);
        if(color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("blue")){
            return;
        }
        throw new BrennanException("Exception: Color is not Red or Blue");
        
    }

    public static void setAge(String ageString) throws BrennanException{
        System.out.println("Age is: " + ageString);
        var age = 0f;
        if(ageString.contains(".")){
            age += Float.parseFloat(ageString);
        }
        else{
            age += Integer.parseInt(ageString);
        }

       // System.out.println("Age is: " + age);
        if(age >= 0 && age <= 10){
            return;
        }
        throw new BrennanException("Exception: Age out of Range (0-10)");
        
    }
}
