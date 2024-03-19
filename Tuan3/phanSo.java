import java.util.Scanner;

public class phanSo {

    private int tuSo;
    private int mauSo;
    static Scanner sc=new Scanner(System.in);

    public phanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public phanSo () {

    }

    void input() {
        System.out.print("Nhap tu so: ");
        this.tuSo=sc.nextInt();
        System.out.print("Nhap mau so: ");
        this.mauSo=sc.nextInt();
    }

    void output() {
        System.out.println("Phan so la: "+(float)tuSo/mauSo);
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
}
