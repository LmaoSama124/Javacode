package Tuan5.Bai3;

public class mayTinh extends May {
    private double Speed, Ram, HDD;

    @Override
    public void inPut() {
        super.inPut();
        System.out.print("Toc do la: ");
        Speed = Double.parseDouble(sc.nextLine());
        System.out.print("Dung luong Ram la: ");
        Ram = Double.parseDouble(sc.nextLine());
        System.out.print("Dung luong HDD la: ");
        HDD = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Toc do la: " + Speed + ", Dung luong RAM: " + Ram + ", Dung luong HDD: " + HDD);
    }
    
}
