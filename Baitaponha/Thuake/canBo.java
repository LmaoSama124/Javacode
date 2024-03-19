package Baitaponha.Thuake;
import java.util.Scanner;

public class canBo {

    static Scanner sc=new Scanner(System.in);
    private String hoTen, diaChi, gioiTinh;
    private int tuoi;

    public void inPut() {
        System.out.print("Nhap ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("Gioi tinh: ");
        this.gioiTinh = sc.nextLine();
        System.out.print("Tuoi: ");
        this.tuoi = Integer.parseInt(sc.nextLine());
    }

    public void outPut() {
        System.out.print("Ho ten: " + this.hoTen + ", Dia chi: " + this.diaChi + ", Gioi tinh: " + this.gioiTinh
                + ", Tuoi: " + this.tuoi);
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }
    
}