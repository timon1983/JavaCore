package main.java.com.timon1983.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile1 {
    public static void main(String[] args) throws IOException {
        int i;

        if(args.length != 2){
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])){
            {
                i = fin.read();
                if(i != -1)fout.write(i);
            }while (i != -1);
        }catch(IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
