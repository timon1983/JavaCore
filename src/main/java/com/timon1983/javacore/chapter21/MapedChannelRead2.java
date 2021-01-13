package main.java.com.timon1983.javacore.chapter21;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MapedChannelRead2 {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;
        try{
            fIn = new FileInputStream("test.txt");
            fChan = fIn.getChannel();
            fSize = fChan.size();
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for(int i=0; i<fSize; i++)
                System.out.println((char)mBuf.get());
        }catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }finally {
            try{
                if(fChan != null) fChan.close();
            }catch (IOException e){
                System.out.println("Ошибка закрытия канала.");
            }
            try{
                if(fIn != null) fIn.close();
            }catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
