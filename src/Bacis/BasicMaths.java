package Bacis;

import java.util.Scanner;

public class BasicMaths {
    static void printDigit(int num){
        int count = 0;
        while(num!=0){
            int digit = num%10;
            System.out.print(digit + " ");
            count++;
            num = num/10;
        }
        System.out.println();
        System.out.println(count);
    }
    static int sumOf(int num){
        int sum = 0;
        while (num!=0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
    static int reverse(int num){
        int reverse = 0;
        while (num != 0){
            int digit = num%10;
            reverse = reverse*10 +digit;
            num = num/10;
        }
        return reverse;
    }
    static void palindromeNum(int num){
        int reverse = reverse(num);
        if (num == reverse){
            System.out.println("Your number is palindrome");
        } else {
            System.out.println("Your number is not a palindrome");
        }
    }
    static int primeNum(int num){
        for (int i=2; i<=num-1; i++){
            if (num%i!=0){
                System.out.println(i);
            }
        }
        return 1;
    }
    static int GCD(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int LCM(int a, int b){
        int GCD = GCD(a,b);
        int LCM = (a*b) / GCD;
        return LCM;
    }
    static  void armStrogNum(int num){
        int digitCubeSum = 0;
        int userNum = num;
        while (num != 0){
            int digit  = num%10;
            int digitCube = digit*digit*digit;
            digitCubeSum = digitCubeSum + digitCube ;
            num = num/10;
        }
        if (digitCubeSum == userNum){
            System.out.println("ArmStrong Num");
        } else{
            System.out.println("not a ArmStrong Num");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();

//        printDigit(n);
//        System.out.println(sumOf(n));
//        System.out.println(reverse(n));
//        palindromeNum(n);
//        if (primeNum(n) == 0){
//            System.out.println("Not A Prime Num");
//        } else{
//            System.out.println("Prime Number");
//        }
//        System.out.print("Enter your Number2 : ");
//        int b = sc.nextInt();
//        System.out.println("HCF is: " + GCD(n,b));
//        System.out.println("LCM is: " + LCM(n,b));
//        armStrogNum(n);
//        primeNum(n);
        for(int i=2;i<=n;i++) {
            if (i==2 || i==5|| i==3|| i==7|| i%2!= 0 && i%5!=0 && i%3!=0 && i%7!=0 ) {
                System.out.println(i);
            }
        }
    }
}
