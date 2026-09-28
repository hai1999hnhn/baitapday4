package day4;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập  grade (A/B/Other): ");
        String grade = sc.nextLine();
        System.out.print("Nhập salary: ");
        double salary = sc.nextDouble();
        int allowance = 100;
        if (salary <= 0) {
            System.out.println("Lương không hơp lệ");
            return;
        } else {
            if (grade.equalsIgnoreCase("A")) {
                allowance = 300;
            } else if (grade.contentEquals("B")) {
                allowance = 250;
            }
            salary = +salary + allowance;
            System.out.println("Luong cuoi thang = " + salary);
            sc.close();
        }
    }
}
