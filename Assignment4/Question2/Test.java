package Question2;

public class Test {
    public static void main(String[] args){
        PsychiatristObject psy = new PsychiatristObject();
        MoodyObject sadObject = new SadObject();
        MoodyObject happyObject = new HappyObject();
        psy.examine(happyObject);
        psy.observe(happyObject);
        psy.examine(sadObject);
        psy.observe(sadObject);
    }
}
