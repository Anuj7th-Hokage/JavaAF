package Labs_1.LabExercise_21.MultipleTryCatch;import ExceptionHandling.Employee;import java.io.FileInputStream;import java.io.FileNotFoundException;public class Exceptionxd {    public static void main(String[] args) {        try {            FileInputStream fs=new FileInputStream("/Users/anujvidhate/Desktop/JavaAF/Java/src/ExceptionHandling/xd");            System.out.println("file is reading......");            int arr[]={2,3,4,5,7};            for (int i=0;i<5;i++){                System.out.println("print Array");                System.out.println(arr[i]);            }             Employee emp= null;             emp.print();        }        catch (FileNotFoundException e){            System.out.println("file Not found");            e.fillInStackTrace();        }        catch (ArrayIndexOutOfBoundsException e){            System.out.println("array out of limit");            e.fillInStackTrace();        } catch (NullPointerException e) {           // System.err.println("you  are in null pointer exception");            e.fillInStackTrace();        }        System.out.println("finish....");    }}