import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Submit it on or before 22nd September 2019 , 12:00 pm
 */
public class Assignment2 {
    /*
        This method should return the sum of salaries of employees having salary greater than 5000
        Note: Employee array is passed, not employee
     */
    public double salaryGreaterThanFiveThousand(Employee[] employees) {
        double sum = 0.0;
        for (int i = 0; i< employees.length; i++) {
            if (employees[i].getSalary() > 5000.0) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }


    /*
        This method should print either "Fizz", "Buzz" or "FizzBuzz"
        "Fizz" - if id of employee is divisible by 3
        "Buzz" - if id of employee is divisible by 5
        "FizzBuzz" - if id of employee is divisible by both 3 and 5
     */
    public void fizzBuzz(Employee employee) {
        StringBuffer s1 = new StringBuffer("Fizz");
        StringBuffer s2 = new StringBuffer("Buzz");
        StringBuffer s;
        if (employee.getId() % 15 == 0) {
            s = s1.append(s2);
        } else if (employee.getId() % 3 == 0) {
            s = s1;
        } else if (employee.getId() % 5 == 0) {
            s = s2;
        } else {
            return;
        }
        System.out.println(s.toString());
    }


    /*
        This method should calculate tax for an employee in dollars
        If salary of employee is less than or equal to 2500, tax should be 10%
        If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25%
        If salary of employee is greater than 5000, tax should be 35%
    */
    public double calculateTax(Employee employee) {
        double tax = 0.0;
        if (employee.getSalary() <= 2500.0) {
            tax = employee.getSalary() * 0.1;
        } else if (employee.getSalary() > 2500.0 && employee.getSalary() <= 5000.0) {
            tax = employee.getSalary() * 0.25;
        } else {
            tax = employee.getSalary() * 0.35;
        }
        return tax;
    }


    /*
        We are given two employee objects.
        Implement this method to swap salaries of employees
    */
    public void swap(Employee firstEmployee, Employee secondEmployee) {
        double i = firstEmployee.getSalary();
        double j = secondEmployee.getSalary();
        secondEmployee.setSalary(j);
        firstEmployee.setSalary(i);
    }


    /*
        Return number of employees whose age is greater than 50
        Note: Employee array is passed, not employee
     */
    public int employeesAgeGreaterThan50(Employee[] employees) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 50) {
                count++;
            }
        }
        return count;
    }


    /*
        Implement this method to reverse firstName of employee.
        Ex. Before: employee.getFirstName() -> "John"
        After : employee.getFirstName() -> "nhoJ"
     */
    public void reverseFirstName(Employee employee) {
        char[] employees = employee.getFirstName().toCharArray();
        int i = 0, j = employees.length-1;
        while (i < j) {
            char temp = employees[i];
            employees[i] = employees[j];
            employees[j] = temp;
            i++;
            j--;
        }
        employee.setFirstName(new String(employees));
    }

    /*
        Print "true" if employee's first name contain one or more digits
        Print "false" if employee's first name doesn't contain any digit
        Ex: employee.getFirstName() -> "ha8l" == true
        employee.getFirstName() -> "hail" == false
     */
    public void isContainDigit(Employee employee) {
        char[] e = employee.getFirstName().toCharArray();
        for (int i = 0; i < e.length; i++) {
            if (Character.isDigit(e[i])){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }


    /*
       Write a method to raise an employee's salary to three times of his/her original salary.
       Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
       DO NOT change the input in this method.
       Try to add a new method in Employee class: public void raiseSalary(double byPercent)
       Call this new method.
    */
    public void tripleSalary(Employee employee) {
        employee.raiseSalary(3.0);
    }


    //Additional question for extra credit
    /*
        Implement this method to co
        nvert String[] to employees array.
        Ex: String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"};
        This String array of length 2 contains 2 employees in form of string, where
        id = 1
        firstName=John
        age=24
        convert each string to employee object.
        Hint: Use String methods. Refer : https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     */
    public Employee[] createEmployees(String[] employeesStr) {
        Employee[] employees = new Employee[employeesStr.length];

       for (int i = 0; i < employeesStr.length; i++) {
           String[] a = employeesStr[i].split(",");
           Employee e = new Employee(Integer.valueOf(a[0]), a[1], Integer.valueOf(a[2]), Double.valueOf(a[3]));
           employees[i] = e;
       }
        return employees;

    }
}
