package main.java.com.timon1983.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext){
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

class DirListOnly{
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");
        String s[] = f1.list(only);
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}
