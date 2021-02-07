package crud;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LableRepository {
    File file = new File("lables.txt");


    Label getByld(Long id) {
        List<String> lines = new ArrayList<>();
        String name = null;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = br.readLine();
                if (line == null) { break; }
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
                if (line == null) {break;}
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
        long newID;
        List<String> lines = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String line = br.readLine();
                if (line == null) { break; }
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
        if(lines.size() == 0){
            newID = 1;
        } else{
            newID = Long.parseLong(lines.get(lines.size() - 1).substring(0, lines.get(lines.size() - 1).
                indexOf(',',0))) + 1;
        }
        //Не получается сделать через стрим
//        newID = Long.parseLong(lines.stream().skip(lines.size() - 1).findAny().
//                map((n) -> (n.substring(0,lines.get(lines.size() - 1).indexOf(',',0)))).orElse("0")) + 1L;

        l.setId(newID);

        try(FileWriter fw = new FileWriter(file,true))
        {
           fw.write(convertLabeltoString(l) + "\n");
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

        String linesStream = lines.stream().filter((n) -> (n.startsWith(Long.toString(l.getId())))).findFirst().orElse("Нет такого  id");
        lines.set(lines.indexOf(linesStream), linesStream.substring(0, 3) + l.getName());

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
                if (line == null) {break;}
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

        lines.removeIf((n)->(n.startsWith(Long.toString(id))));

        try (FileWriter fw = new FileWriter(file,false)) {
                for (String s : lines){
                    fw.write(s + "\n");}
            } catch (IOException e) {
                System.out.println("Произошла ошибка ввода-вывода");
            }
        }

        private String convertLabeltoString(Label l){
            String line = l.getId() + ", " + l.getName();
            return line;
        }
    }

