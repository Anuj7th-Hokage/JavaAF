package Labs.LabExercise_17;

public class Account {
    public int accId;
    public String accName;
    public double balance;

      public Account() {
        this.accId = 101;
        this.accName = "aditya";
        this.balance = 80000;
    }

    class Locker{
        int lcId = 292;

        public void print() {
            System.out.println("Loc Id- "+lcId);
            System.out.println("Account ID- "+accId);
            System.out.println("Account Name- "+accName);
            System.out.println("Balance- "+balance);

        }

    }

    public static void main(String[] args) {
        Account acc = new Account();
        Account.Locker lock = acc.new Locker();
        lock.print();
    }
}