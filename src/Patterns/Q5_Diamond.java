package Patterns;

import java.util.Scanner;

public class Q5_Diamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Value: ");
        int n = sc.nextInt();

        // Diamond
        /*for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            for (int col=1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
       for (int row=2; row<=n; row++){
            for (int col=1; col<=row-1; col++){
                System.out.print("  ");
            }
            for (int col=1; col<=2*n-row-(row-1); col++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // Hollow Diamond

        for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            if (row==1){
                for (int col=1; col<=2*row-1;col++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int col=1; col<=2*row-3; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int row=1; row<=n; row++){
            if (row==1){
                continue;
            }
            // Part - 1
            for (int col=1; col<=row-1; col++){
                System.out.print("  ");
            }
            // Part - 2
            if (row == n){
                for (int col=1; col==1; col++){
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* ");
                for (int col=1; col<=(2*n)-(2*row)-1; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
