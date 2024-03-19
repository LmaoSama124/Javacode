package Baitaponha.Thuake;

import java.util.ArrayList;
import java.util.Scanner;

public class quanLyCanBo {
    static Scanner sc = new Scanner(System.in);
    ArrayList<nhanVien> anV = new ArrayList<nhanVien>();
    ArrayList<kySu> akS = new ArrayList<kySu>();
    ArrayList<congNhan> acN = new ArrayList<congNhan>();

    static quanLyCanBo qLCB = new quanLyCanBo();

    public void addNhanVien() {
        while (true) {
            nhanVien nV = new nhanVien();
            System.out.println("Nhap vao list!!!");
            nV.inPut();
            anV.add(nV);
            System.out.println("Ban muon nhap tiep khong??? (yes or no)");
            String control = sc.nextLine();
            while (!control.equals("yes") && !control.equals("no")) {
                System.out.println("Nhap lai!!");
                control = sc.nextLine();
            }
            if (control.equals("no"))
                break;
        }
    }

    public void addKySu() {
        while (true) {
            kySu kS = new kySu();
            System.out.println("Nhap vao list!!!");
            kS.inPut();
            akS.add(kS);
            System.out.println("Ban muon nhap tiep khong??? (yes or no)");
            String control = sc.nextLine();
            while (!control.equals("yes") && !control.equals("no")) {
                System.out.println("Nhap lai!!");
                control = sc.nextLine();
            }
            if (control.equals("no"))
                break;
        }
    }

    public void addCongNhan() {
        while (true) {
            congNhan cN = new congNhan();
            System.out.println("Nhap vao list!!!");
            cN.inPut();
            acN.add(cN);
            System.out.println("Ban muon nhap tiep khong??? (yes or no)");
            String control = sc.nextLine();
            while (!control.equals("yes") && !control.equals("no")) {
                System.out.println("Nhap lai!!");
                control = sc.nextLine();
            }
            if (control.equals("no"))
                break;
        }
    }

    public void outNhanVien() {
        for (nhanVien x : anV) {
            x.outPut();
        }
    }

    public void outKySu() {
        for (kySu x : akS) {
            x.outPut();
        }
    }

    public void outCongNhan() {
        for (congNhan x : acN) {
            x.outPut();
        }
    }

    public void searchNameNhanVien(String name) {
        for (nhanVien x : anV) {
            if (x.getHoTen().equals(name)) {
                x.outPut();
            } else
                continue;
        }
    }

    public void searchNameKySu(String name) {
        for (kySu x : akS) {
            if (x.getHoTen().equals(name)) {
                x.outPut();
            } else
                continue;
        }
    }

    public void searchNameCongNhan(String name) {
        for (congNhan x : acN) {
            if (x.getHoTen().equals(name)) {
                x.outPut();
            } else
                continue;
        }
    }

    public static void main(String[] args) {
        System.out.println("Chon mode: Cong nhan || Nhan Vien || Ky su");
        boolean cont = true;
        do {
            String mode=sc.nextLine();
            switch (mode.toUpperCase()) {   
                case "NHAN VIEN": {
                    cont=true;
                    do {
                        System.out.println("1: Them || 2: Xuat ra list || 3: Tim Kiem || else: Out");
                        switch (Integer.parseInt(sc.nextLine())) {
                            case 1: {
                                qLCB.addNhanVien();
                                break;
                            }
                            case 2: {
                                qLCB.outNhanVien();
                                break;
                            }
                            case 3: {
                                System.out.print("Nhap ten can tim:");
                                String name = sc.nextLine();
                                qLCB.searchNameNhanVien(name);
                                break;
                            }
                            default:{
                                cont=false;
                                break;
                            }
                        }
                    } while (cont);
                    break;
                }

                case "KY SU": {
                    cont=true;
                    do {
                        System.out.println("1: Them || 2: Xuat ra list || 3: Tim Kiem || else: Out");
                        switch (Integer.parseInt(sc.nextLine())) {
                            case 1: {
                                qLCB.addKySu();
                                break;
                            }
                            case 2: {
                                qLCB.outKySu();
                                break;
                            }
                            case 3: {
                                System.out.print("Nhap ten can tim:");
                                String name = sc.nextLine();
                                qLCB.searchNameKySu(name);
                                break;
                            }
                            default:{
                                cont=false;
                                break;
                            }
                        }
                    } while (cont);
                    break;
                }

                case "CONG NHAN":{
                    cont=true;
                    do {
                        System.out.println("1: Them || 2: Xuat ra list || 3: Tim Kiem || else: Out");
                        switch (Integer.parseInt(sc.nextLine())) {
                            case 1: {
                                qLCB.addCongNhan();
                                break;
                            }
                            case 2: {
                                qLCB.outCongNhan();
                                break;
                            }
                            case 3: {
                                System.out.print("Nhap ten can tim:");
                                String name = sc.nextLine();
                                qLCB.searchNameCongNhan(name);
                                break;
                            }
                            default:{
                                cont=false;
                                break;
                            }
                        }
                    } while (cont);
                    break;
                }
                default:{
                    cont=false;
                    break;
                }
            }

        } while (cont);
    }
}
