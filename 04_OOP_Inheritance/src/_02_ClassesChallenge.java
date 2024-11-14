public class _02_ClassesChallenge {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setCustomerName("John");
        bank.setAccountNumber(123456);
        bank.setAccountBalance(1000);
        bank.setEmail("john@mail.com");
        bank.setPhoneNumber("1234567890");

        bank.depositFunds(500);
        System.out.println(bank.depositFunds(-1600));
        System.out.println(bank.withdrawFunds());
        System.out.println(bank.resumeAccount());

    }
}

