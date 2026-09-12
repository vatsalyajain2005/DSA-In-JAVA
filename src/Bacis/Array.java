package Bacis;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array
        System.out.print("Number of Values in Array: ");
        int n = sc.nextInt();
       /* int arr[] = new int[n];
        for (int i=0; i<= n-1; i++){
            System.out.print("Enter array Values of Index["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Length of Array is: "+arr.length);
        System.out.println("--> Array Contains");
        int sum = 0;
        int multi = 1;
        int max = arr[0];
        int min = arr[0];
        for (int val: arr){
            sum = sum + val;
            multi = multi * val;
            if (max<=val){
                max = val;
            }
            if (min>=val){
                min = val;
            }
            System.out.print(" "+val);
        }
        System.out.println();
        System.out.println("Sum of Array is: "+sum);
        System.out.println("Multi of Array is: "+multi);
        System.out.println("Max Value of an Array is: "+max);
        System.out.println("Min Value of an Array is: "+min); */

        //2D Array
        System.out.print("Enter No. of Row: ");
        int row = sc.nextInt();
        System.out.print("Enter No. of col: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.printf("Enter [%d][%d]: ", i+1,j+1);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("-->Array Contain");
        int sum = 0;
        int multi = 1;
        int max = arr[0][0];
        int min = arr[0][0];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                int value = arr[i][j];
                sum = sum + value;
                multi *= value;
                if (max<=value) {
                    max=value;
                }
                if (min>=value) {
                    max=value;
                }
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("->Sum of Array is: "+sum);
        System.out.println("->Multi of Array is: "+multi);
        System.out.println("->Max Value of Array is: "+max);
        System.out.println("->Min Value of Array is: "+min);
    }
}
