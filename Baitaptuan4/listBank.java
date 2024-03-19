package Baitaptuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class listBank extends Bank{
    static Scanner sc=new Scanner(System.in);

    String name;
    double laiSuat;

    public void laiSuat(double laiSuat) {
        System.out.println("Ngan hang: "+name);
        super.laiSuat(laiSuat);
    }

    public void inPut(){
        System.out.print("Nhap vao ten ngan hang: ");
        name=sc.nextLine();
        System.out.print("Nhap vao so % lai suat: ");
        laiSuat=sc.nextDouble();
    }

    public static void main(String[] args) {
        ArrayList<listBank> arr=new ArrayList<>();
        while (true) {
            listBank lB= new listBank();
            System.out.println("Nhap vao list!!!");
            lB.inPut();
            arr.add(lB);
            sc.nextLine();
            System.out.println("Ban muon nhap tiep khong??? (yes or no)");
            String control=sc.nextLine();
            while (!control.equals("yes") && !control.equals("no")) {
                System.out.println("Nhap lai!!");
                control=sc.nextLine();
            }
            if(control.equals("no")) break;
        }
        System.out.println("Danh sach ngan hang");
        for(listBank lb: arr){
            lb.laiSuat(lb.laiSuat);
        }
    }
}
