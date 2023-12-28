import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double[] bankAccounts;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    public Account(){
        bankAccounts = new double[10];
        Arrays.fill(bankAccounts, 10_000);
        dateCreated = new Date();
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    double getBalance(int ID){

        return bankAccounts[ID];
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public static void setAnnualInterestRate(double AnnualInterestRate){
        Account.annualInterestRate = AnnualInterestRate;
    }
    Date getDateCreated(){
        return dateCreated;
    }
    double getMontlyInterest(){
        return (balance * (annualInterestRate / 12 / 100));
    }
    void withdraw(int ID, double amount){
        this.bankAccounts[ID] -= amount;

    }
    void deposit(int ID, double amount){
        this.bankAccounts[ID] += amount;

    }

    public static void main(String[] args) {
        Account newAccount = new Account();
        while(true){
            System.out.print("Введите ID: ");
            Scanner input = new Scanner(System.in);
            int userId = input.nextInt();
            if(userId < 0 || userId > 9){
                System.out.print("Введите значение ID от 0 до 9: ");
                userId = input.nextInt();
            }
            while(true){
                System.out.print("Основное меню\n" +
                        "1: проверить баланс счета\n" +
                        "2: снять со счета\n" +
                        "3: положить на счет\n" +
                        "4: выйти\n" +
                        "Введите пункт меню: ");
                int menu = input.nextInt();
                if(menu == 1){
                    System.out.print("Баланс равен " + newAccount.getBalance(userId));
                } else if(menu == 2){
                    System.out.print("Введите сумму для снятия со счета: ");
                    double sum = input.nextDouble();
                    newAccount.withdraw(userId, sum);
                } else if(menu == 3){
                    System.out.print("Введите сумму для внесения на счет: ");
                    double sum= input.nextDouble();
                    newAccount.deposit(userId, sum);
                } else if(menu == 4){
                    break;
                } else {
                    System.out.println("Введено неверное значение");
                    continue;
                }
                System.out.println("\n");
            }

        }

        /*Account clientAccount = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        clientAccount.withdraw(2_500);
        clientAccount.deposit(3_000);
        System.out.println("Баланс счета после снятия 2500 и вклада 3000: " +
                clientAccount.getBalance() + " руб.\nЕжемесячные проценты счета: " +
                clientAccount.getMontlyInterest() + " руб.\nДата создания счета: " +
                clientAccount.getDateCreated());*/
    }
}
