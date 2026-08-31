package Patterns;

import java.util.Scanner;

public class Q3_Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Value: ");
        int n = sc.nextInt();
        // Rigth Angle Triangle
       /* for (int row=1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        } */

        // Inverse Rigth Angle Triangle
       /* for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row+1; col++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }*/
        // Iso Triangle
       for (int row=1; row<=n; row++){
            for (int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            for (int col=1; col<=2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Reverse Iso Triangle
       /* for (int row=1; row<=n; row++){
            for (int col=1; col<=row-1; col++){
                System.out.print("  ");
            }
            for (int col=1; col<=2*n-row-(row-1); col++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // Hollow Rigth Angle triangle
      /*  for (int row=1; row<=n; row++){
                if(row==1 || row==2 || row==n){
                    for (int col=1;col<=row;col++){
                        System.out.print("* ");
                    }
                } else{
                    System.out.print("* ");
                    for (int col=1;col<=(row-2);col++){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }
            System.out.println(" ");
        }*/

        // Hollow pyramid triangle
        /*for (int row=1; row<=n; row++){
            for (int col=1;col<=n-row; col++){
                System.out.print("  ");
            }
            if (row==1 || row==n){
                for (int col=1;col<=2*row-1; col++){
                    System.out.print("* ");
                }

            }
            else {
                System.out.print("* ");
                for (int sp=1;sp<=2*row-3; sp++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                }

            System.out.println();
        }*/
    }
}
