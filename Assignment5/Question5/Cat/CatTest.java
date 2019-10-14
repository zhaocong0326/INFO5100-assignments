package Question5.Cat;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "Bob", "black", "short");
        cat.setSexid(3);
        System.out.println(cat.toString());
        cat.setBoardStart(1, 1,2019);
        cat.setBoardEnd(12, 31,2019);
        cat.boarding(8, 20,2019);
    }
}
