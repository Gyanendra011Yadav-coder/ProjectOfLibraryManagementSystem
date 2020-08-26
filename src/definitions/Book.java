/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
    public String toString(){
        return "Name Of Book:"+" "+this.nameOfBooks+"\n"
                +"Name Of Author Of Book:"+" "+getNameOfAuthors() +"\n"
                +"ISBN Code Of The Book:"+" "+ this.isbnNumberOfBooks+"." ;
    }


}

