import java.util.Scanner;


public class Main {

    public static void main(String[]args) throws Exception {

        String userString;
        Scanner input =new Scanner(System.in);
        System.out.print("Введите выражение для вычисления: ");
        while(true) {
            userString = input.nextLine();
            if(!userString.isEmpty())
                break;
        }


        System.out.print(" = " + calc(userString));
    }


    public static String calc(String input) throws Exception{
        input = input.replaceAll("\\s","");
        int index = 0, counter = 0, result = 0;
        int i;
        char mathSymbol;
        int argument1 = 0, argument2 = 0;
        boolean choice;
        String resultString = "";



        for (i = 0; i < input.length(); i++) {
            mathSymbol = input.charAt(i);
            if (mathSymbol == '+' || mathSymbol == '-' || mathSymbol == '*' || mathSymbol == '/') {
                index = i;
                counter++;
            }
        }
        if (counter < 1) {
            System.out.println("Строка не является математической операцией, удовлетворяющей заданию");
            throw new Exception();
        } else if (counter > 1){
            System.out.println("Формат математической операции не удовлетворяет заданию");
            throw new Exception();
        }

        mathSymbol = input.charAt(index);
        String value1 = input.substring(0, index);
        String value2 = input.substring(index + 1);

        char checkValue1 = value1.charAt(0);
        char checkValue2 = value2.charAt(0);

        if(Character.isDigit(checkValue1) && Character.isDigit(checkValue2)) {

            if (isInt(value1) && isInt(value2)){
            }else{
                System.out.println("Калькулятор работает только с целыми числами");
                throw new Exception();
            }

            argument1 = Integer.parseInt(value1);
            argument2 = Integer.parseInt(value2);

            choice = true; //в result должны быть арабские числа


        } else if (Character.isLetter(checkValue1) && Character.isLetter(checkValue2)) {
            choice = false;//в result должны быть римские числа
            value1 = value1.toUpperCase();
            value2 = value2.toUpperCase();

            switch (value1) {
                case "I" -> argument1 = 1;
                case "II" -> argument1 = 2;
                case "III" -> argument1 = 3;
                case "IV" -> argument1 = 4;
                case "V" -> argument1 = 5;
                case "VI" -> argument1 = 6;
                case "VII" -> argument1 = 7;
                case "VIII" -> argument1 = 8;
                case "IX" -> argument1 = 9;
                case "X" -> argument1 = 10;
            }

            switch (value2) {
                case "I" -> argument2 = 1;
                case "II" -> argument2 = 2;
                case "III" -> argument2 = 3;
                case "IV" -> argument2 = 4;
                case "V" -> argument2 = 5;
                case "VI" -> argument2 = 6;
                case "VII" -> argument2 = 7;
                case "VIII" -> argument2 = 8;
                case "IX" -> argument2 = 9;
                case "X" -> argument2 = 10;
            }

        } else {
            System.out.println("Неверно, используются разные системы счисления");
            throw new Exception();
        }

        if((argument1 > 10 || argument1 < 1) || (argument2 < 1 || argument2 > 10)){
            System.out.println("Введенные значения должны быть в диапазоне от \"1\" до \"10\"");
            throw new Exception();
        }



        if (mathSymbol == '+'){
            result = argument1 + argument2;
        } else if (mathSymbol == '-'){
            result = argument1 - argument2;
        } else if (mathSymbol == '*'){
            result = argument1 * argument2;
        } else if (mathSymbol == '/'){
            result = argument1 / argument2;
        }

        if(!choice && result <= 0){
            System.out.println("В римской системе нет чисел меньше единицы");
            throw new Exception();
        }


        if(choice)
            resultString = result + "";
        else {
            if (result / 10 >= 1 && result / 10 < 4){
                for(int k = 1; k <= (result / 10); k++) {
                    resultString += "X";
                }
            } else if (result / 10 == 4){
                resultString += "XL";
            } else if (result / 10 >= 5 && result / 10 <9){
                resultString += "L";
                for (int k = 5; k < (result / 10); k++) {
                    resultString += "X";
                }
            } else if (result / 10 == 9){
                resultString += "XC";
            } else if (result == 100){
                resultString = "C";
                return resultString;
            }




            if (result % 10 >= 1 && result % 10 < 4){
                for(int k = 1; k <= (result % 10); k++) {
                    resultString += "I";
                }
            } else if (result % 10 ==4){
                resultString += "IV";
            } else if(result % 10 >= 5 && result % 10 <9){
                resultString += "V";
                for (int k = 5; k < (result % 10); k++){
                    resultString += "I";
                }
            } else if(result % 10 == 9)
                resultString += "IX";
        }

        return resultString;

    }
    public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;

        }
    }
}
