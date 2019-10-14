package Question5.Pet;

public class PetTest {
    public static void main(String[] args) {
        Pet pet = new Pet("Spot", "Mary", "Black And White");
        pet.setSexid(1);
        System.out.println(pet.toString());
    }
}
