package main.java.com.timon1983.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay their due taxes.";
        byte buf[] = source.getBytes();
        try(FileOutputStream f0 = new FileOutputStream("file4.txt");
            FileOutputStream f1 = new FileOutputStream("file5.txt");
            FileOutputStream f2 = new FileOutputStream("file6.txt");){
            for(int i=0; i<buf.length; i+=2) f0.write(buf[i]);
            f1.write(buf);
            f2.write(buf, buf.length-buf.length/4,buf.length/4);
        }catch (IOException e){
            System.out.println("Произоша ошибка ввода-вывода");
        }
    }
}
