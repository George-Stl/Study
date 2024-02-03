import java.util.Scanner;
public class TestAccountATM {
    private Account[] accounts = new Account[10];
    private static Scanner input = new Scanner(System.in);

    public TestAccountATM(){
        for(int i =0; i < accounts.length; i++){
            accounts[i] = new Account(i, 10_000);
        }
    }

    public static void main(String[] args) {
        TestAccountATM accountATM = new TestAccountATM();
        int id;
        while(true){
            System.out.print("Введите id: ");
            id = input.nextInt();
            if(id < 0 || id > 9) {
                System.out.println("Введите, пожалуйста, корректный id");
                continue;
            }
            while (true) {
                int choice = accountATM.getMenuSelection();
                if (choice == 1)
                    System.out.println("Баланс равен " +
                            accountATM.accounts[id].getBalance());
                else if (choice == 2)
                    accountATM.withdraw(id);
                else if (choice == 3)
                    accountATM.deposit(id);
                else
                    break;
            }
        }
    }
    public int getMenuSelection(){
        int choice;
        while(true){
            System.out.println("\nОсновное меню");
            System.out.println("1: проверить баланс счета");
            System.out.println("2: снять со счета");
            System.out.println("3: положить на счет");
            System.out.println("4: выйти");
            System.out.print("Введите пункт меню: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Вы ввели некорректный пункт меню!");
            }
            else {
                break;
            }
        }
        return choice;
    }
    public void withdraw(int id){
        System.out.print("Введите сумму для снятия со счета: ");
        double amount = input.nextDouble();
        if (amount < 0) {
            System.out.print("Сумма отрицательная! Операция отменена.");
        } else if (amount <= accounts[id].getBalance()) {
            accounts[id].withdraw(amount);
        } else {
            System.out.print("Недостаточно средств на счете! Операция отменена.");
        }
    }
    public void deposit(int id) {
        System.out.print("Введите сумму для внесения на счет: ");
        double amount = input.nextDouble();
        if (amount >= 0) {
            accounts[id].deposit(amount);
        }
        else {
            System.out.print("Сумма отрицательная! Операция отменена.");
        }
    }
}
