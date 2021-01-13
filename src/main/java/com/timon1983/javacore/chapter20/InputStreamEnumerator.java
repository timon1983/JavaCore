package main.java.com.timon1983.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamEnumerator implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException e) {
            return null;
        }
    }
}

class SequenceInputStreamDemo{
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.add("file1.txt");
        files.add("file2.txt");
        files.add("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);

        try(InputStream input = new SequenceInputStream(ise);){
            while ((c = input.read()) != -1)
                System.out.print((char)c);
        }catch (NullPointerException e){
            System.out.println("Ошибка открытия файла.");
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        }
    }
