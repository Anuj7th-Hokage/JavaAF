package Labs.LabExercise_12;import java.util.Optional;public class Mnnager extends Employee{        double petrol;        double food;        double other;    public Mnnager(){        super();        petrol=0;        food=0;        other=0;    }    public Mnnager(int empId,String name,int basicSal,double petrol,double food, double other){        super(empId,name,basicSal);        this.petrol=0.8 * basicSal;        this.food=food * basicSal;        this.other=other * basicSal;    }    public double grossSal(){        return petrol+food+other;    }    public void showDetail(){        System.out.println("Petrol allowance "+petrol);        System.out.println("Food Allowance "+food);        System.out.println("Other all Other"+other);        System.out.println("Total networth is "+netSalary());        System.out.println("Total  Gross Salary is "+grossSal());    }    @Override    public String toString() {        return super.toString()+"Gross salary of manager "+grossSal();    }}