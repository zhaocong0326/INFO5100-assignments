package Question5.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Spot", "Susan", "white", "medium");
        dog.setSexid(3);
        System.out.println(dog.toString());
     /*   dog.setBoardStart(15, 33,2019);*/
        dog.setBoardStart(10, 26,2019);
        /*dog.setBoardEnd(12, 29,2018);*/
        dog.setBoardEnd(12, 29,2020);
        /*dog.boarding(11, 20,2019);*/
        dog.boarding(12, 29,2020);
    }
}
