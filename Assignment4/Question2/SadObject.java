package Question2;

public class SadObject extends MoodyObject{
    // returns a String indicating sad
    @Override
    protected String getMood() {
        return "sad";
    }

    // print crying string: " 'wah' 'boo hoo' 'weep' 'sob' 'weep' "
    @Override
    public void expressFeelings() {

        System.out.println(" 'wah' 'boo hoo' 'weep' 'sob' 'weep' ");
    }

    // returns message about self: "Subject cries a lot"
    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}
