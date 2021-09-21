package coreJava;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        
        int balance = 10000, deposit, Withdrawal;
        Scanner sc = new Scanner(System.in);

        while(true)
        {

            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 to Withdraw Money");
            System.out.println("Choose 2 to Deposit Money");
            System.out.println("Choose 3 to check Balance");
            System.out.println("Choose 4 to Exit");
            System.out.println("Please Choose an option");

        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter Money to be Withdrawn ");
            Withdrawal = sc.nextInt();
            if(balance >= Withdrawal)
                {
                    balance = balance - Withdrawal;
                    System.out.println("Collect your Money ");
                    System.out.println("Your Remaining Balance is Rs  "+ balance);
                    System.out.println("");
                }
            else 
                {
                    System.out.println("Insufficient Amount ");
                    System.out.println("Your Balance is Rs  "+ balance);
                    System.out.println("");
                }
            break;
            case 2:
                System.out.println("Enter the Amount you want to Deposit ");
                deposit = sc.nextInt();
                balance = deposit + balance;
                System.out.println("Money added Succesfully ");
                System.out.println("Your Balance is rs "+balance);
                System.out.println("");
            break;
            case 3:
            System.out.println("Your balance is Rs " + balance);
            System.out.println("");
            break;
            case 4:
            System.exit(0);
            
            }

            



        }


    }
    
}
