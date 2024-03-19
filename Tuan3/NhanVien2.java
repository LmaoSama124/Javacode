public class NhanVien2 {
    private int id;
    private String name;

    public NhanVien2(int id, String name) {
        this.id=id;
        this.name=name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        NhanVien2 nv1=new NhanVien2(3, "Lmao");
        nv1.display();
    }
}
