package chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e){
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone{
    String name;
    String phonenum;

    NamePhone(String n, String p){
        name = n;
        phonenum = p;
    }
}

class StreamDemo5{
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Ларри", "555-5555", "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Джеймс", "555-4444", "James@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Мери", "555-3333", "Mary@HerbShildt.com"));
        System.out.println("Исходные элементы из списка myList: ");
        myList.stream().forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum + " " + a.email);
        });
        System.out.println();

        Stream<NamePhone> nameAndPhone = myList.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        System.out.println("Список имен и номеров теефонов: ");
        nameAndPhone.forEach((a) -> {
            System.out.println(a.name + " " + a.phonenum);
        });

    }
}