package baiTap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println(" Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        System.out.println("Mảng là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + mang[i]);
        }
        System.out.println();
//        Tính giá trị trung bình của mảng

        System.out.println("Giá trị trung bình của mảng là:");
        int sum = 0;
        for( int i=0; i<n; i++){
            sum = sum + mang[i];
            }
        System.out.println(sum/n);

//        In ra phần tử có giá trị lớn nhất
        System.out.println("Giá trị lớn nhất của mảng là:");
        int max = mang[0];
        for (int i = 0; i < n; i++) {
            if (max < mang[i]) {
                max = mang[i];
            }
        }
        System.out.println(max);
        System.out.println();

// sắp xếp các phần tử theo hướng ngược lại
        System.out.println("Mảng ngươc lại là: ");
        for (int i = n-1; i >= 0 ;  i--  ) {
            System.out.print(" " + mang[i]);
        }
        System.out.println();
    }
}
