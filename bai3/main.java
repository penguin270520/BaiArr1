package bai3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số phần tử trong mảng");
        int x = input.nextInt();
        int[] arr = inputArrays(x,input);
        ktr(arr);
    }

    public static int[] inputArrays(int x , Scanner input ){
        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập phần tử thứ " + i + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static void ktr(int[] arr) {
        boolean kTra = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                kTra = false;
                break;
            }
        }

        if (kTra) {
            System.out.println("Mảng đối xứng");
        } else {
            System.out.println("Mảng không đối xứng");
        }
    }
}
