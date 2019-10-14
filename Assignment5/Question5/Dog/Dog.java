package Question5.Dog;

import Question5.Boardable.Boardable;
import Question5.Pet.Pet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Pet implements Boardable {
    private String size;
    private String boardStart;
    private String boardEnd;
    public Dog (String name, String owerName, String color, String size) {
        super(name, owerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String toString() {
        return "DOG: " + "\n" + name + "owned by " + owerName + "\nColor: " + color + "\nSex :" + getSex()+ "\nSize: " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31 || String.valueOf(year).length() != 4) {
            System.out.println("Wrong input : The month should be in the range 1-12, day in the range 1-31, and year should be a four digit number!");
            return;
        }
        this.boardStart = year + "-" + month + "-" + day;
        System.out.println("board start time is: " + boardStart);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.boardEnd = year + "-" + month + "-" + day;
        if (month < 1 ||  month > 12 || day < 1 || day > 31 || String.valueOf(year).length() != 4) {
            System.out.println("Wrong input : The month should be in the range 1-12, day in the range 1-31, and year should be a four digit number!");
            return;
        }
        this.boardEnd = year + "-" + month + "-" + day;

        try {
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date start = date.parse(boardStart);
            Date end = date.parse(boardEnd);
            if (end.compareTo(start) < 0) {
                System.out.println("Error: board end time can't eraly than start time!");
                return;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("board end time is: " + boardEnd);
    }

    @Override
    public boolean boarding (int month, int day, int year) {
        String boardingTime = year + "-" + month + "-" + day;

        if (month < 1 || month > 12 || day < 1 || day > 31 || String.valueOf(year).length() != 4) {
            System.out.println("Wrong input :  The month should be in the range 1-12, day in the range 1-31, and year should be a four digit number!");
            return false;
        }
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = date.parse(boardStart);
            Date end = date.parse(boardEnd);
            Date boarding = date.parse(boardingTime);
            if (boarding.compareTo(start) < 0 || boarding.compareTo(end) > 0) {
                System.out.println("Can't board! boarding time should between start time and end time!");
                return false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("You can board your Dog on " + boardingTime + "!");
        return true;
    }
}
