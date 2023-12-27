public class SolutionPalindrome {
    private boolean solution;
    public boolean isPalindrome(int x){//124
        int reverse = 0,count =0;
        if(x < 0){
            return false;
        }
        if (x == 0){
            return true;
        }
        while(x != 0){
            x /= 10;
            count++;
        }
        /*int k = 0;*/
        for(int i = count, k = (int)Math.pow(10, count - 1); i >= 1; i--, k /= 10){//3 2
            reverse += (x % 10) * k;
            x /= 10;

        }

        return reverse == x;

    }
}
