package crud;


import java.util.List;
import java.util.stream.Stream;

public class LabelController {
    private LableRepository lr = new LableRepository();


    Label checkSave(String name) {
        Label l = new Label(0L, name);
        return lr.save(l);
    }

    Label checkGetByld(long id) {
        return lr.getByld(id);
    }

    void checkGetAll() {
        List<Label> list = lr.getAll();
        list.stream().forEach(x -> System.out.println(x));
    }

    Label checkUpdate(long id, String name) {
        Label l = new Label(id, name);
        return lr.update(l);
    }

    void checkDeleteByld(long id) {
        lr.deleteByld(id);

    }
}
