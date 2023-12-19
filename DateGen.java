import java.util.Date;

public class DateGen {
    public static void main(String[] args) {
        long elapseTime = 10000;
        Date date = new Date(elapseTime);
        do {
            System.out.println("Время для прошедшего времени, равного: " +
                    elapseTime + " - " + date.getTime() + "\n а с помощью метода toString(): " +
                    date.toString());
            elapseTime *= 10;
            date.setTime(elapseTime);
        } while (elapseTime < 1.0E11);


    }
}
