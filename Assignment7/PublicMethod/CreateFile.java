package PublicMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public void createFile(String path, String s) throws IOException {
        File file = new File(path);
        // create the file
        if (file.createNewFile()) {
            System.out.println("New File is created!");
        } else {
            System.out.println("File already exists.");
            return;
        }
        //write content
        FileWriter writer = new FileWriter(file);
        writer.write(s);
        writer.close();
    }
}


