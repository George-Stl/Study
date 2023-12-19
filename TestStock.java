public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("СБЕР", "ПАО Сбербанк");
        stock1.setParameters(281.50, 282.87);
        System.out.println("Клиент класса Stock:\nОбозначение: " + stock1.symbol +
                "\nНаименование: " + stock1.name + "\nСтоимость акций предыдущего дня: " +
                stock1.previousClosingPrice + "\nСтоимость акций в настоящий момент: " +
                stock1.currentPrice + "\nПроцент изменения стоимости акций: " + stock1.getChangePercent() + "%");
    }
}
