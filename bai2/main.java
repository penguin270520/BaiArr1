package bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố đầu tiên: ");
        int x = input.nextInt();
        int a[] = mangLuSoNT(x);
        System.out.println("cấc số nt đầu tiên là: ");
        for (int c : a
             ) {
            System.out.println(c + " ");

        }
    }

    public static int[] mangLuSoNT(int n){
        int[] a = new int[n];
        int count = 0;
        int number = 2;
        while(count < n){
            if(isPrimeNumber(number)){
                a[count] = number;
                count++;
            }
            number++;
        }
        return a;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
