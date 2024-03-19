package Tuan5.Bai4;

public class nhanVien extends nguoi {
    private double tienLuong, tongSoGioLam;
    private String phongBan;

    public nhanVien() {
    }

    public nhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, double tienLuong, double tongSoGioLam,
            String phongBan) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
        this.phongBan = phongBan;
    }

    public void inPut() {
        super.inPut();
        System.out.print("Nhap tien luong: ");
        tienLuong = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap tong so gio lam: ");
        tongSoGioLam = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap phong ban: ");
        phongBan = sc.nextLine();
    }

    public void outPut() {
        super.outPut();
        System.out.println(
                "Tien luong: " + tienLuong + ", Tong so gio lam: " + tongSoGioLam + ", Phong ban: " + phongBan);
    }

    public double tinhThuong() {
        if(tongSoGioLam>=200) return tienLuong*2;
        else if(tongSoGioLam >=100) return tienLuong;
        else return 0;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public double getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(double tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

}
