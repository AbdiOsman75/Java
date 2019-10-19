package com.company;

public class VipCustomer {
    private String customerName;
    private int creditLimit;
    private String email;

    public VipCustomer() {
        this("Default name",50000,"default@email.com");
    }

    public VipCustomer(String customerName, int creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String customerName, String email) {
        this(customerName,50000,email);
    }


    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
