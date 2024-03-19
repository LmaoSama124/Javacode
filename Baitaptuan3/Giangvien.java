package Baitaptuan3;

import java.util.Scanner;

public class Giangvien {
    static Scanner sc = new Scanner(System.in);
    private String hoTen, ngaySinh, gioiTinh, khoa, trinhDo;
    private int phuCap, soTietDay, heSoLuong;

    private void nhap() {
        sc.nextLine();
        System.out.print("Nhap ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Gioi tinh");
        this.gioiTinh = sc.nextLine();
        System.out.print("Khoa: ");
        this.khoa = sc.nextLine();
        System.out.print("Trinh do: ");
        this.trinhDo = sc.nextLine();
        System.out.print("Phu cap: ");
        this.phuCap = sc.nextInt();
        System.out.print("So tiet day: ");
        this.soTietDay = sc.nextInt();
        System.out.print("He so luong: ");
        this.heSoLuong = sc.nextInt();
    }

    private void xuat() {
        System.out.println("Nhap ten: " + hoTen +
                ", Ngay sinh: " + ngaySinh +
                ", Gioi tinh: " + gioiTinh +
                ", Khoa: " + khoa +
                ", Trinh do: " + trinhDo +
                ", Phu cap: " + phuCap +
                ", So tiet day: " + soTietDay +
                ", He so luong: " + heSoLuong);
    }

    private static int luongPhaiTra(Giangvien gv) {
        int luong=gv.heSoLuong * 1400000 + gv.phuCap + gv.soTietDay*45000;
        return luong;
    }

    public static void main(String[] args) {
        System.out.print("So gian vien hien co: ");
        Giangvien gv[]= new Giangvien[sc.nextInt()];
        for(int i=0;i<gv.length;i++){
            gv[i]=new Giangvien();
            gv[i].nhap();
        }
        for(int i=0;i<gv.length;i++){
            gv[i].xuat();
        }
        int tongLuong=0;
        for(int i=0;i<gv.length;i++){
            System.out.println("Luong cua giang vien "+ gv[i].hoTen + " la: " + luongPhaiTra(gv[i]));;
            tongLuong+=luongPhaiTra(gv[i]);
        }
        System.out.println("Tong luong phai tra la: "+tongLuong); 
    }
}
