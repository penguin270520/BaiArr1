package bai5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào chuỗi kí tự: ");
        String chuoi = input.nextLine();
        String[] chuoi1 = tachChuoi(chuoi);
        for(int i = chuoi1.length - 1 ; i >= 0 ; i-- ){
            System.out.println(chuoi1[i]);
        }
    }

    public static String[] tachChuoi(String chuoi){
        String[] arr = chuoi.split(" ");
        return arr;
    }
}
