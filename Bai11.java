package day4;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so :");
        int count = sc.nextInt();
        if (count > 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(count + "x" + i + "=" + (count * i));
            }
        } else {
            System.out.println("so ko dung dinh dang");
        }
        sc.close();
    }
}
