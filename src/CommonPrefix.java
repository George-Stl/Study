public class CommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int stringLength = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            if (stringLength > strs[i].length())
                stringLength = strs[i].length();
        }
        for (int i = 0; i < stringLength; i++){
            int count = 0;
            for(int k = 1; k < strs.length; k++){
                if(strs[k - 1].charAt(i) != strs[k].charAt(i)) return result;
                else count++;

            }
            if(count == strs.length - 1){
                result += (String.valueOf(strs[0].charAt(i))) ;
            }
        }
        return result;
    }
}
