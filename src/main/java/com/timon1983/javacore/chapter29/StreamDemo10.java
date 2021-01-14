package chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");
        Stream<String> myStream = myList.stream();
        Spliterator<String> itr = myStream.spliterator();
        Spliterator<String> itr2 = itr.trySplit();
        if(itr2 != null){
            System.out.println("Результат выводимый итератором itr2: ");
            itr2.forEachRemaining((n) -> System.out.println(n));
        }
        System.out.println("Результат выводимый итератором itr: ");
        itr.forEachRemaining((n) -> System.out.println(n));
    }
}
