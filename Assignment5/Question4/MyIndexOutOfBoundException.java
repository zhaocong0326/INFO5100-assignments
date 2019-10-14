package Question4;

public class MyIndexOutOfBoundException extends RuntimeException{
    int lowerBound;
    int upperBound;
    int index;

    public MyIndexOutOfBoundException (int lowerBound, int upperBound, int index) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.index = index;
    }

    public String toString() {
        String s = "Error Message: Index: " + index + ", but Lower bound : " + lowerBound + ", Upper bound: " + upperBound;
        return s;
    }

}
