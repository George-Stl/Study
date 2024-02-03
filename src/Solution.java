import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем tree set
        Set<String> set = new TreeSet<>();

        // Добавляем элементы в tree set
        set.add("apple");
        set.add("banana");
        set.add("orange");
        // Попытка добавить повторяющийся элемент
        set.add("apple");
        // Печатаем tree set
        System.out.println("Tree set: " + set);
        // Удаляем элемент из tree set
        set.remove("banana");
        // Печатаем обновленный tree set
        System.out.println("Tree set: " + set);
    }

}