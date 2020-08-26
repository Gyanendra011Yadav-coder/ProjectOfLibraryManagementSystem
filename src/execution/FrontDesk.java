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
import java.util.Arrays;
import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
//OBJECT CREATED FOR BOOK
        System.out.println("ENTER THE NAME OF THE BOOK: \n " +
                "NAME OF AUTHOR\n PROVIDE ISBN NUMBER OF BOOK:");
        System.out.println("ENTER THE FIRST NAME: \n ENTER THE MIDDLE NAME: \n ENTER THE LAST NAME: \n ENTER THE UNIVERSITY ROLL NO.: \n " +
                "ENTER THE NUMBER OF BOOK ISSUED: \n   ");
            Book bookobject = new Book(scannerObject.nextLine(),scannerObject.nextLine(),scannerObject.nextLine());
//        bookobject.setNameOfBooks("INDIAN POLITY");
//        bookobject.setNameOfAuthors("LAKSMIKANT");
//        bookobject.setIsbnNumberOfBooks("ADERCS12HG23B");

        System.out.println(
                        "BOOK NAME IS:" + " " + bookobject.getNameOfBooks() + ",\n" +
                        "BOOK AUTHOR NAME IS:" + " " + bookobject.getNameOfAuthors() + ",\n" +
                        "ISBN CODE OF THE BOOK IS:" + " " + bookobject.getIsbnNumberOfBooks());


        Student studentobject = new Student(scannerObject.nextLine(),scannerObject.nextLine(),scannerObject.nextLine(),
                scannerObject.nextLong(),scannerObject.nextInt());
//        studentobject.setFirstNameOfStudent("gyan");
//        studentobject.setMiddleNameOfStudent("kumar");
//        studentobject.setLastNameOfStudent("YADAV");
//        studentobject.setStudentUniversityRollNo(191500309);
//        studentobject.setNumberOfBooksIssued(2);
        System.out.println(
                "STUDENT NAME:" + " " + studentobject.getFirstNameOfStudent()+" "+studentobject.getMiddleNameOfStudent()+" "+studentobject.getLastNameOfStudent()+"\n" +
                "ISSUED BOOKS TO" + " " + studentobject.getFirstNameOfStudent() + "," + studentobject.getNumberOfBooksIssued() + ",\n" +
                "NAME OF BOOK ISSUED:" + Arrays.toString(studentobject.getNameOfBooksIssuedByStudent())
                );

//NOW WE WILL CREATE A OBJECT OF LIBRARY CLASS AND CALL THEM
//        Library libraryobject = new Library();
//
//        System.out.println("NAME OF BOOKS AVAILABLE IN THE LIBRARY IS:" + " " + libraryobject.getBooksCurrentlyAvailable());

//CREATING A FIELD TO STORE THE INFORMATION OF THE STUDENT

    }
}
