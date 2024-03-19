package Tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class testArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr= new ArrayList<>();
        while (true) {
            System.out.print("Nhap vao list: ");
            arr.add(sc.nextLine());
            System.out.println("Ban muon nhap tiep khong??? (0=no, 1=yes)");
            String control=sc.nextLine();
            while (!control.equals("yes") && !control.equals("no")) {
                System.out.println("Nhap lai!!");
                control=sc.nextLine();
            }
            if(control.equals("no")) break;
        }
        for(String i: arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}