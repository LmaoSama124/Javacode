package Baitaptuan3;

import java.util.Scanner;

public class Congnhan {
    static Scanner sc = new Scanner(System.in);
    private String hoTen, tuoi, diaChi;
    private int tienLuong, tongSoGioLamViec;

    public Congnhan() {
    }

    public Congnhan(String hoTen, String tuoi, String diaChi, int tienLuong, int tongSoGioLamViec) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLamViec = tongSoGioLamViec;
    }

    public void inPut() {
        System.out.print("Nhap ho ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        this.tuoi = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhap tien luong: ");
        this.tienLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap tong so gio lam viec: ");
        this.tongSoGioLamViec = Integer.parseInt(sc.nextLine());
    }

    public void outPut() {
        System.out.print("Ho ten: " + hoTen + ", Tuoi: " + tuoi + ", Dia chi: " + diaChi + ", Tien luong: "
                + tienLuong + ", So gio lam viec: " + tongSoGioLamViec);
    }

    public int tinhThuong(Congnhan cN) {
        if(cN.tongSoGioLamViec>=200) return tienLuong*2;
        else if(cN.tongSoGioLamViec >=100) return tienLuong;
        else return 0;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getTienLuong() {
        return tienLuong;
    }

    public int getTongSoGioLamViec() {
        return tongSoGioLamViec;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTienLuong(int tienLuong) {
        this.tienLuong = tienLuong;
    }

    public void setTongSoGioLamViec(int tongSoGioLamViec) {
        this.tongSoGioLamViec = tongSoGioLamViec;
    }

}
