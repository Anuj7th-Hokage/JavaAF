package ExceptionHandling;import java.util.Scanner;public class DivionException {public static void squ(){    System.out.println("Enter the number- ");    Scanner sc = new Scanner(System.in);    int num = sc.nextInt();    if (num <= 0) {        throw new ArithmeticException("cat not divided by zero...");    }        else{        System.out.println(num+"Square is- "+(num*num));        }    }    public static void main(String[] args) {       try {           squ();       }catch (ArithmeticException e){           System.err.println(e.getMessage());       }    }}