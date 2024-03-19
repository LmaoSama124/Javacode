package Tuan4;

import java.util.Scanner;

public class Employee extends Person {
        static Scanner sc=new Scanner(System.in);

        private int luong;

        public Employee() {
        }

        public Employee(String ten, String tuoi, String diaChi, int luong) {
            super(ten, tuoi, diaChi);
            this.luong = luong;
        }

        public void inPut() {
            super.inPut();
            System.out.print("Nhap luong:");
            this.luong = sc.nextInt();
        }

        public void outPut() {
            super.outPut();
            System.out.println(", Luong: " + luong);
        }
    }
