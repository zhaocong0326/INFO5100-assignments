package Question3;

import java.util.EnumMap;

public class Test {
    public static void main (String[] args) {
        Employee contractor = new Contractor("Claire", 60, 7 );
        Employee fullTimeEmployee = new FullTimeEmployee("Tom", 45);
        contractor.display();
        System.out.println("Daily salary: " + contractor.calculateSalary());
        fullTimeEmployee.display();
        System.out.println("Daily salary: " + fullTimeEmployee.calculateSalary());
    }

}
