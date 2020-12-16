package main.java.com.timon1983.javacore.chapter18;

import java.util.LinkedList;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Address(String n, String s, String c, String st, String cd){
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    @Override
    public String toString() {
        return name + "\n" +
                 street + "\n" + city + " " + state + " " + code;
    }
}

class MailList{
    public static void main(String[] args) {
        LinkedList<Address> m1 = new LinkedList<Address>();
        m1.add(new Address("J.M. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        m1.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        m1.add(new Address("Tom Carlton", "867 Elm St", "Champing", "IL", "61820"));

        for(Address element : m1) {
            System.out.println(element + "\n");
        }
           // System.out.println();
    }
}
