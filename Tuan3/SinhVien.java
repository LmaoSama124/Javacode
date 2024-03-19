import java.util.Scanner;

public class SinhVien {
    private int maSv;
    private String hoTen;
    private float diemTB;
    public static Scanner sc=new Scanner(System.in);

    public SinhVien(int maSv, String hoTen, float diemTB) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    public SinhVien() {

    }

    void input() {
        System.out.println("Nhap ma sv");this.maSv=sc.nextInt();
        sc.nextLine();
        System.out.println("NHap ho ten");this.hoTen=sc.nextLine();
        System.out.println("Nhap diem trung binh"); this.diemTB=sc.nextFloat();
    }

    void display() {
        System.out.println("Ma sinh vien: "+maSv+", ho va ten: "+hoTen+", diem trung binh: "+diemTB);
    }

    public static void main(String[] args) {
        SinhVien sv1=new SinhVien();
        sv1.input();
        sv1.display();
        SinhVien sv2=new SinhVien(221, "Dang Minh Trung", 10);
        sv2.display();
    }
}
