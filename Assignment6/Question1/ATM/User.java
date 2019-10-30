package ATM;

public class User {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String bankAccountNumber;
    private String password;
    private Double availeBalance = 0.00;

    public User() {

    }

    public User(String name, int age, String address, String phoneNumber, String bankAccountNumver, String password, Double availeBalance) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.bankAccountNumber = bankAccountNumver;
        this.password = password;
        this.availeBalance = availeBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumver) {
        this.bankAccountNumber = bankAccountNumver;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getAvaileBalance() {
        return availeBalance;
    }

    public void setAvaileBalance(Double availeBalance) {
        this.availeBalance = availeBalance;
    }

    public String toString() {
        return "Bank Account Number: " + getBankAccountNumber() + ", Name: " + getName() + ", Age: " + getAge() + ", Address: " + getAddress() + ", PhoneNumber" + getPhoneNumber() + ", Available balance: " + getAvaileBalance();
    }
}
