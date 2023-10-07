package baiTap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter side  1: ");
        int a = sc.nextInt();
        System.out.print(" Enter side  1: ");
        int b = sc.nextInt();
        System.out.print(" Enter side  1: ");
        int c = sc.nextInt();
        if( a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a ){
            System.out.println("This is a right triangle ");
        }else{
            System.out.println("This is not a right triangle");
        }
    }
}
