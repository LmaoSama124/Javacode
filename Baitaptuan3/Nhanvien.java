package Baitaptuan3;

import java.util.Scanner;

public class Nhanvien {
    static Scanner sc = new Scanner(System.in);
    private String hoTen, diaChi;
    private int tuoi, luong;
    public int namNhapHoc;
    public int heSoLuong;
    public int phuCap;
    public int soTietDay;

    private void nhap() {
        sc.nextLine();
        System.out.print("Nhap ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.tuoi = sc.nextInt();
        System.out.print("Nhap so tien luong: ");
        this.luong = sc.nextInt();
    }

    private void xuat() {
        System.out.println("Tên: " + hoTen + ", Dia chi: " + diaChi + ", Tuoi: " + tuoi + ", Luong: " + luong);
    }

    public static void main(String[] args) {
        System.out.print("Nhap vao so nhan vien: ");
        Nhanvien nv[]=new Nhanvien[sc.nextInt()];
        for(int i=0;i<nv.length;i++){
            nv[i]=new Nhanvien();
            nv[i].nhap();
        }

        System.out.println("Nhan vien co do tuoi < 30 va luong >= 500.00 la: ");
        for(int i=0;i<nv.length;i++){
            if(nv[i].tuoi<30 && nv[i].luong>=500000){
                nv[i].xuat();
            }
        }
    }
}
