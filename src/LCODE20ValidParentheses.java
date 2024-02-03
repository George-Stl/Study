import java.util.*;
public class LCODE20ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('(', 1);
        m.put(')', -1);
        m.put('{', 100);
        m.put('}', -100);
        m.put('[', 10000);
        m.put(']', -10000);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i);
            if(m.get(s.charAt(i)) < 0){
                String sub = s.substring(0, i);
                if(m.get(s.charAt(i)) == -1 && ((s.lastIndexOf('(') - i) % 2 == 1)){
                } else if(m.get(s.charAt(i)) == -100 && ((s.lastIndexOf('{') - i) % 2 == 1)){
                } else if(m.get(s.charAt(i)) == -10000 && ((s.lastIndexOf('[') - i) % 2 == 1)){
                } else return false;

            }
        }
        return sum == 0;
    }
}