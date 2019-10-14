package Question4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

    public static void main (String[] args) {
        final int size = 11;
        int[] array = new int[size];

        Scanner input = new Scanner(System.in);

        System.out.println("please input the size of array: ");

        try {
            int i = input.nextInt();
            System.out.println("Current index is: " + i);
            if (i >= size) {
                throw new MyIndexOutOfBoundException(0, size - 1, i);
            }
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (MyIndexOutOfBoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Program is end...");
        }

    }
}
