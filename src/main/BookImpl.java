package main;

import data.Book;

public class BookImpl {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.setTitle("Java Programing");
        System.out.println("book name = " + b1.getTitle());
        b1.setAuthorName("Neeraj Kumar");
        System.out.println("Author name = " + b1.getAuthorName());
        b1.setYearOfPublishing(2022);
        System.out.println("year of publishing = " + b1.getYearOfPublishing());
        b1.setIsbnNumber(12345678);
        System.out.println("Isbn number = " + b1.getIsbnNumber());
        b1.setPrice(2000);
        System.out.println("book price = " + b1.getPrice());

    }
}
