package Labs.LabExercise_18;import java.util.Scanner;public class Calculator {        public static void main(String[] args) {                       Scanner sc = new Scanner(System.in);            System.out.print("Enter 1st Number- ");            int n1 = sc.nextInt();            System.out.print("Enter 2nd Number- ");            int n2 = sc.nextInt();            System.out.println("Select The Operation");            System.out.println("Addition");            System.out.println("Subtraction");            System.out.println("Multiplication");            System.out.println("Division");            String opt = sc.next().toLowerCase();                   switch (opt){                case "addition":                        System.out.println(n1+"+"+n2+"="+(n1+n2));                        break;                case "substraction":                    System.out.println(n1+"-"+n2+"="+(n1-n2));                    break;                case "mutiplication":                    System.out.println(n1+"*"+n2+"="+(n1*n2));                    break;                case "division":                    System.out.println(n1+"*"+n2+"="+(n1/n2));                    break;                default:                    System.out.println("invalid function");            }        }    }