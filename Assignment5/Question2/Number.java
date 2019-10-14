package Question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
    int a;
    int b;
    int result;

    private int count(){
        Scanner input = new Scanner(System.in);
        System.out.println("input first Integer");
        a = input.nextInt();
        System.out.println("input second Integer");
        b = input.nextInt();
        result = a/b;
        System.out.println("the quotient is: ");
        return result;
    }

    public static void main(String[] args) {
        try{
            Number n = new Number();
            System.out.println(n.count());
        }  catch (ArithmeticException e){
            System.out.println("Error: " + e);
            System.out.println("Error: the divisor can't be zero");
        }  catch (InputMismatchException e) {
            System.out.println("Error: " + e);
            System.out.println("Error: your input should be Integer");
        } finally {
            System.out.println("Program is end...");
        }
    }
}

