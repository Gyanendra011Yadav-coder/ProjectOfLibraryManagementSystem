/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

    private String booksCurrentlyAvailable;

    public Library(String booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    public String getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable;
    }

    public void setBooksCurrentlyAvailable(String booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }

    public String toString() {
        return "THE BOOKS AVAILABLE ARE:" + " " + getBooksCurrentlyAvailable();
    }̥


}

