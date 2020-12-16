package main.java.com.timon1983.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties deList = new Properties();
        deList.put("Флорида", "Телесси");
        deList.put("Висконсин", "Медисон");
        Properties capitals = new Properties(deList);
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

        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}
