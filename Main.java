import generics.Box2P;

import java.util.ArrayList;

/**
 * @author Tegneryadnov_VI
 * @version 21
 * @ Java Дженерик класс с несколькими параметрами
 */
public class Main {
    public static void main(String[] args) {
        // параметризируем класс типом String для ключа и значения
        Box2P<String, String> sample1 = new Box2P<>("имя", "Нетология");
        System.out.println(sample1);
        // параметризируем класс типом Integer для ключа и Boolean для значения
        Box2P<Integer, Boolean> sample2 = new Box2P<>(1, Boolean.TRUE);
        System.out.println(sample2);

        ArrayList<Box2P<String, Integer>> list1 = new ArrayList<>();
        // Операция list1.add(sample1);
        // вызывает ошибку, т.к. ArrayList типизирован классом дженериком типа Box2P<String, Integer>. а не
        // Box2P<String, String>
        // Аналогичная ситуация для list1.add(sample2). Типизация ArrayList не соответствует Box2P<Integer, Boolean>

        // Правильные варианты
        ArrayList<Box2P<String, String>> list2 = new ArrayList<>();
        list2.add(sample1);
        ArrayList<Box2P<Integer, Boolean>> list3 = new ArrayList<>();
        list3.add(sample2);
    }
}
