package bai6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("nhập số lượng người bạn: ");
        n = input.nextInt();
        input.nextLine();
        String[] arr = nhapMang(n,input);

        System.out.println("người bạn có tên nhỏ nhất: " + timTenNhoNhat(arr));
    }

    public static String[] nhapMang(int n, Scanner input){
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập tên người bạn thứ " + i);
            arr[i] = input.nextLine();
        }
        return arr;
    }

    public static String timTenNhoNhat(String[] name) {
        String tenNhoNhat = name[0];
        for (int i = 1; i < name.length; i++) {
            String tenHienTai = name[i];
            if (tenHienTai.length() < tenNhoNhat.length()) {
                tenNhoNhat = tenHienTai;
            }
        }
        return tenNhoNhat;
    }


}
