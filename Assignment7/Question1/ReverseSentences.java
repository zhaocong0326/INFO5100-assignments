package Question1;

import java.util.*;
import java.io.*;


public class ReverseSentences {

    private String reverse(String s) {
        String[] arr = s.split(" ");
        String newS = "";
        for (int i = arr.length-1; i >= 0; i--) {
            newS += arr[i];
            newS += " ";
        }
        return newS;
    }

    public void writeIntoFile(String path, String s) throws IOException {
        File file = new File(path);
        FileOutputStream fos = new FileOutputStream(file);
        String data = reverse(s) ;
        fos.write(data.getBytes());
        System.out.println("Write to new file successfully! The new sentence is: ");
        fos.close();
    }

}
