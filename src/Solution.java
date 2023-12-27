public class Solution {
    public boolean isPalindrome(int x) {
        int count = 0; //размерность числа
        if (x == 0)
            return true;
        else if(x < 0)
            return false;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return palindrome(x, 0, count - 1);
    }
    public boolean palindrome(int x, int low,  int high){//x = 10, high = 1
        if(high <= low)
            return true;
        else if(getNthDigit(x, 10, high) != getNthDigit(x, 10, low))
            return false;
        else
            return palindrome(x, low + 1, high - 1);//(121, 1, 1)


    }
    public int getNthDigit(int number, int base, int n) {//метод извлечения из int числа с индексом "n"
        return (int) ((number / Math.pow(base, n)) % base);
    }
}