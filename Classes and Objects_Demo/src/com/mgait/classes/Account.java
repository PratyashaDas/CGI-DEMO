package com.mgait.classes;

public class Account {

    static int acctCount = 0;

    int accountNo;
    double accountBalance;
    String accountType;

    // parameterized Constructor
    public Account(String acType) {
        accountNo = ++ acctCount;
        accountBalance = 0;
        accountType = acType;
    }

    public void depositAmount(double amount) {
        accountBalance += amount;
    }

    public String getAccountDetails() {
        String format = ("Acct No       : " + accountNo + "\n"
                + "Acct Type    : " + accountType + "\n" 
                + "Acct Balance : " + accountBalance);
        return format;
    }


}