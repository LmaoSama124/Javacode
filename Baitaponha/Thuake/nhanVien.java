package Baitaponha.Thuake;

public class nhanVien extends canBo {
    private String congViec;

    public void inPut() {
        super.inPut();
        System.out.print("Cong viec la: ");
        this.congViec = sc.nextLine();
    }

    public void outPut() {
        super.outPut();
        System.out.println(", Cong viec: " + this.congViec);
    }
}
