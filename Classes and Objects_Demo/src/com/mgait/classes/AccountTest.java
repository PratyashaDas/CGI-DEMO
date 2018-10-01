package com.mgait.classes;

public class AccountTest {
    public static void main(String[] args) {
        // Creating account object 1
        Account acct1 = new Account("Savings");

        String acct1detail = acct1.getAccountDetails();
        System.out.println(acct1detail);                // Displaying the Account Details for acct1

        acct1.depositAmount(1000);                      // Calling depositAmount method
        System.out.println("\nBalance after deposit: "
                + acct1.accountBalance + "\n");
        
        Account acct2 = new Account("Current");         // Creating second account object
        acct2.accountBalance = 250;                     // Setting Balance for Account object acct2
        acct2.depositAmount(500);

       //Array of Objects

        
        Account[] acctArr = new Account[2];
        acctArr[0] = acct1;
        acctArr[1] = acct2;

        for(Account acc: acctArr){
            System.out.println("\nAccount Details");
            System.out.println(acc.getAccountDetails());
        }    }
}