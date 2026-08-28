package Bacis;

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No.: "); int num1 = sc.nextInt();
        System.out.print("Enter Second No.: "); int num2 = sc.nextInt();

        int Sum = num1 + num2;

        System.out.println("Sum is: "+ Sum);

    }
}