import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color (Red/Blue): ");
        String color = scanner.nextLine();
        System.out.println("Enter age (0-10): ");
        String ageString = scanner.nextLine();
        
        try{
            setColor(color);
            setAge(ageString);
        }
        catch(NoSuchFieldException e){
            System.out.println(e.getMessage());
        }
        catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }

    public static void setColor(String color) throws NoSuchFieldException{
        System.out.println("Color is: " + color);
        if (color.equalsIgnoreCase("Red") || color.equalsIgnoreCase("Blue")){
            return;
        }
        throw new NoSuchFieldException("Color is not Red or Blue");
    }
    
    public static void setAge(String ageString) throws IllegalAccessException{
        var age = 0f;
        if(ageString.contains(".")){
            age += Float.parseFloat(ageString);
        }
        else{
            age += Integer.parseInt(ageString);
        }
        System.out.println("Age is: "+ age);
        if (age >= 0 && age <= 10){
            return;
        }
        throw new IllegalAccessException("Age is not between 0 and 10");
    }
}