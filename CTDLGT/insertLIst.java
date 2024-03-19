package CTDLGT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class insertLIst {

    public void addToList(ArrayList<tft> aTFT, int n) {
        System.out.println("Nhap tuong vao mang!!!");
        for (int i = 0; i < n; i++) {
            tft tFT = new tft();
            tFT.inPut();
            aTFT.add(tFT);
            System.out.println();
        }
    }

    public void sapXepGiamDan(ArrayList<tft> aTFT) {
        Collections.sort(aTFT, (tFT2,tFT1) -> Double.compare(tFT1.getBac(), tFT2.getBac()));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<tft> aTFT=new ArrayList<tft>();
        insertLIst iL=new insertLIst();
        System.out.print("Nhap n: "); int n=sc.nextInt();
        iL.addToList(aTFT, n);
        iL.sapXepGiamDan(aTFT);
        for(tft T: aTFT){
            T.outPut();
        }
        sc.close();
    }
}
