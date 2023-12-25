public class MyCharacter {
    private char mychar;
    public MyCharacter(char value){
        this.mychar = value;
    }
    public char charValue(){
        return this.mychar;
    }
    public int compareTo(MyCharacter anotherCharacter){
        if((int)this.mychar > (int)anotherCharacter.charValue()){
            return 1;
        } else if ((int)this.mychar == (int)anotherCharacter.charValue()){
            return 0;
        } else return -1;
    }
    public boolean equals(MyCharacter anotherCharacter){
        if((int)this.mychar == (int)anotherCharacter.charValue()){
            return true;
        } else return false;
    }
    public boolean isDigit(){
        if((int)this.mychar >= 48 && (int)this.mychar <= 57){
            return true;
        } else return false;
    }
    public static boolean isDigit(char ch){
        if((int)ch >= 48 && ch <= 57){
            return true;
        } else return false;
    }
    public static boolean isLetter(char ch){
        if (((int)ch >= 65 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <= 122)){
            return true;
        } else return false;
    }
}
