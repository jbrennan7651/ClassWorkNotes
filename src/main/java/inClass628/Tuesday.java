package inClass628;

import java.lang.reflect.Array;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tuesday {
    public static void main(String[] args) {
        //List<String> colors = Arrays.asList("red","blue","green");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(7);
        numbers.add(14);
        numbers.add(19);
        // for (int number: numbers) {
        //    System.out.println(number);  
        // }
        // System.out.println("****");
        // Stream<String> stream = colors.stream();
        // stream.forEach((el) -> {
        //     System.out.println(el);
        // });
        // System.out.println("*****");
        // stream.forEach(el -> System.out.println(el));


        // Integer[] eN = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * 10).toArray(Integer[]:: new);
        // for (int n : eN){
        //     System.out.println(n);
        // }

        // Integer[] oN = numbers.stream().filter(n -> n % 2 != 0).map(n -> n * 10).toArray(Integer[]:: new);
        // for (int n : oN){
        //     System.out.println(n);
        // }

        //greater than 10 add 5 print
        Integer[] gt10 = numbers.stream().filter(n -> n >= 10).peek(n -> System.out.println(n + "")).map(n -> n + 5).toArray(Integer[]:: new);
        for (int n : gt10){
            System.out.println(n);
        }

        //remove duplicates, order, output using forEach loop
        Set<Integer> deDuped = numbers.stream().distinct().sorted().collect(Collectors.toSet());

        

    

    }
    public static void doEach(String el) {
        System.out.println(el);
    }
}



//Example codes:
    // int n = 5;
        
        // if(n == 1){
        //     //
        // }
        // else if(n == 2){

        // }
        // else if(n == 3){

        // }
        // else {

        // }

        // switch(n){
        //     case 1:
        //         //something
        //         break;
        //     case 2:
        //         //something
        //         break;
        //     case 3: //if (x OR y)
        //     case 4:
        //         //something
        //         break;
        //     default:
        //         //something
        //         break;
            
        // }

        //ENUMS
//         setLevel(Level.RED);
//         setLevel(Level.YELLOW);
//         setLevel(Level.GREEN);
//     }

//     public static void setLevel(Level level){
//         switch(level){
//             case RED:
//                 System.out.println("RED ALERT");
//                 break;
//             case YELLOW:
//                 System.out.println("YELLOW ALERT");
//                 break;
//             case GREEN:
//                 System.out.println("GREEN ALERT");
//                 break;
//             default: 
//                 System.out.println("Level Out of Bounds");
//                 break;
//         }

//     }
// }

// enum Level{
//     RED,
//     YELLOW,
//     GREEN
// }

