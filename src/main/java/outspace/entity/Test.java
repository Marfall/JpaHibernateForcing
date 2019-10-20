package outspace.entity;

import java.util.Arrays;

/**
 * Created by root on 20.10.19.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Enumer.valueOf("One"));
        System.out.println(Enumer.valueOf("One").getValue());
        System.out.println(Enumer.One.getValue());
        System.out.println(Arrays.asList(Enumer.values()));
    }
}

 enum Enumer {
     One(1),
     Two(2),
     Three(3);

     private final int name;

     private Enumer(int s) { //приватный конструктор
         name = s;
     }

     public int getValue() {//метод для получения значения
         return name;
     }
}