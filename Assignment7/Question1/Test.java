package Question1;

import PublicMethod.CreateFile;
import PublicMethod.ReadFile;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        CreateFile test = new CreateFile();
        test.createFile("/Users/user1/Test/test1.txt", "the sky is blue");

        ReadFile readfile = new ReadFile();
        ReverseSentences reverse = new ReverseSentences();
        String s = readfile.readFromFile("/Users/user1/Test/test1.txt");
        reverse.writeIntoFile("/Users/user1/Test/testReverse.txt", s);
        readfile.readFromFile("/Users/user1/Test/testReverse.txt");
    }
}
