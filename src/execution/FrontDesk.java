/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.text.MessageFormat;
import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
//OBJECT CREATED FOR BOOK
        System.out.println("ENTER THE NAME OF THE BOOK, " +
                "NAME OF AUTHOR , AND PROVIDE ISBN NUMBER OF BOOK");
            Book bookobject = new Book(scannerObject.nextLine(),scannerObject.nextLine(),scannerObject.nextLine());
//        bookobject.setNameOfBooks("INDIAN POLITY");
//        bookobject.setNameOfAuthors("LAKSMIKANT");
//        bookobject.setIsbnNumberOfBooks("ADERCS12HG23B");

        System.out.println(
                        "BOOK NAME IS:" + " " + bookobject.getNameOfBooks() + ",\n" +
                        "BOOK AUTHOR NAME IS:" + " " + bookobject.getNameOfAuthors() + ",\n" +
                        "ISBN CODE OF THE BOOK IS:" + " " + bookobject.getIsbnNumberOfBooks());
//OBEJECT CREATED FOR STUDENT CLASS

//        Student studentobject = new Student();
//        studentobject.setNameOfStudent("GYAN YADAV");
//        studentobject.setStudentUniversityRollNo(191500309);
//        studentobject.setNumberOfBooksIssued(2);
//        System.out.println(
//                "STUDENT NAME:" + " " + studentobject.getNameOfStudent() + ",\n" +
//                "ISSUED BOOKS TO" + " " + studentobject.getNameOfStudent() + "," + studentobject.getNumberOfBooksIssued() + ",\n" +
//                "NAME OF BOOK ISSUED:" + studentobject.getNameOfBooksIssuedByStudent()
//                );

//NOW WE WILL CREATE A OBJECT OF LIBRARY CLASS AND CALL THEM
//        Library libraryobject = new Library();
//
//        System.out.println("NAME OF BOOKS AVAILABLE IN THE LIBRARY IS:" + " " + libraryobject.getBooksCurrentlyAvailable());

//CREATING A FIELD TO STORE THE INFORMATION OF THE STUDENT

    }
}
