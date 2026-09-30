package day4;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten cua ban :");
        String name = sc.next();
        System.out.println("nhap vao so tuoi cua ban :");
        int age = sc.nextInt();
        for (int i = 1; i <= age; i++) {
            System.out.println(name);
        }
    }
}
