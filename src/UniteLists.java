import java.util.Scanner;
import java.util.ArrayList;

public class UniteLists {
    public static ArrayList<Integer> union(ArrayList<Integer> list1,
                                           ArrayList<Integer> list2){
        list1.addAll(list2);
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Введите 5 элементов первого списка: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            list1.add(input.nextInt());
        }
        System.out.println("Введите 5 элементов второго списка: ");
        for(int i = 0; i < 5; i++){
            list2.add(input.nextInt());
        }
        System.out.println("Списки: " + list1 + "\n" + list2);
        System.out.println("Объединенный список равен: " + union(list1, list2));
        System.out.println(("Списки после объединения: " + list1 +
                "\n" + list2));
    }
}
