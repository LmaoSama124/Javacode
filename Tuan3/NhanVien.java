public class NhanVien {
    private int id;
    private String name;

    void display(int n) {
        this.id=n;
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        NhanVien nv1=new NhanVien();
        NhanVien nv2=new NhanVien();
        nv1.display(3);
        nv2.display(3);
    }
}