package main.java.com.timon1983.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs) throws IOException
    {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList{
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Home\\Desktop\\Обучение JAVA";
        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");
        try{
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода");
        }
    }
}