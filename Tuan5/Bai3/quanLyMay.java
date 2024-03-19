package Tuan5.Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quanLyMay {
    static Scanner sc = new Scanner(System.in);

    public void searchIBM(ArrayList<mayTinh> amT) {
        for (mayTinh x : amT) {
            if (x.getTenNSX().toUpperCase().equals("IBM")) {
                x.outPut();
            }
        }
    }

    public void addToList(ArrayList<mayTinh> amT, int n) {
        System.out.println("Nhap may tinh vao mang!!!");
        for (int i = 0; i < n; i++) {
            mayTinh mT = new mayTinh();
            mT.inPut();
            amT.add(mT);
            System.out.println();
        }
    }


    public void sapXepTangGia(ArrayList<mayTinh> amT) {
        Collections.sort(amT, new Comparator<mayTinh>() {
            @Override
            public int compare(mayTinh mT1, mayTinh mT2) {
                return Double.compare(mT1.getGiaThanh(), mT2.getGiaThanh());
            }
        });
    }

    public void removeIntel(ArrayList<mayTinh> amT) {
        for(int i=0;i<amT.size();i++){
            if(amT.get(i).getTenNSX().toUpperCase().equals("INTEL")){
                amT.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        quanLyMay qLM = new quanLyMay();
        System.out.print("Nhap vao so may tinh: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<mayTinh> amT = new ArrayList<mayTinh>();
        qLM.addToList(amT, n);

        System.out.println("Nhung may do IBM san xuat la!!!");
        qLM.searchIBM(amT);
        
        qLM.sapXepTangGia(amT);
        System.out.println("\nDay sau khi sap xep");
        for(mayTinh x: amT){
            x.outPut();
        }

        qLM.removeIntel(amT);
        System.out.println("\nDay sau khi xoa het Intel la!!!");
        for (mayTinh mayTinh : amT) {
            mayTinh.outPut();
        }
    }
}
