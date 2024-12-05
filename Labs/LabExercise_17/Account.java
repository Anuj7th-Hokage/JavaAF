package Labs.LabExercise_17;

public class Account {
    public int accId;
    public String accName;
    public double bal;

      public Account() {
       accId = 101;
     accName = "aditya";
       bal = 200;
    }

    class Locker{
        int lcId = 292;

        public void print() {
            System.out.println("Loc Id- "+lcId);
            System.out.println("Account ID- "+accId);
            System.out.println("Account Naam- "+accName);
            System.out.println("Balance- "+bal);

        }

    }

    public static void main(String[] args) {
        Account acc = new Account();
        Account.Locker lock = acc.new Locker();
        lock.print();
    }
}