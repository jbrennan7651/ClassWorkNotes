# Class notes from 4/20
## video "Java tutorial - For Beginners" : https://www.youtube.com/watch?v=Yv_4RXyLjL8

## primitive types (immutable)
    int helloWorld = 5;
    double num2 = 5.0;
    boolean b = true;
    char c = 't';
    String str = "123rsfewgwesr4%";
    int tim = helloWorld;
    System.out.println(tim);
## Operators

    int x = 5;
    int y = 7;
    int z = 57;
    //int sum = x - y * z;
    double u = x / (double)y;

    int h =  56 % 5; //shows remainder

## Type Casting
    Scanner scanner = new Scanner(System.in);
    String scanned = scanner.next();
    //int scanned = scanner.nextInt();
    //boolean scanned = scanner.nextBoolean();
    //double scanned = scanner.nextDouble();

    int x = Integer.parseInt(scanned);
    System.out.println(x);

## Comparisons
    int x = 6;
    int y = 23;
    int z = 10;
    //< > == >= <= !=
    boolean compare = !(x > y || z < y);

## IF statements
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    if(s.equals("tim")){
        System.out.println("You typed tim");
    }
    else if(s.equals("hello")){
        System.out.println("hi");
    }
    else {
        System.out.println("Print");
    }

## nested if loops
    System.out.print("Input your age: ");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int age = Integer.parseInt(s);

        if (age >= 18){
            System.out.print("Input your fav food: ");
            String food = sc.nextLine();

            if (food.equals("pizza")){
                System.out.println("mine too!");
            }
            else
                System.out.println("not mine");

        }
        else if (age >= 13){
            System.out.println("You are an teenager");
        }
        else
            System.out.println("You are a child");

## Arrays
    String [] newArr = new String[5];
    newArr[0] = "hello";
    newArr[1] = "what";
    newArr[2] = "Niko";
    newArr[3] = "Marty";
    newArr[4] = "Job";
    int[] nums = {2,3,54,6,6};
    int x = nums[4];
    System.out.println(x);
    //String x = newArr[4];

## For Loops

        //for loops
        //automates a task and does it a set amount of times
        //conditional iteration

        int[] arr = {1,5,7,3,4,5};

        for (int i = 0; i < arr.length; i++ ){
            if (arr[i] == 5){
                System.out.println("Found a 5! at index " + i);
            }

        }

## for Each Loop

    for each loops
    int[] arr = {1,3,5,2,4,5};
    String[] names = new String[5];
    Scanner sc = new Scanner(System.in);
    int count = 0;

        for (int element:arr) {
            System.out.println(element + " " + count);
            count++;
        }

        for (int i = 0; i<names.length; i++){
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }
        for (String n:names){
            System.out.println(n);
            if (n.equals("tim")){
                break;
            }
        }

## while loops
    //while loops
    Scanner sc = new Scanner(System.in);
    System.out.print("Type a number: ");
    int x = sc.nextInt();

        int count = 0;
        while(x != 10){
            System.out.println("Type 10");
            System.out.print("Type a number: ");
            x = sc.nextInt();
            count++;
        }

        System.out.println("You tried " + count + " times");

# do while
    Scanner sc = new Scanner(System.in);
    int x;

       do{
           System.out.print("Type a number: ");
           x = sc.nextInt();

       }
       while (x != 10);

# Sets
    sets and lists
    Set<Integer> t = new HashSet<Integer>();
    t.add(5);
    t.add(7);
    t.add(5);
    t.add(9);
    t.add(-8);
    //sets only contain unique elements, so the extra 5 doesnt matter
    t.remove(9);

        //length t.size();
        boolean x = t.contains(5);

        System.out.println(x);
        t.contains(5);
        System.out.println(t);

## Lists
ArrayList<Integer> t = new ArrayList<Integer>();

        t.add(1);
        t.add(2);
        t.get(0);
        t.set(1, 5);
        //t.set (index, element);
        t.subList(1,3);
        System.out.println(t);

## Hash Maps
    //Hash Maps
    Map m = new HashMap();
    m.put("tim",5);
    m.put("joe", "x");
    m.put("a","b");

        m.containsValue("b");
        m.containsKey(5);
        
        m.clear();
        m.isEmpty();
        System.out.println(m);