/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;

public class FrontDesk {
    public static void main(String[] args) {
        Book bookobject = new Book();
        System.out.println(
                       "BOOK NAME IS:"+" "+bookobject.getNameOfBooks() +","+
                               "BOOK AUTHOR NAME IS:"+" "+bookobject.getNameOfAuthors() +"," +
                        "ISBN CODE OF THE BOOK IS:"+" "+ bookobject.getIsbnNumberOfBooks()


                );

    }
}
