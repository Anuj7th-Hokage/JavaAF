package Employee_Information.AllEmployee;import Employee_Information.Person.Address;import Employee_Information.Person.Date;public class Developer extends Employee {    int noProject;    int payment;    int total;    public Developer(){        super();        noProject=1;        payment=7000;    }     public Developer(String name, Date dob, Address add, double bSal, int payment, int noProject){        super(name,dob,add,bSal);        this.payment=payment;        this.noProject=noProject;     }     public int calculateDevSalary(){          return total=noProject*noProject;     }    @Override    public String toString() {        return super.toString()+"\nThis Employee is a devloper- "+"\nTotal project done- "+noProject+"\n Total earn- "+calculateDevSalary();    }}