package Question2;

public class HappyObject extends MoodyObject{
    // returns a String indicating happy
    @Override
    protected String getMood() {
        return "happy";
    }

    // print laughter String: "hehehe...hahahah...HAHAHAHAHA!!!"
    @Override
    public void expressFeelings() {
        System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");
    }

    // returns message about self: "Subject laughs a lot"
    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
