import java.util.ArrayList;
import java.util.Scanner;

public class ContainerSort {
    public static void container(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            int temp = 0;
            temp += list.remove(i);
            int result = 10 - temp;
            while(result >= 0 ){
                if(list.contains(result)){
                    temp += list.remove(list.indexOf(result));
                    System.out.println("Контейнер содержит предметы с весом: ");
                }
            }
            if(list.)
        }
        do{

        }while(!list.isEmpty());
    }
}
