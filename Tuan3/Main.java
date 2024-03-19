import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        phanSo pS= new phanSo();
        System.out.println("Nhap tu so: ");
        pS.setTuSo(sc.nextInt());
        System.out.println("Nhap mau so: ");
        pS.setMauSo(sc.nextInt());
        pS.output();
        sc.close();
    }
}
