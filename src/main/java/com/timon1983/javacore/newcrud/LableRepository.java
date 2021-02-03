package newcrud;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LableRepository {
    List<Label> listLabel = new ArrayList<>();
    Scanner comands = new Scanner(System.in);
    long idIn;
    String nameIn;

    void start() {
        System.out.println("1-Создать файл\n2-Получить имя по id\n3-Получить все записи\n" +
                "4-Сохранить файл\n5-Изменить запись\n6-Удалить запись\n7-Выход из программы");
        do {
            int run = comands.nextInt();
            switch (run) {
                case 1:
                    System.out.println("Создать запись");
                    System.out.println("Ввести ID");
                    idIn = comands.nextLong();
                    System.out.println("Ввести имя");
                    nameIn = comands.next();
                    setBuld(new Label(idIn, nameIn));
                    start();
                case 2:
                    System.out.println("Получить имя по id\nВвести id:");
                    idIn = comands.nextLong();
                    System.out.println(getBuld(idIn));
                    start();
                case 3:
                    System.out.println("Получить все записи");
                    System.out.println(getAll());
                    start();
                case 4:
                    System.out.println("Сохранить файл");
                    start();
                case 5:
                    System.out.println("Изменить запись\nВведите id");
                    idIn = comands.nextLong();
                    for (Label lab : listLabel) {
                        if (lab.getId() == idIn) {
                            update(lab);
                        }
                    }
                    start();
                case 6:
                    System.out.println("Удалить запись\nВведите id");
                    idIn = comands.nextLong();
                    deleteBuld(idIn);
                    start();
                case 7:
                    System.exit(0);
            }
        }
        while (true);
    }

    void setBuld(Label l) {
        listLabel.add(l);
        String label = l.getId() + ", " + l.getName() + "\n";
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("lables.txt", true)))) {
            out.print(label);
            save(l);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }

    Label getBuld(Long id) {
        Label buld = null;
        for (int i = 0; i < listLabel.size(); i++) {
            if (id == listLabel.get(i).getId()) {
                buld = listLabel.get(i);
            }
        }
        return buld;
    }

    List<Label> getAll() {
        return listLabel;
    }

    Label save(Label l) {
        return l;
    }

    Label update(Label l) {
        System.out.println("Введите новое имя");
        List<String> lines = new ArrayList<>();
        nameIn = comands.next();
        l.setName(nameIn);
        try (BufferedReader br = new BufferedReader(new FileReader(new File("lables.txt")))) {

            while (true) {
                String line = br.readLine();
                if (line == null) break;
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        for (String s : lines) {
            if (s.startsWith(Long.toString(l.getId()))) {
                int index = lines.indexOf(s);
                String update = s.substring(0, 3) + nameIn;
                lines.set(index, update);
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("lables.txt", false))) {
            for (String s : lines)
                bw.write(s + "\n");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        return l;
    }

    void deleteBuld(Long id) {
        Iterator<Label> iterator = listLabel.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getId()==id)
                iterator.remove();
        }
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(new File("lables.txt")))) {
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        Iterator<String> itr = lines.iterator();
        while (itr.hasNext()) {
            if (itr.next().startsWith(Long.toString(id))) {
                itr.remove();
            }
        }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("lables.txt", false))) {
                for (String s : lines)
                    bw.write(s + "\n");
            } catch (IOException e) {
                System.out.println("Произошла ошибка ввода-вывода");
            }
        }
    }

