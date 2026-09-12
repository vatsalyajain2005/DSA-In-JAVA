package Bacis;

import java.util.*;

public class String {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.String str = sc.nextLine();
        //str.length() -- Help to find out length of the String.
        System.out.println(str.length());

        //str.charAt() -- Help to get particular char form String.
        System.out.println(str.charAt(2));

        // str.equal() -- Help to find 2 String is same but this is Case Sensitive.
        java.lang.String name1 = "Vashu";
        java.lang.String name2 = "Vashu";
        System.out.println(name1.equals(name2));

        // str.equalsIgnoreCase() -- Help to find 2 String is same but this is not Case Sensitive.
        System.out.println(name1.equalsIgnoreCase(name2));

        //str.isEmpty() -- Used to find String is Empty or null.
        System.out.println(str.isEmpty());

        //str.isBlank() -- Used to find String is Empty or null(length = 0) and only space also.
        System.out.println(str.isBlank());

        // str.trim() -- Used to Trip spaces from the String
        System.out.println(str.trim());

        // str.toUpperCase() -- Convert all String Char in Upper Case(Capital)
        System.out.println(str.toUpperCase());

        // str.toLowerCase() -- Convert all String Char in Lower Case.
        System.out.println(str.toLowerCase());

        // str.substring() -- Help to print limited String not full String/
        System.out.println(str.substring(1,2));

        // str.contains() -- Help in Searching particular word or char form your String.
        System.out.println(str.contains("Vashu"));

        // str.valueOf() -- Convert any data type into String
        int a = 564;
        System.out.println(str.valueOf(a));

        // str.startsWith()
        System.out.println(str.startsWith("My "));
        // str.endsWith()
        System.out.println(str.endsWith("Vashu"));

        // str.toCharArray() -- Convert String into Array
        java.lang.String n = "Vatsalya";
        char[] arr = n.toCharArray();
        for (char ch: arr){
            System.out.println(ch);
        }

        // Question1 Print all element of string.
        System.out.println("Q1 All Element of String");
         for(int i=0;i<str.length();i++){
             System.out.print(str.charAt(i)+" ");
         }
        System.out.println();
         // Question2 Print Length of String Without Length Function
        int count = 0;
         char[] convert = str.toCharArray();
        for (char element : convert){
            count++;
        }
        System.out.println("Length of String is: "+ count);

        // Question3 Count Vowels
        int vowel =0;
        for(int i=0; i<str.length();i++){
            if (str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'){
                vowel++;
            }
            if (str.charAt(i)== 'A'||str.charAt(i)== 'E'||str.charAt(i)== 'I'||str.charAt(i)== 'O'||str.charAt(i)== 'U'){
                vowel++;
            }
        }
        System.out.println("Total Vowel is: "+ vowel);

        // Question4 Reversing String

        System.out.println("Q4 Reverse an String");
        java.lang.String Reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i)+" ");
            Reverse = Reverse + str.charAt(i);
        }
        System.out.println();
        // Question5 Check you string is palindrome or not
        if(str.equals(Reverse)){
            System.out.println("Your String is Palindrome");
        } else {
            System.out.println("Your String is not Palindrome");
        }
    }
}
