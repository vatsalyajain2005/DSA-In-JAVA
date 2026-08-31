package Bacis;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Functions {
    // Q1 - Create a method that print a Greeting.
    static void printWelcome(String name){
        System.out.println("Hello " +name+ " Welcome to Java in DSA...");
    }
    // Q2 - Create a method that return sum.
    static int add(int a, int b){
        int sum = a+b;
        System.out.println("--> Sum is: "+sum);
        return sum;
    }
    // Q3 - Create a method that return ture if no.is Even.
    static int isEven(int num){
        if (num%2==0){
            System.out.println("--> Your Sum is Even Number");
        } else {
            System.out.println("--> Your Sum is Odd Number");
        }
        return 0;
    }
    static int largenum(int a,int b){
        if (a>b){
            System.out.println("--> Num1 is Bigger");
        } else if(a<b){
            System.out.println("--> Num2 is Bigger");
        } else{
            System.out.println("--> Num1 and Num2 are Same");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1 - Call
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        printWelcome(name);

        // mix of Q2,Q3,Q4
        // Q2 - call
        System.out.print("Enter Num1: ");
        int a = sc.nextInt();
        System.out.print("Enter Num2: ");
        int b = sc.nextInt();
        int sum = add(a,b);
        // Q3 - call
        isEven(sum);
        // Q4 - call
        largenum(a,b);

    }
}
