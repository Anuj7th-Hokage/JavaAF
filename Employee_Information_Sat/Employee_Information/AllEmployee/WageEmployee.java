package Employee_Information_Sat.Employee_Information.AllEmployee;import Employee_Information_Sat.Employee_Information.Person.Address;import Employee_Information_Sat.Employee_Information.Person.Date;public class WageEmployee extends Employee {    int hours;    float rate;    float ammount;    public WageEmployee(){        super();        hours=1;        rate=1000;    }    public WageEmployee(String name, Date dob, Address add, int hours, int rate, double bSal){        super(name,dob,add,bSal);        this.hours=hours;        this.rate=rate;    }    public float calculatAmount(){      return  rate * hours;    }    @Override    public String toString() {        return super.toString()+"\nThis Employee is a"+"Total hours work- "+hours+"\nTotal earn- "+calculatAmount();    }}