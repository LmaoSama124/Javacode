package Baitaptuan3;

import java.util.Scanner;

public class Sinhvien {
    static Scanner sc = new Scanner(System.in);
    private String hoTen, ngaySinh, queQuan, nganhHoc;
    private int namNhapHoc;

    private void nhap() {
        sc.nextLine();
        System.out.print("Nhap ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = sc.nextLine();
        System.out.print("Nhap que quan: ");
        this.queQuan = sc.nextLine();
        System.out.print("Nhap nganh hoc: ");
        this.nganhHoc = sc.nextLine();
        System.out.print("Nhap nam nhap hoc: ");
        this.namNhapHoc = sc.nextInt();
    }

    private void xuat() {
        System.out.println("Ho va ten: " + hoTen + ", Ngay sinh: " + ngaySinh + ", Quen quan: " + queQuan
                + ", Nganh hoc: " + nganhHoc + ", Nam nhap hoc: " + namNhapHoc);
    }

    private static int namNhapHocGanNhat(Sinhvien[] sv){
        int max=0;
        for(int i=0;i<sv.length;i++){
            if(sv[i].namNhapHoc>max && sv[i].namNhapHoc<=2024) max=sv[i].namNhapHoc;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print("Nhap vao so sinh vien: ");
        Sinhvien sv[] = new Sinhvien[sc.nextInt()];
        for (int i = 0; i < sv.length; i++) {
            sv[i] = new Sinhvien();
            sv[i].nhap();
        }
        System.out.println("Nhung sinh vien co nam nhap hoc gan nhat la:");
        for (int i=0;i<sv.length;i++){
            if(sv[i].namNhapHoc==namNhapHocGanNhat(sv)){ 
                sv[i].xuat();
            }
        }
    }
}
