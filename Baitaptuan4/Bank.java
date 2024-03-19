package Baitaptuan4;

public class Bank {

    private double laiSuat;
    private String name="BIDV";
    public void laiSuat(double laiSuat){
        System.out.println("Ten ngan hang: "+ name);
        System.out.println("Lai suat la: "+laiSuat+" %");
    }
    public double getLaiSuat() {
        return laiSuat;
    }
    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }
    
}
