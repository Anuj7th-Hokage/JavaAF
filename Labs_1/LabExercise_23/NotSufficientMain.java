package Labs_1.LabExercise_23;import Labs_1.LabExercise_22.Account;import Labs_1.LabExercise_22.InsufficientBalance;import java.util.Scanner;public class NotSufficientMain {    public static void main(String[] args) {        Account acc=new Account();        Scanner sc=new Scanner(System.in);        System.out.println("Enter the Withdraw Amount");        double amount= sc.nextInt();        try {            acc.Withdraw(amount);        } catch (InsufficientBalance e) {            //throw new RuntimeException(e);            System.err.println( e.getMessage());        }    }}