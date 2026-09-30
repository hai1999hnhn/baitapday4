package day4;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhạp vao so a :");
        int a = sc.nextInt();
        System.out.println("nhap vao so b");
        int b = sc.nextInt();
        int c;
        if (a >= b) {
            c = a - b;
            if (a == c) {
                System.out.println("hieu bang gia tri so a : " + c);
            } else if (b == c) {
                System.out.println("hieu bang gia tri so b : " + c);
            } else {
                System.out.println("hieu ko bang gia tri nao da nhap");
            }
        } else {
            c = b - a;
            if (a == c) {
                System.out.println("hieu bang gia tri so a : " + c);
            } else if (b == c) {
                System.out.println("hieu bang gia tri so b : " + c);
            } else {
                System.out.println("hieu ko bang gia tri nao da nhap");
            }
        }
        sc.close();
    }
}
