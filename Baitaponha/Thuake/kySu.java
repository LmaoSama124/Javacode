package Baitaponha.Thuake;

public class kySu extends canBo{
    private String nganhDaoTao;

    public void inPut() {
        super.inPut();
        System.out.print("Nhap nganh dao tao: ");
        this.nganhDaoTao = sc.nextLine();
    }

    public void outPut() {
        super.outPut();
        System.out.println(", Nganh dao tao: " + this.nganhDaoTao);
    }
}
