package Que_3;import java.util.Scanner;public class Book {    private String bookName;    private  int bookPrice;    private String authorName;    public Book(){        bookName="oni is naughty";        bookPrice=200;        authorName="Saevesh";    }    public Book(String nm,int price,String anm){        this.bookName=nm;        this.bookPrice=price;        this.authorName=anm;    }    public void setBookName(String bookName) {        this.bookName = bookName;    }    public String getBookName() {        return bookName;    }    public void setBookPrice(int bookPrice) {        this.bookPrice = bookPrice;    }    public int getBookPrice() {        return bookPrice;    }    public void setAuthorName(String authorName) {        this.authorName = authorName;    }    public String getAuthorName() {        return authorName;    }}