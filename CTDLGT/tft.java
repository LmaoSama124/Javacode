package CTDLGT;

import java.util.Scanner;

public class tft {
    static Scanner sc=new Scanner(System.in);
    int bac;
    String tocHe;
    public tft() {
    }

    public tft(int bac, String tocHe) {
        this.bac = bac;
        this.tocHe = tocHe;
    }

    public void inPut() {
        System.out.print("Nhap bac vang: "); bac=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap toc he: "); tocHe=sc.nextLine();
    }

    public void outPut() {
        System.out.println("Bac: " + bac);
        System.out.println("Toc he: "+ tocHe);
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public String getTocHe() {
        return tocHe;
    }

    public void setTocHe(String tocHe) {
        this.tocHe = tocHe;
    }
}
