package Baitaptuan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so cong nhan hien co: ");
        Congnhan cN[]=new Congnhan[sc.nextInt()];
        for(int i=0;i<cN.length;i++){
            cN[i]=new Congnhan();
            cN[i].inPut();
        }
        System.out.println("List cong nhan co luong thuong la:");
        for(int i=0;i<cN.length;i++){
            if(cN[i].tinhThuong(cN[i])>0) {
                cN[i].outPut();
                System.out.println(" || Tien thuong la: "+ cN[i].tinhThuong(cN[i]));
            }
        }
        sc.close();
    }
}
