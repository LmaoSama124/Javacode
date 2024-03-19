package Tuan4;

import java.util.Scanner;

public class Person {
        static Scanner sc= new Scanner(System.in);
        String ten, tuoi, diaChi;

        public Person() {
        }

        public Person(String ten, String tuoi, String diaChi) {
            this.ten = ten;
            this.tuoi = tuoi;
            this.diaChi = diaChi;
        }

        public void inPut() {
            System.out.print("Nhap ten:");
            this.ten = sc.nextLine();
            System.out.print("Nhap tuoi:");
            this.tuoi = sc.nextLine();
            System.out.print("Nhap dia chi:");
            this.diaChi = sc.nextLine();
        }

        public void outPut() {
            System.out.print("Ten: " + ten + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi);
        }
    }
