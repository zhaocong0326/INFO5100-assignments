package Question2;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;

public class DecodeFile {
    public String decode(String encode) {
        String s = "";
        Stack<Integer> digit = new Stack<>();
        Stack <String> letter = new Stack<>();

        int i = 0;
        char[] arr = encode.toCharArray();
        while (i < arr.length) {
            if (Character.isDigit(arr[i])) {
               int num = 0;
               while (Character.isDigit(arr[i])) {
                   num = 10 * num + (arr[i] - '0');
                   i++;
               }
               digit.push(num);
            } else if (arr[i] == '[') {
                letter.push( s);
                s = "";
                i++;
            } else if (arr[i] == ']') {
                String t = letter.pop();
                int times = digit.pop();
                for (int j = 0; j < times; j++) {
                    t += s;
                }
                s = t;
                i++;
            } else {
                s += arr[i];
                i++;
            }

        }
        return s;
    }
}
