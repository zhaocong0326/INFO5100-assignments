public class Question1 {
    /* Explain the difference between final and finally in Java 8. */
    /*
    * 1. final: Final is used to apply restrictions on class, method and variable. Final class can't be inherited,
    *           final method can't be overridden and final variable value can't be changed.
    *    finally: finally is used to place important code, it will be executed whether exception is handled or not.
    * 2. final: final is a keyword.
    *    finally: finally is a block.
     * */
}
class FinalExample {
    public static void main(String[] args) {
        final int x = 100;
         /*x = 200;*/ // final variable can't be changed.
    }
}

class FinallyExample {
    public static void main(String[] args) {
        try {
            int x = 100;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally block will be executed whether exception is handled or not.");
        }
    }
}
