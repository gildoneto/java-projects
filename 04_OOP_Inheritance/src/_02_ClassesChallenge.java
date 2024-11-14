public class _02_ClassesChallenge {
    public static void main(String[] args) {

        Account bobsAccount = new Account("122345", 1000.00,
                "Bob Brown", "myemail@bob.com",
                "(087) 123-4567");

//        bobsAccount.setCustomerName("John");
//        bobsAccount.setNumber("123456");
//        bobsAccount.setBalance(1000);
//        bobsAccount.setCustomerEmail("john@mail.com");
//        bobsAccount.setCustomerPhone("1234567890");

        bobsAccount.withdrawFunds(100.0);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);

        bobsAccount.withdrawFunds(54.45);

    }
}

