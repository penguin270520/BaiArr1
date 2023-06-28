package bai7;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập danh sách sinh viên: ");
        int n = input.nextInt();
        double a[] = arr(n,input);
        phanLoaiSV(a);

    }

    public static double[] arr(int n , Scanner input){
        double[] a = new double[n];
        for(int i= 0 ; i < a.length ; i++){
            System.out.println("nhập điểm sinh viên thứ " + i + ": " );
            a[i] = input.nextDouble();
        }
        return a;
    }

    public static void phanLoaiSV(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 2.0){
                System.out.println("sinh viên thứ " + i + " trượt!");
            }
            if(arr[i] >= 2.0 && arr[i] < 3.0){
                System.out.println("sinh viên thứ " + i + " TB!");
            }
            if(arr[i] >= 3.0 && arr[i] < 3.2 ){
                System.out.println("sinh viên thứ " + i + " Khá!");
            }
            if(arr[i] >= 3.2 && arr[i] < 3.6){
                System.out.println("sinh viên thứ " + i + " giỏi!");
            }
            if(arr[i] >= 3.6 && arr[i] <= 4.0){
                System.out.println("sinh viên thứ " + i + " Xuất sắc!");
            }
        }
    }


}
