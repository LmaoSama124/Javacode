package Tuan5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLyGiangVien {
    static Scanner sc=new Scanner(System.in);
    public static void addToList(ArrayList<giangVien> agV) {
        while (true) {
            giangVien gV = new giangVien();
            System.out.println("Nhap vao list!!!");
            gV.inPut();
            agV.add(gV);
            System.out.println("Ban muon nhap tiep khong??? (yes or no)");
            String control = sc.nextLine();
            while (!control.equals("yes") && !control.equals("no")) {
                System.out.println("Nhap lai!!");
                control = sc.nextLine();
            }
            if (control.equals("no"))
                break;
        }
    }

    public static void outList(ArrayList<giangVien> agV) {
        for(giangVien x: agV){
            x.outPut();
            System.out.println("Luong cua giang vien do la: " + x.tinhLuong(x));
        }
    }
    

    public static void main(String[] args) {
        ArrayList<giangVien> agV=new ArrayList<giangVien>();
        addToList(agV);
        outList(agV);
    }
}
