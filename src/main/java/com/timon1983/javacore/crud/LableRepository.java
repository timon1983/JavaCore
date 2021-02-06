package crud;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LableRepository {
    File file = new File("lables.txt");
    long countId = 0;

    Label getByld(Long id) {
        List<String> lines = new ArrayList<>();
        String name = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        String myStream = lines.stream().filter((n)->(n.startsWith(Long.toString(id)))).
                map((n) ->(n.substring(3))).findFirst().orElse("Нет такого id");

        return  new Label(id , myStream);
    }

    List<Label> getAll() {
        List<Label> lables = new ArrayList<>();
        Long idGet;
        String nameGet;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                idGet = (long)Character.getNumericValue(line.charAt(0));
                nameGet = line.substring(3);
                lables.add(new Label(idGet , nameGet));
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        return lables;
    }

    Label save(Label l) {
        l.setId(++countId);
        String line = l.getId() + ", " + l.getName();
        try(FileWriter fw = new FileWriter(file,true))
        {
           fw.write(line + "\n");
        }catch(IOException e){
            System.out.println("Произошла ошибка ввода-вывода");
        }
        return l;
    }

    Label update(Label l) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
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
                String update = s.substring(0, 3) + l.getName();
                lines.set(index, update);
            }
        }
        try (FileWriter fw = new FileWriter(file,false)) {
            for (String s : lines)
                fw.write(s + "\n");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        return l;
    }

    void deleteByld(Long id) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        List<String> removeStream = lines.stream().filter((n)->(!n.startsWith(Long.toString(id)))).
                collect(Collectors.toList());

        try (FileWriter fw = new FileWriter(file,false)) {
                for (String s : removeStream)
                    fw.write(s + "\n");
            } catch (IOException e) {
                System.out.println("Произошла ошибка ввода-вывода");
            }
        }
    }

