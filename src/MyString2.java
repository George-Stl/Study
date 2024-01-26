import java.util.Arrays;
public class MyString2 {
    private char[] chars;
    public MyString2(char[] chars){
        this.chars = Arrays.copyOf(chars, chars.length);

    }
    public MyString2 substring(int begin){
        char[] subChar = new char[this.chars.length - begin];
        for(int i = begin, k = 0; i < this.chars.length; i++, k++){
            subChar[k] = this.chars[i];
        }
        return new MyString2(subChar);
    }
    public MyString2 toUpperCase(){
        char[] toUpperChar = new char[this.chars.length];
        for(int i = 0; i < this.chars.length; i++){
            if((int)this.chars[i] >= 97 && (int)this.chars[i] <= 122){
                toUpperChar[i] =  (char)(((int)this.chars[i] - 32));
            } else{
                toUpperChar[i] = this.chars[i];
            }
        }
        return new MyString2(toUpperChar);
    }
    public char[] toChars(){
        return this.chars;
    }
    public static MyString2 valueOf(Boolean b){
        char[]booleanChar;
        if(b){
            booleanChar = new char[]{'t','r','u','e'};
        }else{
            booleanChar = new char[]{'f','a','l','s','e'};
        }
        return new MyString2(booleanChar);
    }

    public static void main(String[] args) {
        MyString2 myString= new MyString2(new char[]{'1', '2', 'a','B', 'c'});
        System.out.print("Введенная переменная myString2: ");
        for(int i = 0; i < myString.chars.length; i++){
            System.out.print(myString.chars[i] + " ");
        }
        System.out.println();
        System.out.print("Метод substring(2): ");
        for(int i = 0; i < myString.substring(2).chars.length; i++){
            System.out.print(myString.substring(2).chars[i] + " ");
        }
        System.out.println();
        System.out.print("Метод toUpperCase: ");
        for(int i = 0; i < myString.chars.length; i++){
            System.out.print(myString.toUpperCase().chars[i] + " ");
        }
        System.out.println();
        System.out.print("Метод toChars(): ");
        for(int i = 0; i < myString.toChars().length; i++){
            System.out.print(myString.toChars()[i] + " ");
        }
        System.out.println();
        boolean b = false;
        System.out.print("Метод valueOf(b): ");
        for(int i = 0; i < MyString2.valueOf(b).toChars().length; i++){
            System.out.print(MyString2.valueOf(b).chars[i]);

        }



    }
}
