import java.math.*;

public class Exercise11 {
    static String s = "1";

    public static void main(String[] args) {
        for (int i = 0; i < 49; i++) {
            s += 0;
        }
        BigInteger checkNumber = new BigInteger(s);
        System.out.println(checkNumber);
        /*int n = 0;
        while (n < 1){
            checkNumber.add(BigInteger.ONE);
            s = checkNumber.toString();
            int count = 0;
            for (int i = 0; i < s.length(); i++){
                if(Integer.parseInt(s.substring(i, i + 1)) % 2 == 0 ||
                        Integer.parseInt(s.substring(i, i + 1)) % 3 == 0){
                    count++;
                }
            }
            if (count == 50){
                n++;
                System.out.println("Число " + n + ": " + checkNumber);

            }
        }*/
    }
}
