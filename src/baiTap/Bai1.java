package baiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Điền số: ");
        int number = sc.nextInt();
        if ( number > 0 || number == 0) {
            System.out.println("Đây là số dương");
        }else{
            System.out.println("Đây là số âm");
        }
    }
}
