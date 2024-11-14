public class Bank {
    int accountNumber;
    float accountBalance;
    String customerName;
    String email;
    String phoneNumber;

    public String depositFunds(float depositAmount) {
        accountBalance += depositAmount;
        return "Deposit of " + depositAmount + " made. New balance is " + accountBalance;
    }

    public String withdrawFunds() {
        float currentBalance = accountBalance;
        if (currentBalance <= 0) {
            return "You can't withdraw. Your current balance is: " + currentBalance;
        } else {
            setAccountBalance(0);
            return "You withdraw your account. Your current balance is: " + currentBalance;
        }
    }

    public String resumeAccount() {
        return "Account Number: " + accountNumber + "\n" +
                "Account Balance: " + accountBalance + "\n" +
                "Customer Name: " + customerName + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " + phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
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
