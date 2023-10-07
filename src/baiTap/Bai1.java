package baiTap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter number: ");
        int n = sc.nextInt();
        if( n > 0 || n == 0){
            System.out.println("This is positive number");
        }else{
            System.out.println("This is negative number");
        }
    }
}
