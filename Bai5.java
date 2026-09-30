package day4;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so x :");
        double x = sc.nextDouble();
        System.out.println("nhap vao so y :");
        double y = sc.nextDouble();
        if (x > 3000 || x < 2000) {
            System.out.println(x);
        } else {
            System.out.println("x can lon hon 3000 va nho hon 2000");
        }
        if (y <= 500 && y >= 100) {
            System.out.println(y);
        } else {
            System.out.println("y nam trong khoang tu 100 den 500");
        }
        sc.close();
    }
}
