package Tuan5.Bai2;

public class thiSinh extends nguoi {
    private String soBaoDanh;
    private int diemToan, diemLy, diemHoa;
    @Override
    public void inPut() {
        super.inPut();
        System.out.print("Nhap so bao danh: "); soBaoDanh=sc.nextLine();
        System.out.print("Nhap diem toan: "); diemToan=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap diem ly: "); diemLy=Integer.parseInt(sc.nextLine());
        System.out.print("Nhap diem hoa: "); diemHoa=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("So bao danh: " + soBaoDanh);
        System.out.println("Diem toan: " + diemToan + ", Diem ly: " + diemLy + ", Diem hoa: " + diemHoa);
    }

    public boolean xetDiem(double diemChuan) {
        if((diemHoa + diemLy + diemToan)>=diemChuan) return true;
        else return false;
    }
}
