package Patterns;

import java.util.Scanner;

public class Q2_Rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: "); int len = sc.nextInt();
        System.out.print("Enter Breath: "); int bre = sc.nextInt();

        // Normal Rectangle
        /*for (int i=1; i<=len; i++){
            for (int j=1; j<=bre; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }*/

        // Hollow Rectangle
        for (int row=1;row<=len;row++){
            for (int col=1; col<=bre; col++){
                if(row==1 || row==len){
                    System.out.print("* ");
                }
                else{
                    if(col==1 || col==bre){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }



    }
}
