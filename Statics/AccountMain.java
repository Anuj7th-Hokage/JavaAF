package Statics;

public class AccountMain {
    public static void main(String[]args){
        Account acc=new Account();
        acc.printAccount();

        Account acc2=new Account(23421,"axis");
        acc2.printAccount();

        System.out.println(Account.getInterest());;
    }
}
