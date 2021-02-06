package crud;

public class Main {
    public static void main(String[] args) {
        LableRepository lr = new LableRepository();
        Label l1 = new Label(0L,"test1");
        System.out.println(lr.save(l1));
        Label l2 = new Label(0L,"test2");
        System.out.println(lr.save(l2));
        Label l3 = new Label(2L, "ABCD");
        System.out.println(lr.update(l3));
        lr.deleteByld(2L);
        System.out.println(lr.getByld(4L));
        System.out.println(lr.getAll());
    }
}
