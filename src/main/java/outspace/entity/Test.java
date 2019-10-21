package outspace.entity;

import java.util.ArrayList;
import java.util.Arrays;


public class Test {
    public static void main(String[] args) {
        System.out.println(Enumer.valueOf("One"));
        System.out.println(Enumer.valueOf("One").getValue());
        System.out.println(Enumer.One.getValue());
        System.out.println(Arrays.asList(Enumer.values()));
    }
}

// enum Enumer {
//     One(1),
//     Two(2),
//     Three(3);
//
//     private final int name;
//
//     private Enumer(int s) { //приватный конструктор
//         name = s;
//     }
//
//     public int getValue() {//метод для получения значения
//         return name;
//     }
//}

enum Enumer {
    One(new ArrayList<String>()),
    Two(new ArrayList<String>()),
    Three(new ArrayList<String>());

    private final ArrayList<String> name;

    private Enumer(ArrayList<String> list) { //приватный конструктор
        name = list;
        name.add("a");
        name.add("b");
        name.add("b");
    }

    public ArrayList<String> getValue() { //метод для получения значения
        return name;
    }
}