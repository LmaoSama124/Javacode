package Tuan5.Bai3;

import java.util.Scanner;

public class May {
    private String tenNSX, diaChi, nhanHieu;
    private double giaThanh;
    static Scanner sc= new Scanner(System.in);

    public May() {
    }
    
    public May(String tenNSX, String diaChi, String nhanHieu, double giaThanh) {
        this.tenNSX = tenNSX;
        this.diaChi = diaChi;
        this.nhanHieu = nhanHieu;
        this.giaThanh = giaThanh;
    }

    public void inPut() {
        System.out.print("Nhap ten NSX: "); tenNSX=sc.nextLine();
        System.out.print("Nhap dia chi: "); diaChi=sc.nextLine();
        System.out.print("Nhap nhan hieu: "); nhanHieu=sc.nextLine();
        System.out.print("Nhap gia thanh: "); giaThanh=Double.parseDouble(sc.nextLine());
    }

    public void outPut() {
        System.out.println("Nha san xuat: "+ tenNSX);
        System.out.println("Dia chi: "+ diaChi);
        System.out.println("Nhap nhan hieu: "+ nhanHieu);
        System.out.println("Nhap gia thanh: "+ giaThanh);
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }
    
}
