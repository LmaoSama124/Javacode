package Baitaponha.Thuake;

public class congNhan extends canBo{
    private int Bac;
    
    public void inPut() {
        super.inPut();
        System.out.print("So bac(rank) cua cong nhan la: ");
        this.Bac = Integer.parseInt(sc.nextLine());
    }

    public void outPut() {
        super.outPut();
        System.out.println(", Bac(rank): " + this.Bac);
    }
}
