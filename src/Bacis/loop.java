package Bacis;

import java.util.*;

public class loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number want to print till: ");
        int n = sc.nextInt();

       /* // 1 - Print Counting 1 to n;
        for(int i=1; i<=n; i++){
            System.out.println(i);
        } */

       /* // 2 - Print Counting n to 1;
        for(int i=n; i>=1; --i){
            System.out.println(i);
        } */

      /*  // 3 - Print the multiple of 10 -- Method 1;
        for (int i=10; i<=n; i++){
            if (i%10 == 0){
                System.out.println(i);
            }
        }
        // Method 2
        for (int i=10; i<=n; i+=10){ // i = i + 10;
            System.out.println(i);
        } */

       /* // 4 - Print Your Name n time
        for (int i=1; i<=n; i++){
            System.out.println("My name is Vatsalya Jain");
        }   */

        /*// 5 - Print Even No. form 1 to n;
        for (int i=1; i<=n; i+=2){
            System.out.println(i);
        }   */

       /* // 6 - Print the sum of all number form 1 to n
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of all Number is: " +sum);
        */

        /*// 7 - Print all int in range of 50 to 100, that are divisible of 7
        for (int i=50; i<=n; i++){
            if (i % 7 == 0){
                System.out.println(i);
            }
        }*/

        // 8 - Print all prime number between 1 to b
        for (int i=2; i<=n; i++){
            if (i == 2 || i == 3 || i == 5 || i == 7 ||
                    i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0){
                System.out.println(i);
            }
        }
    }

}
