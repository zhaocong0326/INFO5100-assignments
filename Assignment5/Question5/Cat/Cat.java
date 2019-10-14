package Question5.Cat;

import Question5.Boardable.Boardable;
import Question5.Pet.Pet;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Pet implements Boardable {
    private String hairLength;
    private String boardStart;
    private String boardEnd;

    Cat(String name, String owerName, String color, String hairLength) {
        super(name, owerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }
    @Override
    public String toString() {
        return "CAT: " + "\n" + name + " owned by " + owerName + "\nColor: " + color + "\nSex: " + getSex()+ "\nHair: " + getHairLength();
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
        if (month < 1 || month > 12 || day < 1 || day > 31 || String.valueOf(year).length() != 4) {
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
    public boolean boarding(int month, int day, int year) {
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
                System.out.println("Can't board! Boarding time should between start time and end time");
                return false;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("You can board your cat on " + boardingTime + "!");
        return true;

    }
}
