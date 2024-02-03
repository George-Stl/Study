import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private GregorianCalendar calendar;

    public MyDate() {
        calendar = new GregorianCalendar();
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(long elapseTime){
        calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapseTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    private int getDay(){
        return day;
    }
    public void setDate(long elapseTime){
        calendar.setTimeInMillis(elapseTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.println("Для первой даты (конструктор по умолчанию): " + date1.getDay() +
                "" + date1.getMonth() + "." + date1.getYear());
        MyDate date2 = new MyDate(34355555133101L);
        System.out.println("Для второй даты (34355555133101L): " + date2.getDay() +
                "" + date2.getMonth() + "." + date2.getYear());
        MyDate date3 = new MyDate(1997, 7, 22);
        System.out.println("Для третьей даты (1997, 7, 22)): " + date3.getDay() +
                "" + date3.getMonth() + "." + date3.getYear());
        date2.setDate(5435554433L);
        System.out.println("Для второй даты с новым значением (5435554433L): " + date2.getDay() +
                "" + date2.getMonth() + "." + date2.getYear());

    }
}
