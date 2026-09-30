package day4;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so diem cua hoc sinh :");
        double score = sc.nextDouble();
        if (0 > score || score > 100) {
            System.out.println("diem phai lon hon 0 va nho hon 100");
        } else {
            if (score > 75) {
                System.out.println("xep loai A");
            } else if (75 >= score && score > 60) {
                System.out.println("xep loai B");
            } else if (60 >= score && score > 45) {
                System.out.println("xep loai C");
            } else if (45 >= score && score > 35) {
                System.out.println("xep loai D");
            } else {
                System.out.println("xep loai E");
            }
        }
        sc.close();
    }
}
