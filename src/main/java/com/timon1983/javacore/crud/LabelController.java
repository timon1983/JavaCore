package crud;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LabelController {
    LableRepository lr = new LableRepository();


    Label checkSave(String name){
        Label l = new Label(0L, name);
        return lr.save(l);
    }

    Label checkGetByld(long id){
        return lr.getByld(id);
    }

    void checkGetAll(){
        List<Label> list = lr.getAll();
        list.stream().forEach(x -> System.out.println(x));
    }

    Label checkUpdate(long id, String name){
        Label l = new Label(id,name);
        return lr.update(l);
    }

    void checkDeleteByld(long id) {
        File file = new File("lables.txt");
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        for (String s : lines) {
            if (s.startsWith(Long.toString(id))) {
                lr.deleteByld(id);
                System.out.println("Запись с ID " + id + " удалено");
                new LabelView().dataIN();
            }
        }
        System.out.println("Нет записи с таким ID");
    }
}
