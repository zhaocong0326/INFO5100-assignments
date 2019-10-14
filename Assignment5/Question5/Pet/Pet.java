package Question5.Pet;

public class Pet {
    public String name;
    public String owerName;
    public String color;
    protected int sexid;
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public Pet(String name, String ownerName, String color) {
        this.name = name;
        this.owerName = ownerName;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getOwerName() {
        return owerName;
    }

    public String getColor() {
        return color;
    }

    public int getSexid() {
        return sexid;
    }

    public void setSexid(int sexid) {
        this.sexid = sexid;
    }

    public String getSex() {
        if (getSexid() == MALE) {
            return "Male";
        } else if (getSexid() == FEMALE) {
            return "Female";
        } else if (getSexid() == SPAYED) {
            return "Spayed";
        } else {
            return "Neutered";
        }
    }

    public String toString() {
        return name + " owned by" + owerName +"\nColor: " + color + "\nSex: " + getSex();
    }
}


