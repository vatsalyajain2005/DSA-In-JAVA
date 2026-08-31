package Patterns;

import java.util.Scanner;

public class Q7_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num: ");
        int n = sc.nextInt();

//        for (int row=1; row<=n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }

//        int count = 1;
//        for (int row=1; row<=n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }

        for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            for (int col=1; col<=2*row-1; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
