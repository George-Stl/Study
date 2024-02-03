import java.util.Scanner;

public class TestLoanClass {
    /** Метод main */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Создать объект типа Loan
        Loan loan = new Loan();
        boolean illegalArguments = true;
        while(illegalArguments){
            // Получить годовую процентную ставку
            System.out.print("Введите годовую процентную ставку, например, 8.25: ");
            double annualInterestRate = input.nextDouble();

            // Получить срок кредита в годах
            System.out.print("Введите срок кредита в годах: ");
            int numberOfYears = input.nextInt();

            // Получить сумму кредита
            System.out.print("Введите сумму кредита в руб., например, 120000.95: ");
            double loanAmount =  input.nextDouble();
            try{
                loan.setAnnualInterestRate(annualInterestRate);
                loan.setNumberOfYears(numberOfYears);
                loan.setLoanAmount(loanAmount);
                illegalArguments = false;

            }catch(IllegalArgumentException ex){
                System.out.println(ex);
                input.nextLine();
            }

        }

        // Отобразить дату взятия, ежемесячный платеж и общую стоимость кредита
        System.out.println("Дата взятия кредита: " + loan.getLoanDate().toString());
        System.out.println("Ежемесячный платеж по кредиту равен "
                + (int)(loan.getMonthlyPayment() * 100) / 100.0 + " руб.");
        System.out.println("Общая стоимость кредита равна "
                + (int)(loan.getTotalPayment() * 100) / 100.0 + " руб.");
    }
}