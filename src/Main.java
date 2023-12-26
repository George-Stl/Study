import java.util.Scanner;

import static java.lang.System.out;


public class Main {

    public static void main(String[]args){

        Scanner input =new Scanner(System.in);
        String userString = input.nextLine();
        System.out.print(" = " + calc(userString));
    }




    public static String calc(String input){
        input = input.replaceAll("\\s","");
        int index = 0, counter = 0;
        int i, result;
        char mathSymbol;



        for (i = 0; i < input.length(); i++){
            mathSymbol = input.charAt(i);
            if (mathSymbol == '+' || mathSymbol == '-' ||
                    mathSymbol == '*' || mathSymbol == '/'){
                index = i;
                counter++;
            }
            if (counter != 1) {
                System.out.println("throws exception");
                break;
            }
        }


        mathSymbol = input.charAt(i);
        String value1 = input.substring(0, i);
        String value2 = input.substring(i + 1);


        int argument1 = Integer.parseInt(input.substring(0, i));
        int argument2 = Integer.parseInt(input.substring(i + 1));

        if (mathSymbol == '+'){
            result = argument1 + argument2;
        } else if (mathSymbol == '-'){
            result = argument1 - argument2;
        } else if (mathSymbol == '*'){
            result = argument1 * argument2;
        } else if (mathSymbol == '/'){
            result = argument1 / argument2;
        }

        if
        (input.contains("+") || input.contains("-") ||
                input.contains("*") || input.contains("/")){




        }




    return "1";

    }



}
