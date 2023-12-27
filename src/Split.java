import java.util.Arrays;

public class Split {
    String[] newString;
    public static String[] splitUp(String s, String regex){

        int countKeys = 0;//поиск количества ключей-разделителей

        if(regex.contains("[") || regex.contains("]")){
            regex = regex.replace("[", "");
            regex = regex.replaceAll("]", "");
            countKeys = regex.length();//количество ключей-разделителей больше 1
        }

        //System.out.println(regex);

        int matches = 0;//количество совпадений ключа regex
        int[] keysIndex = new int[10];
        for(int i = 0; i < s.length(); i++){
            for(int k = 0; k < regex.length(); k++){
                if(s.charAt(i) == regex.charAt(k)){
                    keysIndex[matches] = i; //индекс совпадающего ключа в строке s
                    matches++;
                }
            }
        }

        int splitListIndex= 0;
        int m = 0, f = 0;

        String[] splitList = new String[matches * 2 + 1];

        while(m < s.length()){
            if(m == keysIndex[f]){
                splitList[splitListIndex] = "" + s.charAt(m);
                splitListIndex++;
                m++;
                f++;
            } else if(m < keysIndex[f]){
                splitList[splitListIndex] = s.substring(m, keysIndex[f]);
                splitListIndex++;
                splitList[splitListIndex] = "" + s.charAt(keysIndex[f]);
                splitListIndex++;
                m = keysIndex[f] + 1;
                if(f < keysIndex.length - 1){
                    f++;
                }

            } else if(m > keysIndex[f]){
                splitList[splitListIndex] = s.substring(m);
                break;
            }
        }
        int notNullCount = 0;
        for(int i = 0; i < splitList.length; i++){
            if(splitList[i] != null){
                notNullCount++;
            }
        }
        String[]finalSplitList = new String[notNullCount];
        for(int i = 0; i < splitList.length; i++){
            if(splitList[i] != null){
                finalSplitList[i] = splitList[i];
            }
        }

        return finalSplitList;
    }

    public static void main(String[] args) {
        String find = "a?b?gf#e";

        String[] finalList = Split.splitUp("a?b?gf#e", "[#?]");
        System.out.println("Исходная строка: " + find + " разделяется по ключам [#?].\n\tИтог:");
        for(int i = 0; i < finalList.length; i++){
            System.out.print(finalList[i] + "\t");
        }

    }
}
