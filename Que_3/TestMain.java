package Que_3;import java.util.Scanner;public class TestMain {    public static void main(String[] args) {        String bon, aun;        int bp;        Scanner s = new Scanner(System.in);        System.out.print("\nEnter Book Name- ");        bon = s.nextLine();        System.out.print("\nEnter Book Price- ");        bp = s.nextInt();        s.nextLine();        System.out.print("\nEnter Book Author- ");        aun = s.nextLine();        Book b1 = new Book();        b1.setBookName(bon);        b1.setBookPrice(bp);        b1.setAuthorName(aun);        System.out.println("\nBook Name- "+b1.getBookName());        System.out.println("Book Price- "+b1.getBookPrice());        System.out.println("Author Name- "+b1.getAuthorName());    }}