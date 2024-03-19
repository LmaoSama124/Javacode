package Baitaptuan3;

import java.util.Scanner;

public class Doibong {
    static Scanner sc = new Scanner(System.in);
    private String tenDoiBong;
    private int soTranThang, soTranThua, soTranHoa;

    private void nhap() {
        sc.nextLine();
        System.out.print("Nhap ten doi bong: ");
        this.tenDoiBong = sc.nextLine();
        System.out.print("So tran thang: ");
        this.soTranThang = sc.nextInt();
        System.out.print("So tran hoa: ");
        this.soTranHoa = sc.nextInt();
        System.out.print("So tran thua: ");
        this.soTranThua = sc.nextInt();
    }

    private void xuat() {
        System.out.println("Ten doi bong: " + tenDoiBong + ", So tran thang: " + soTranThang + ", So tran thua: "
                + soTranThua + ", So tran hoa: " + soTranHoa);
    }

    private static Doibong top1(Doibong dB[]) {
        int max = 0;
        int pointer=0;
        for (int i = 0; i < dB.length; i++) {
            if(dB[i].soTranThang *3 + dB[i].soTranHoa > max) {
                max= dB[i].soTranThang*3 + dB[i].soTranHoa;
                pointer=i;
            }
        }
        return dB[pointer];
    }

    public static void main(String[] args) {
        System.out.print("Nhap so doi bong hien co: ");
        Doibong dB[] = new Doibong[sc.nextInt()];
        for(int i=0;i<dB.length;i++){
            dB[i]= new Doibong();
            dB[i].nhap();
        }
        System.out.println("Doi top 1 la: ");
        top1(dB).xuat();
    }

}
