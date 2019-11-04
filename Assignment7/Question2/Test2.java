package Question2;

import PublicMethod.CreateFile;
import PublicMethod.ReadFile;

import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        CreateFile create = new CreateFile();
        create.createFile("/Users/user1/Test/test2.txt", "3[a]2[bc]");
        create.createFile("/Users/user1/Test/test3.txt", "3[a2[c]]");
        create.createFile("/Users/user1/Test/test4.txt", "2[abc]3[cd]ef");

        ReadFile readFile = new ReadFile();
        String encode = readFile.readFromFile("/Users/user1/Test/test2.txt");
        String encode2 = readFile.readFromFile("/Users/user1/Test/test3.txt");
        String encode3 = readFile.readFromFile("/Users/user1/Test/test4.txt");

        DecodeFile decodeFile = new DecodeFile();
        String d = decodeFile.decode(encode);
        String d2 = decodeFile.decode(encode2);
        String d3 = decodeFile.decode(encode3);
        System.out.println(d + "\n" + d2 + "\n" + d3);
    }
}
