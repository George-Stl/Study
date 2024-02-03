import java.util.Random;
public class UseRandom {
    public static void main(String[] args) {
        Random randomObject = new Random(1000);
        for (int j = 0; j < 5; j++){
            for (int i = 0; i < 10; i++){
                System.out.print(randomObject.nextInt(100) + " ");
            }
            System.out.println();
        }
        Random randomObject2 = new Random(1000);
        System.out.println("\nВторой объект random со случайным значением 1000: \n");
        for (int j = 0; j < 5; j++){
            for (int i = 0; i < 10; i++){
                System.out.print(randomObject2.nextInt(100) + " ");
            }
            System.out.println();
        }
    }
}
