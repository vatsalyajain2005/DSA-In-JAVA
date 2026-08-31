package Patterns;

import java.util.Scanner;

public class Q6_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value: ");
        int n = sc.nextInt();
        // Rigth Angle Triangle
       for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            for (int col=1; col<=(n*2)-(row+row);col++){
                System.out.print("  ");
            }
           for (int col=1; col<=row; col++){
               System.out.print(" *");
           }
            System.out.println();
        }

        // Inverse Rigth Angle Triangle
       for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
           for (int col=1; col<=(2*n)-(2*(n-row+1));col++){
               System.out.print("  ");
           }
           for (int col=1; col<=n-row+1; col++){
               System.out.print(" *");
           }
            System.out.println();
        }
    }
}
