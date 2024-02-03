import java.util.ArrayList;

public class StringToArrayList {
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "list string";
        System.out.println("Строка после разделения: ");
        for(Character obj : toCharacterArray(s)){
            System.out.print("'" + obj + "', ");
        }
    }
}
