# Basics
    byte myAge = 30;
    long viewsCount = 3_123_456_789L;
    float price = 10.99F;
    char letter = 'A';
    boolean isEligible = true;
    byte age = 30;
    Date now = new Date();
    System.out.println(now);

# Primitive types
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

# Reference types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

# Strings
        String message = "   Hello World" + "!!";
        System.out.println(message.trim());
        System.out.println(message);

        c:\Windows\...
        String message = "Hello \"Mosh\"";
         new line String message = "c:\nWindows\\...";
         tab line String message = "c:\tWindows\\...";
        System.out.println(message);

# Arrays
        int[] numbers = {2,3,5,1,4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

## Multidimensional Arrays
        int[][]numbers = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbers));

# Constants
        final float PI = 3.14F;
        use all caps for constants

# Arithmatic Expressions
        double result = (double)10 / (double)3;
        int x = 1;
        int y = ++x;
        x = x + 2;
        x += 2;
        x /=
        x *=
        System.out.println(x);
        System.out.println(y);

# Order of Operations
        int x = 10 + 3 * 2;
        System.out.println(x);

# Casting and Type converstion
## Implicit Casting
        byte > short > int > long > float > double
        double x = 1.1;
        double y = x + 2; 2.0+1.1
## Explicit casting
        int y = (int)x + 2; 2.0+1.1
        String x = "1.1";
        int y = Integer.parseInt(x) + 2;
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);\

# Math Class
        int result = Math.round(1.1F);
        int result = (int)Math.ceil(1.1F);
        int result = (int)Math.floor(1.1F);
        int result = Math.max(1,2);
        int result = Math.min(1,2);
         result = (int)(Math.random() * 100);
        System.out.println(result);

# Formatting Numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.1);
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

# Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);

# Comparison Operators
    int x = 1;
    int y = 1;
    System.out.println(x != y);
    == is the equality operator
    != is the false operator
    >= greater than or equal to
    <= less than or equal to

# Logical Operators
        int temperature = 32;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

## or statements
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        || is the or operator
        boolean isEligible = hasHighIncome || hasGoodCredit;

## is not true
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = hasHighIncome || hasGoodCredit && !hasCriminalRecord;

# if statements
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
        }
        else if (temp > 20)
            System.out.println("Beautiful Day");
        else
            System.out.println("Cold Day");

# Simplified If Statements
        int income = 120_000;
        boolean hasHighIncome = income > 100_000;

# The Ternary Operator
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";
         parameter? true : false

# Switch Statements
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");

        }

        if (role == "admin")
            System.out.println("You're an admin");
        else if (role = "moderator")
            System.out.println("You are a moderator");
        else
            System.out.println("You are a guest");
