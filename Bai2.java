package day4;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chu cai:");
        char input = sc.next().charAt(0);
        switch (input) {
            case 'A', 'a':
                System.out.println("Ada");
                break;
            case 'B', 'b':
                System.out.println("Basic");
                break;
            case 'C', 'c':
                System.out.println("Cobol");
                break;
            case 'D', 'd':
                System.out.println("dBase III");
                break;
            case 'F', 'f':
                System.out.println("Fortran");
                break;
            case 'P', 'p':
                System.out.println("Pascal");
                break;
            case 'V', 'v':
                System.out.println("Visual C++");
                break;
            default:
                System.out.println("Khong tim thay ngon ngu hoac goi phan mem tuong ung");
                break;
        }
    }
}
