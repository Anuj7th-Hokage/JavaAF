package Constructor;public class Student {    private int rollNo;    private String name;    private double percentage;   public Student()   {       rollNo=101;       name="Anuj";       percentage=70.00;   }    public int getRollNo() {        return rollNo;    }    public void setRollNo(int rn) {      rollNo = rn;    }    public String getName(){       return name;    }    public void  setName(String nm){       name=nm;    }    public double getPercentage(){       return  percentage;    }    public void setPercentage(double p){       percentage=p;    }    void printDetail(){        System.out.println("name- "+name+" roll no- "+rollNo+" percentage- "+percentage+"%");    }}