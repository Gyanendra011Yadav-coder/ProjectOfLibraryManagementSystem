/*  Created by IntelliJ IDEA.
 *  User: Gyanendra Yadav (Gyanendra011Yadav-coder)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Objects;

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
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Library library = (Library) object;
        return Objects.equals(getBooksCurrentlyAvailable(), library.getBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBooksCurrentlyAvailable());
    }
}

