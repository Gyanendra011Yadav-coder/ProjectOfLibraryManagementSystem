/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;

public class FrontDesk {
    public static void main(String[] args) {
//OBJECT CREATED FOR BOOK
        Book bookobject = new Book();
        System.out.println(
                       "BOOK NAME IS:"+" "+bookobject.getNameOfBooks() +",\n"+
                               "BOOK AUTHOR NAME IS:"+" "+bookobject.getNameOfAuthors() +",\n" +
                        "ISBN CODE OF THE BOOK IS:"+" "+ bookobject.getIsbnNumberOfBooks() );
//OBEJECT CREATED FOR STUDENT CLASS
        Student studentobject = new Student();
            studentobject.getNameOfStudent();
            studentobject.getStudentUniversityRollNo();
             studentobject.getNumberOfBooksIssued();
            studentobject.getNameOfBooksIssuedByStudent();

    }
}
