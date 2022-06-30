package homework628;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main( String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        // for (Employee employee : employeeList)
        //     System.out.println(employee.toString());


        // //add 1 year to age
        // employeeList.stream().map( el -> {
        //     Employee emp = new Employee(emp);
        //     emp.setAge(emp.getAge() + 1);
        //     return emp;
        // }).forEach(el -> System.out.println(el));


        // switch first and lastnames
        List<Employee> neatNames = 
        employeeList.stream().map( el -> {
            Employee emp = new Employee(el);
            String[] firstLast = emp.getName().split(" ");
            var firstName = firstLast[0];
            var lastName = firstLast[1];
            emp.setName(lastName + ", " + firstName);
            return emp;
        }).collect(Collectors.toList());

        // //get salaries over $X
        // employeeList.stream().filter(el -> el.getSalary() > 20_000).forEach(el -> System.out.println(el));

        //Increase all salaries by $500
        // employeeList.stream().map( el -> {
        //     Employee emp = new Employee(emp);
        //     var raise = emp.getSalary() * .1;
        //     if(raise < 500){
        //         emp.setSalary(emp.getSalary() * 500);
        //     }
        //     else{
        //         emp.setSalary(Math.round(emp.getSalary() * 1.10));
        //     }
        //     return emp;
        // }).forEach(el -> System.out.println(el));
      

        
        //output ordered list of salaries excluding dupes

        // employeeList.stream().sorted(Comparator.comparing(Employee::getGender).thenComparingDouble(Employee::getSalary)).forEach(el -> System.out.println(el));



        List<Employee> sortedByGender = employeeList.stream().sorted(Comparator.comparing(Employee::getGender).thenComparingDouble(Employee::getSalary)).collect(Collectors.toList());


        
        BufferedOutputStream out = null;
        try{
            out = new BufferedOutputStream(new FileOutputStream("data.txt"));
            List<Employee> outData = neatNames;
            for(Employee emp : outData){
                var outString = emp.toString() + "\n";
                byte[] array = outString.getBytes();
                out.write(array);
            }
         
        }
        catch(FileNotFoundException e){
           System.out.println(e.getMessage()); 
        } 
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try{
                out.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }

        BufferedInputStream in = null;
        try{
            in = new BufferedInputStream(new FileInputStream("data.txt"));
            while(in.available() > 0 ){
                char data = (char) in.read();
                System.out.print(data); 
            }
            
        }
        
        catch(FileNotFoundException e){
           System.out.println(e.getMessage()); 
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try{
                in.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }


        


        

    }


    
}
