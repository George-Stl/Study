import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1and2 {

    private static final String[] months = {"январь", "февраль", "март", "апрель", "май",
            "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

    private static final int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /**
     * Метод main
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Введите порядковый номер месяца, от 1 до 12: ");

            try {
                // Получить порядковый номер месяца
                int monthNumber = input.nextInt();
                // Отобразить название и количество дней в соответствующем месяце
                System.out.println("Месяц: " + months[monthNumber - 1]);
                System.out.println("Количество дней: " + dom[monthNumber - 1]);
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                // Отобразить сообщение если введен неверный номер месяца
                System.out.println("Недопустимое число");
                // Считать символ новой строчки, созданный нажатием «Enter» после числа
                input.nextLine();
            }
        }
    }
}