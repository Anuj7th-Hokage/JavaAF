package Contractor;public class StudentMain {    public static void main(String[]args){    Student std=new Student();    std.setRollNo(100);    std.setName("Tejash");    std.setPercentage( 80.90);        System.out.println("name- " + std.getName() + " roll no- " + std.getRollNo() + " percentage- " + std.getPercentage() + "%");Student std2=new Student();std2.printDetail();    }}