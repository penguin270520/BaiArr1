package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số lượng phần từ của mảng: ");
        int x = input.nextInt();
        int[] arr = nhapMang(x,input);
        int sum = sum(arr);
        System.out.println("Tổng của tất cả phần tử trong mảng là: " + sum);
    }
    public static int[] nhapMang(int x, Scanner input){
        int a[] = new int[x];
        for(int i = 0;i < a.length; i++){
            System.out.println("nhập thông tin phần tử thứ " + i + ": ");
            a[i] = input.nextInt();
        }
        return a;
    }
    public static int sum(int []a){
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }
}
