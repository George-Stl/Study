import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;
    Account(){
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
    double getBalance(){
        return balance;
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
    void withdraw(double amount){
        this.balance -= amount;
    }
    void deposit(double amount){
        this.balance += amount;
    }

    public static void main(String[] args) {
        Account clientAccount = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        clientAccount.withdraw(2_500);
        clientAccount.deposit(3_000);
        System.out.println("Баланс счета после снятия 2500 и вклада 3000: " +
                clientAccount.getBalance() + " руб.\nЕжемесячные проценты счета: " +
                clientAccount.getMontlyInterest() + " руб.\nДата создания счета: " +
                clientAccount.getDateCreated());
    }
}
