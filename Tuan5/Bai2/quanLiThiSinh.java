package Tuan5.Bai2;

import java.util.Scanner;

public class quanLiThiSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao so thi sinh: "); int n=Integer.parseInt(sc.nextLine());
        thiSinh tS[]= new thiSinh[n];
        System.out.println("Nhap thi sinh vao mang!!!");
        for(int i=0;i<tS.length;i++){
            tS[i]= new thiSinh();
            tS[i].inPut();
            System.out.println();
        }
        for(thiSinh i: tS){
            i.outPut();
        }
        System.out.print("Nhap diem chuan: "); double diemChuan=Double.parseDouble(sc.nextLine());
        System.out.println("Nhung thi sinh do ki thi la!!!");
        for(thiSinh i: tS){
            if(i.xetDiem(diemChuan)) {
                i.outPut();
            }
        }
        sc.close();
    }
}
