package inClass629;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
    
        dogList.add( new Dog("spot", 4, "boxer"));
        dogList.add( new Dog("ginger", 8, "hound"));
        dogList.add( new Dog("princess", 5, "chow"));
        dogList.add( new Dog("duk", 5, "dachshund"));
        //Increase age by 1 convert back to dog
        // dogList.stream().map(dog -> {
        //     Dog dogDTO = new Dog(dog.getName(), dog.getAge(), dog.getBreed());
        //     dogDTO.setAge(dogDTO.getAge() + 1);
        //     return dogDTO;
        // }).forEach( el -> System.out.println(el));

        // //double age and return to dog in a list
        // List<Dog> newDogList = dogList.stream().map(dog -> {
        //     Dog dogDTO = new Dog(dog.getName(), dog.getAge(), dog.getBreed());
        //     dogDTO.setAge(dogDTO.getAge() * 2);
        //     return dogDTO;
        // }).collect(Collectors.toList());
        // for (Dog d : newDogList){
        //     System.out.println(d);
        // }

        // //changes dogs name to all caps
        // dogList.stream().map(dog -> {
        //     Dog dogDTO = new Dog(dog.getName(), dog.getAge(), dog.getBreed());
        //     dogDTO.setName(dogDTO.getName().toUpperCase());
        //     return dogDTO;
        // }).forEach( el -> System.out.println(el));

        // dogList.stream().map(dog -> {
        //     Dog dogDTO = new Dog(dog.getName(), dog.getAge(), dog.getBreed());
        //     return dogDTO.getName();
        // }).forEach( el -> System.out.println(el));

        // dogList.stream().filter(dog -> dog.getAge() > 4).forEach(dog -> System.out.println(dog));
        // dogList.stream().filter(dog -> dog.getAge() > 4).forEach(System.out::println);



        //ORder by age
        dogList.stream().sorted(Comparator.comparingInt(Dog::getAge)).forEach(System.out::println);

        //order by name
        dogList.stream().sorted(Comparator.comparing(Dog::getName)).forEach(System.out::println);

        //sort based on multiple params
        dogList.stream().sorted(Comparator.comparing(Dog::getName).thenComparingInt(Dog::getAge)).forEach(System.out::println);


        Map<String, Long> breeds = dogList.stream().collect(Collectors.groupingBy(Dog::getBreed, Collectors.counting()));
        System.out.println(breeds);
    }

   

}
