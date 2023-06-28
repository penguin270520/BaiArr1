package bai4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chuoi;
        System.out.println("nhập vào 1 chuỗi: ");
        chuoi = input.nextLine();
        String[] arr = tachChuoi(chuoi);
        System.out.println("Chuổi sau khi được tách");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i]);
        }
    }

    public static String[] tachChuoi(String chuoi){
        String[] arr = chuoi.split(" ");
        return arr;
    }
}
