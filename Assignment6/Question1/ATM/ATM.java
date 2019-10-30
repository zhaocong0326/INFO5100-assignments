package ATM;

import java.util.*;

public class ATM {
    private Double availableAmountInMachine;
    private Double transactionFee;
    private Map<String, User> userData;

    public ATM(Double availableAmountInMachine, Double transactionFee) {
        this.availableAmountInMachine = availableAmountInMachine;
        this.transactionFee = transactionFee;
        userData = new HashMap<>();
    }

    public Double getAvailableAmountInMachine() {
        return availableAmountInMachine;
    }

    public void setAvailableAmountInMachine(Double availableAmountInMachine) {
        this.availableAmountInMachine = availableAmountInMachine;
    }

    public Double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(Double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public Map<String, User> getUserData() {
        return userData;
    }

    public void setUserData(Map<String, User> userData) {
        this.userData = userData;
    }


    public void action() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n" + "NEW USER please input 1, CURRENT USER please input 2, EXIT please input 3");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                createNewUser();

            } else if (input.equals("2")) {
                login();
            } else if (input.equals("3")) {
                break;
            } else {
                System.out.println("Wrong input! please input again!");
            }

        }
    }

    private void login() {
        System.out.println("Welcome! Please input your BANK ACCOUNT NUMBER to login! ");
        Scanner scanner = new Scanner(System.in);
        String bankAccountNumber = scanner.nextLine();
        System.out.println("Please input your password! ");
        String passWord = scanner.nextLine();

        if (! userData.containsKey(bankAccountNumber)) {
            System.out.println("Your bank account number does not exist, if you want to continue login input 1, if ypu want to creat new account input 2");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                return;
            } else if (input.equals("2")) {
                createNewUser();
            } else {
                System.out.println("Wrong input!");
            }
        } else {
            User user = userData.get(bankAccountNumber);
            if (! user.getPassword().equals(passWord)) {
                System.out.println("Your password is not correct. If you want to try again please input 1, if you want reset your password please input 2.");
                String ifReset = scanner.nextLine();
                if (ifReset.equals("1")) {
                    login();
                } else if (ifReset.equals("2")) {
                    System.out.println("Please input your name");
                    String name = scanner.nextLine();
                    System.out.println("Please input your age");
                    int age = Integer.valueOf(scanner.nextLine());
                    System.out.println("Please input your phoneNumber");
                    String phoneNumber = scanner.nextLine();

                    if (user.getName().equals(name) && user.getAge() == age && user.getPhoneNumber().equals(phoneNumber)) {
                        resetPassword(bankAccountNumber);
                    } else {
                        System.out.println("Your name or age or phone number may not correct, please try again later.");
                        return;
                    }
                }
            } else {
                System.out.println("Login successfully!");

                while (true) {
                    System.out.println("\n" + "Show AVAILABLE BALANCE please input 1, DEPOSIT please input 2, WITHDRAWAL please input 3, show RECENT TRANSACTION please input 4; CHANGE PASSWORD please input 5, EXIT please input 6.");
                    String input = scanner.nextLine();
                    if (input.equals("1")) {
                        System.out.println("Your AVAILABLE BALANCE is: " + user.getAvaileBalance());
                    } else if (input.equals("2")) {
                        deposit(bankAccountNumber);
                    } else if (input.equals("3")) {
                        withdrawal(bankAccountNumber);
                    } else if (input.equals("4")) {
                        System.out.println("Your recent transaction is : ");
                        int count = 0;
                        for(int i = user.getRecord().size() -1; i >= 0; i--) {
                            if (count < 10) {
                                System.out.println("                            " + user.getRecord().get(i));
                                count++;
                            }
                        }

                    } else if (input.equals("5")) {
                        resetPassword(bankAccountNumber);
                        break;
                    } else if (input.equals("6")) {
                        System.out.println("Exit successfully!");
                       break;
                    } else {
                        System.out.println("Wrong input! Please try again");
                        break;
                    }
                }


            }
        }
    }

    private void withdrawal(String bankAccountNumber) {
        User user = userData.get(bankAccountNumber);
        Double availableBalance;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input how much you want to withdrawal, you have to input a integer");
            int withdrawal = Integer.valueOf(scanner.nextLine());
            if (Double.valueOf(withdrawal) > user.getAvaileBalance()) {
                System.out.println("Your available balance is not enough.");
                return;
            } else if (Double.valueOf(withdrawal) > getAvailableAmountInMachine()) {
                System.out.println("The available money is this machine is not not enough, please try another ATM!");
                return;
            } else {
                availableBalance = user.getAvaileBalance() - Double.valueOf(withdrawal) - transactionFee;
                user.setAvaileBalance(availableBalance);

                user.getRecord().add("WITHDRAWAL: " +  withdrawal + "  TRANSACTION FEE:  -" + getTransactionFee());

                availableAmountInMachine -= Double.valueOf(withdrawal) + transactionFee;
                System.out.println("Withdraw Success!");
            }
        } catch (NumberFormatException e) {
            System.out.println("You only can withdrawal integer money! Please try again.");
            return;
        }

    }

    private void deposit(String bankAccountNumber) {
        User user = userData.get(bankAccountNumber);
        Double availableBalance;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input how much you want to deposit, you have to input a integer");
            int deposit = Integer.valueOf(scanner.nextLine());
            availableBalance = user.getAvaileBalance() + Double.valueOf(deposit) - transactionFee;
            user.setAvaileBalance(availableBalance);

            user.getRecord().add("DEPOSIT:    " +  deposit + "  TRANSACTION FEE:  -" + getTransactionFee());

            availableAmountInMachine += Double.valueOf(deposit) + transactionFee;
            System.out.println("Deposit Success!");
        } catch (NumberFormatException e) {
            System.out.println("You only can deposit integer money!  Please try again.");
            return;
        }
    }

    private void resetPassword(String bankAccountNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your new password");
        String newPassword = scanner.nextLine();
        System.out.println("Please input your new password");
        String newPassword2 = scanner.nextLine();
        if (newPassword.equals(newPassword2)) {
            userData.get(bankAccountNumber).setPassword(newPassword);
            System.out.println("Your password has been reseted, please login with your new password now.");
        } else {
            System.out.println("Your twice input is different, please try again.");
            return;
        }
    }

    private void createNewUser() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Please input your BANK ACCOUNT NUMBER");
        String bankAccountNumber = scanner.nextLine();
        while (isBankAccountNumberExist(bankAccountNumber) == true) {
            System.out.println("This account Number is Already exist, Please input a new account!");
            bankAccountNumber = scanner.nextLine();
        }
        user.setBankAccountNumber(bankAccountNumber);

        System.out.println("Please input your PASSWORD");
        String password = scanner.nextLine();
        user.setPassword(String.valueOf(password));
        userData.put(bankAccountNumber, user);
        System.out.println("Congratulations! You create a new account Successfully!");

        System.out.println("\n" + "Do you want to complete your personal information now? if yes please input 1, if you want to exit please input 2");
        String ifContinue = scanner.nextLine();
        if (ifContinue.equals("1")) {
            completeInformation(bankAccountNumber);
        } else if (ifContinue.equals("2")) {
            System.out.println("See you! You can complete your information later!");
        } else {
            System.out.println("Wrong input!");
        }
    }

    private void completeInformation(String bankAccountNumber) {
        User user = userData.get(bankAccountNumber);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your name.");
        String name = scanner.next();
        user.setName(name);

        try {
            System.out.println("Please input your age.");
            int age = Integer.valueOf(scanner.next());
            user.setAge(age);
        } catch (NumberFormatException e) {
            System.out.println("Your age should be number!");
            return;
        }

        System.out.println("Please input your address.");
        String address = scanner.next();
        user.setAddress(address);

        System.out.println("Please input your phone number.");
        String phoneNumber = scanner.next();
        user.setPhoneNumber(phoneNumber);

        System.out.println("\n" + "Your information has been completed. Here is your information!" + "\n" + user.toString());
    }

    private boolean isBankAccountNumberExist(String bankAccount) {
        if (!userData.containsKey(bankAccount)) {
            return false;
        }
        return true;
    }
}
