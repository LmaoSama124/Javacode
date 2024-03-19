package Tuan5.Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class quanLyNhanVien {
    public void addToList(ArrayList<nhanVien> aNV, int n) {
        System.out.println("Nhap nhan vien vao mang!!!");
        for (int i = 0; i < n; i++) {
            nhanVien nV = new nhanVien();
            nV.inPut();
            aNV.add(nV);
            System.out.println();
        }
    }

    public void outList(ArrayList<nhanVien> aNV) {
        for (nhanVien nV : aNV) {
            nV.outPut();
            System.out.println();
        }
    }

    public void sapXepTangDanTheoLuong(ArrayList<nhanVien> aNV) {
        Collections.sort(aNV, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien nV1, nhanVien nV2) {
                return Double.compare(nV1.getTienLuong(), nV2.getTienLuong());
            }
        });
    }

    public int demThuong(ArrayList<nhanVien> aNV) {
        int dem = 0;
        for (nhanVien nV : aNV) {
            if (nV.tinhThuong() > 0)
                dem++;
        }
        return dem;
    }

    public void xuatThuong(ArrayList<nhanVien> aNV) {
        System.out.println("So nhan vien duoc thuong la: " + demThuong(aNV));
        for (nhanVien nV : aNV) {
            if (nV.tinhThuong() > 0)
                nV.outPut();
        }
    }

    public int demNhanVienPhongKyThuat(ArrayList<nhanVien> aNV) {
        int dem = 0;
        for (nhanVien nV : aNV) {
            if (nV.getPhongBan().toUpperCase().equals("PHONG KY THUAT"))
                dem++;
        }
        return dem;
    }

    public void xuatPhongKeToan(ArrayList<nhanVien> aNV) {
        for (nhanVien nV : aNV) {
            if (nV.getPhongBan().toUpperCase().equals("PHONG KE TOAN"))
                nV.outPut();
        }
    }

    public double maxLuong(ArrayList<nhanVien> aNV) {
        double max = 0;
        for (nhanVien nV : aNV) {
            if (nV.getTienLuong() > max)
                max = nV.getTienLuong();
        }
        return max;
    }

    public void xuatMaxLuong(ArrayList<nhanVien> aNV) {
        for (nhanVien nV : aNV) {
            if (nV.getTienLuong() == maxLuong(aNV))
                nV.outPut();
        }
    }

    public void sapXepLuongPhongHanhChinh(ArrayList<nhanVien> aNV) {
        ArrayList<nhanVien> hanhChinh = new ArrayList<nhanVien>();
        for (nhanVien nV : aNV) {
            if (nV.getPhongBan().toUpperCase().equals("PHONG HANH CHINH"))
                hanhChinh.add(nV);
        }
        Collections.sort(hanhChinh, new Comparator<nhanVien>() {
            @Override
            public int compare(nhanVien nV1, nhanVien nV2) {
                return Double.compare(nV1.getTienLuong(), nV2.getTienLuong());
            }
        });
        for (nhanVien nV : hanhChinh) {
            nV.outPut();
        }
    }

    public void kiemTraThuPhuong(ArrayList<nhanVien> aNV) {
        for (nhanVien nV : aNV) {
            if (nV.getTen().toUpperCase().equals("NGUYEN THU PHUONG"))
                nV.outPut();
        }
    }

    public void chuyenLeTuan(ArrayList<nhanVien> aNV) {
        for (nhanVien nV : aNV) {
            if (nV.getTen().toUpperCase().equals("LE TUAN")
                    && nV.getPhongBan().toUpperCase().equals("PHONG KY THUAT")) {
                nV.setPhongBan("Phong hanh chinh");
            }
        }
    }

    public void xoaNguyenLeHang(ArrayList<nhanVien> aNV) {
        for(int i=0;i<aNV.size();i++){
            if(aNV.get(i).getTen().toUpperCase().equals("NGUYEN THU HANG"))
            aNV.remove(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nhan vien: ");
        int n = Integer.parseInt(sc.nextLine());
        quanLyNhanVien qLNV = new quanLyNhanVien();
        ArrayList<nhanVien> aNV = new ArrayList<nhanVien>();
        System.out.println("\n---Them vao danh sach---");
        qLNV.addToList(aNV, n);
        System.out.println("\n---Sap xep luong tang dan---");
        qLNV.sapXepTangDanTheoLuong(aNV);
        System.out.println("\n---Xuat day---");
        qLNV.outList(aNV);
        System.out.println("\n---Xuat thuong---");
        qLNV.xuatThuong(aNV);
        System.out.println("So nhan vien thuoc phong ky thuat la: " + qLNV.demNhanVienPhongKyThuat(aNV));
        System.out.println("\n---Nhung nhan vien co luong cao nhat la---");
        qLNV.xuatMaxLuong(aNV);
        System.out.println("\n---Nhan vien thuoc phong ke toan---");
        qLNV.xuatPhongKeToan(aNV);
        System.out.println("\n---Sap xep luong phong hanh chinh theo thu tu tang dan---");
        qLNV.sapXepLuongPhongHanhChinh(aNV);
        System.out.println("\n---Xuat thong tin nhan vien Nguyen Thu Phuong---");
        qLNV.kiemTraThuPhuong(aNV);
        System.out.println("\n---Chuyen Le Tuan sang phong hanh chinh & Xoa Nguyen Le Hang---");
        qLNV.chuyenLeTuan(aNV);
        qLNV.xoaNguyenLeHang(aNV);
        qLNV.outList(aNV);
        sc.close();
    }
}
