/*  Created by IntelliJ IDEA.
 *  User: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *  Date: 29/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {

    private String nameOfBooks;

    private String nameOfAuthors;
    //  since it Should be a of 13 Digits
    private String isbnNumberOfBooks;


    public Book() {
        this.nameOfBooks = "DISCRETE MATHEMATICS";
        this.nameOfAuthors = "KNEATH ROSAN";
        this.isbnNumberOfBooks = "4858147954410";
    }

    public Book(String nameOfBooks, String nameOfAuthors, String isbnNumberOfBooks) {
        this.nameOfBooks = nameOfBooks;
        this.nameOfAuthors = nameOfAuthors;
        this.isbnNumberOfBooks = isbnNumberOfBooks;


    }

    //CREATING THE GETTER METHOD FOR THE FIELDS
    public String getNameOfBooks() {
        return nameOfBooks;
    }

    // NOW,WE WILL CREATE SETTER METHOD FOR EVERY VARIABLE
    public void setNameOfBooks(String nameOfBooks) {
        this.nameOfBooks = nameOfBooks;
    }

    public String getNameOfAuthors() {
        return nameOfAuthors;
    }

    public void setNameOfAuthors(String nameOfAuthors) {
        this.nameOfAuthors = nameOfAuthors;
    }

    public String getIsbnNumberOfBooks() {
        return isbnNumberOfBooks;
    }

    public void setIsbnNumberOfBooks(String isbnNumberOfBooks) {
        this.isbnNumberOfBooks = isbnNumberOfBooks;
    }

    public String toString() {
        return "Name Of Book:" + " " + this.nameOfBooks + "\n"
                + "Name Of Author Of Book:" + " " + getNameOfAuthors() + "\n"
                + "ISBN Code Of The Book:" + " " + this.isbnNumberOfBooks + ".";
    }

    public void doCheckout() {
        System.out.println("THANK YOU FOR RENTING A BOOK.");
    }

    public void doReturn() {
        System.out.println("THANK YOU FOR RETURNING THE BOOK.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBooks(), book.getNameOfBooks()) &&
                Objects.equals(getNameOfAuthors(), book.getNameOfAuthors()) &&
                Objects.equals(getIsbnNumberOfBooks(), book.getIsbnNumberOfBooks());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBooks(), getNameOfAuthors(), getIsbnNumberOfBooks());
    }
}

