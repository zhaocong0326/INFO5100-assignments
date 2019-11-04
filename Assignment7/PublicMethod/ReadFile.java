package PublicMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    public String readFromFile(String path) throws IOException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        String s = readFromStream(fis);
        fis.close();
        return s;
    }

    private String readFromStream(FileInputStream fis) throws IOException {
        String s  = "";
        while (true) {
            int x = fis.read();
            if (x == -1)
                break;
            char c = (char) x;
            s += c;
        }

        System.out.println(s);
        fis.close();
        return s;
    }
}
