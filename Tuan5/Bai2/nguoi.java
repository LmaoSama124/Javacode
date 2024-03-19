package Tuan5.Bai2;

import java.util.Scanner;

public class nguoi {
    static Scanner sc = new Scanner(System.in);
    private String ngaySinh, ten, gioiTinh, diaChi, queQuan;

    public nguoi() {
    }

    public nguoi(String ten, String gioiTinh, String ngaySinh, String diaChi, String queQuan) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.queQuan = queQuan;
    }

    public void inPut() {
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap ngay sinh(form: xx/xx/xxxx): ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap vao que quan: ");
        queQuan = sc.nextLine();
    }

    public void outPut() {
        System.out.println("Ten: " + ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Que quan: " + queQuan);
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
