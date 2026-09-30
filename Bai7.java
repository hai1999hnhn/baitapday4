package day4;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thu 1 :");
        int num1 = sc.nextInt();
        System.out.println("nhap so thu 2 :");
        int num2 = sc.nextInt();
        int sum = 0;
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 != 0) {
                    sum += i;
                    System.out.println(i);
                }
            }
            System.out.println("tong cac so le giua num1 va num2 : " + sum);
        } else {
            for (int i = num2; i <= num1; i++) {
                if (i % 2 != 0) {
                    sum += i;
                    System.out.println(i);
                }
            }
            System.out.println("tong cac so le giua num1 va num2 : " + sum);
        }
        sc.close();
    }
}
