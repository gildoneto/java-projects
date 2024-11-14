public class Bank {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String depositFunds(float depositAmount) {
        accountBalance += depositAmount;
        return "Deposit of " + depositAmount + " made. New balance is " + accountBalance;
    }

    public String withdrawFunds() {
        double currentBalance = accountBalance;
        if (currentBalance <= 0) {
            return "You can't withdraw. Your current balance is: " + currentBalance;
        } else {
            setAccountBalance(0);
            return "You withdraw your account. Your current balance is: " + currentBalance;
        }
    }

    public String resumeAccount() {
        return "Account Number: " + getAccountNumber() + "\n" +
                "Account Balance: " + getAccountBalance() + "\n" +
                "Customer Name: " + getCustomerName() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Phone Number: " + getPhoneNumber();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
