package Collection.Employee_System;import java.util.ArrayList;import java.util.Scanner;public class RemoveEmployee {    public static void remove(ArrayList l) {        Scanner sc = new Scanner(System.in);        System.out.println("Enter Employee remove Id- ");        int removeId = sc.nextInt();        boolean flag = false;        for (Object d : l) {            Employee emp = (Employee) d;            if (removeId == emp.empID) {                flag = true;                l.remove(emp);                System.out.println("Employee Remove!");            }        }    }}