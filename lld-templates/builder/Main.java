/**
 * CLIENT CODE
 */

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");
        BankAccount ba1 = new BankAccount.Builder()
                .setBalance(102574.28)
                .setAccountNumber(123456789L)
                .setBranch("North Calcutta")
                .setOwnerName("John Doe")
                .build();
        System.out.println(ba1.toString());
        // ba1 = ba1.Builder().setBalance(1.0).build(); // NOT ALLOWED - Privacy Protected

        // ba1.setBalance(1.0); // NOT ALLOWED - Privacy Protected
        System.out.println("\n");

        BankAccount ba2 = new BankAccount.Builder()
                .setBranch("California")
                .setOwnerName("Elon Musk")
                .setNomineeName("X Æ A-12")
                .setBalance(991249991999.75)
                .setAccountNumber(12595356364L)
                .setInterestRate(10.0)
                .setPhoneNumber("+119898767689")
                .setEmail("elon@tesla.com")
                .build();
        System.out.println(ba2.toString());
    }
}

/*
OUTPUT
------
Hello world!

BankAccount
{
accountNumber=123456789,
ownerName='John Doe',
branch='North Calcutta',
balance=102574.28,
interestRate=0.0,
phoneNumber='null',
email='null',
nomineeName='null'
}


BankAccount
{
accountNumber=12595356364,
ownerName='Elon Musk',
branch='California',
balance=9.9124999199975E11,
interestRate=10.0,
phoneNumber='+119898767689',
email='elon@tesla.com',
nomineeName='X Æ A-12'
}
 */