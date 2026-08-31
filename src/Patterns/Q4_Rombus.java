package Patterns;

import java.util.Scanner;

public class Q4_Rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Value: ");
        int n = sc.nextInt();

        for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row; col++ ){
                System.out.print(" ");
            }
            for (int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
