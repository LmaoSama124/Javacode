package Tuan5.Bai1;

public class giangVien extends nguoi {
    private int luongMotGioDay, soGioDayTrongMotThang;
    private String lopDay, caDay;

    public giangVien() {
    }

    public giangVien(String ten, String caDay, String gioiTinh, String ngaySinh, String diaChi, String lopDay,
            int luongMotGioDay,
            int soGioDayTrongMotThang) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.lopDay = lopDay;
        this.luongMotGioDay = luongMotGioDay;
        this.soGioDayTrongMotThang = soGioDayTrongMotThang;
        this.caDay = caDay;
    }

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("Nhap lop day: ");
        lopDay = sc.nextLine();
        System.out.print("Nhap ca day: ");
        caDay = sc.nextLine();
        System.out.print("Luong day trong 1 gio: ");
        luongMotGioDay = Integer.parseInt(sc.nextLine());
        System.out.print("So gio day trong 1 thang: ");
        soGioDayTrongMotThang = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Lop day: " + lopDay);
        System.out.println("Ca day: " + caDay);
        System.out.println("Luong moi gio: " + luongMotGioDay);
        System.out.println("So gio day mot thang: " + soGioDayTrongMotThang);
    }

    public double tinhLuong(giangVien gV) {
        if(gV.caDay.toUpperCase().equals("SANG")||gV.caDay.toUpperCase().equals("CHIEU")){
            return gV.luongMotGioDay * gV.soGioDayTrongMotThang;
        }
        else if(gV.caDay.toUpperCase().equals("TOI")){
            return gV.luongMotGioDay * gV.soGioDayTrongMotThang + 200000;
        }
        else return 0;
    }

    public int getLuongMotGioDay() {
        return luongMotGioDay;
    }

    public void setLuongMotGioDay(int luongMotGioDay) {
        this.luongMotGioDay = luongMotGioDay;
    }

    public int getSoGioDayTrongMotThang() {
        return soGioDayTrongMotThang;
    }

    public void setSoGioDayTrongMotThang(int soGioDayTrongMotThang) {
        this.soGioDayTrongMotThang = soGioDayTrongMotThang;
    }

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public String getCaDay() {
        return caDay;
    }

    public void setCaDay(String caDay) {
        this.caDay = caDay;
    }

    
}
