public class Test {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("После вызова метода");
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException в методе main()");
        }
        catch (Exception ex) {
            System.out.println("Exception в методе main()");
        }
    }
    static void method() throws Exception {
        try {
            String s ="abc";
            System.out.println(s.charAt(3));
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException в методе method()");
        }
        catch (Exception ex) {
            System.out.println("Exception в методе method()");
        }
    }
}