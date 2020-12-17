package main.java.com.timon1983.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemo{
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Ваштнгтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        Set<?> states = capitals.keySet();

        for(Object name : states){
            System.out.println("Столици штата " + name + " - " + capitals.getProperty((String)name) + ".");
        }
        System.out.println();

        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}