package Tuan5.Bai1;

import java.util.Scanner;

public class nguoi {
    static Scanner sc=new Scanner(System.in); 
    private String ngaySinh, ten, gioiTinh, diaChi;

    public nguoi() {
    }

    public nguoi(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }
    
    public void inPut() {
        System.out.print("Nhap ten: "); ten=sc.nextLine();
        System.out.print("Nhap gioi tinh: "); gioiTinh=sc.nextLine();
        System.out.print("Nhap ngay sinh(form: xx/xx/xxxx): "); ngaySinh=sc.nextLine();
        System.out.print("Nhap dia chi: "); diaChi=sc.nextLine();
    }

    public void outPut() {
        System.out.println("Ten: "+ ten);
        System.out.println("Gioi tinh: "+gioiTinh);
        System.out.println("Ngay sinh: "+ngaySinh);
        System.out.println("Dia chi: "+diaChi);
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
