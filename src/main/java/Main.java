import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter your message: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(input);
        //tokenizer is a new public class that is prebuilt
        System.out.println("Number of words: " + (stringTokenizer.countTokens()));
        int count1 = stringTokenizer.countTokens();

        int theCount = 0;
        // var a[] = count;
        //count the the's

        // 2...
        //stringtokenizer will iterate through each entry and then be unable to restart
        while(stringTokenizer.hasMoreTokens()) {
            var word = stringTokenizer.nextToken();
            if (word.equalsIgnoreCase("the")) {
                theCount++;
            }
        }
        System.out.println("Times you entered \"the\": " + theCount);

        // 3...
        //initilize a new variable using the same input


        var st = new StringTokenizer(input);

        String lastWord = " ";
        //var word;

        while(st.hasMoreTokens()) {
            lastWord = st.nextToken();
            //System.out.println(word.length());
        }
        System.out.println("The number of letters in the last word: " + lastWord.toString().length());

        //4 use an arraylist to store the number of letters in a word

        var st2 = new StringTokenizer(input);
        var list = new ArrayList<Integer>();


        while(st2.hasMoreTokens()){
            list.add(st2.nextToken().length());

        }
        System.out.println("Number of characters in each word: " + list);

        //5. Use the StringBuilder and ArrayList to reverse the letters in each word in a sentence

        var st3 = new StringTokenizer(input);
        var list2 = new ArrayList<StringBuilder>();


        while(st3.hasMoreTokens()){
            var sb = new StringBuilder(st3.nextToken());
            //var letterArray = list2.toArray()
            sb.reverse();
            list2.add(sb);

        }
        System.out.println("The words you entered but reversed: " + list2);

        //6.  Count the letters for each word, excluding non-characters (periods, commas, etc)

        var count = 0;

        for (int i = 0; i < input.length(); i++){
            boolean checkLetter = Character.isLetter(input.charAt(i));
            if (checkLetter) {
                count = count + 1;
            }
        }
        System.out.println("The total number of Letters entered: " + count);








    }

}

