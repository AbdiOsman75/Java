package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount("12345",1000,"John Smith","johnsmith@gmail.com","1236457");
//        newAccount.setBalance(10000.0);
//        System.out.println(newAccount.getBalance());
//        newAccount.setAccountNumber("120325");
//        System.out.println(newAccount.getAccountNumber());
//        newAccount.setCustomerName("Abdishakur Osman");
//        System.out.println(newAccount.getCustomerName());
//        newAccount.setEmail("abdio75@gmail.com");
//        System.out.println(newAccount.getEmail());
//        newAccount.setPhoneNumber("55321888");
//        System.out.println(newAccount.getPhoneNumber());

        newAccount.depositFunds(10000.5);
        newAccount.withdrawFunds(10000);
        newAccount.withdrawFunds(100000);

        BankAccount myAccount = new BankAccount("Jack","jack@jack.com","1234");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("James","james@james.com");
        System.out.println(person2.getCustomerName());

        VipCustomer person3 = new VipCustomer("Jonas",50000,"jonas@jonas.com");
        System.out.println(person3.getCustomerName());
    }
    // TASK 1
    // Create a new class for a bank account
    // Create fields for the account number, balance, customer name, email and phone number.
    //
    // Create getters and setters for each field
    // Create two additional methods
    // 1. To allow the customer to deposit funds (this should increment the balance field).
    // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
    // but not allow the withdrawal to complete if their are insufficient funds.
    // You will want to create various code in the Main class (the one created by IntelliJ) to
    // confirm your code is working.
    // Add some System.out.println's in the two methods above as well.
    //
    //TASK 2
    // Create a new class VipCustomer
    // it should have 3 fields name, credit limit, and email address.
    // create 3 constructors
    // 1st constructor empty should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    // 3rd constructor should save all fields.
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.

}
