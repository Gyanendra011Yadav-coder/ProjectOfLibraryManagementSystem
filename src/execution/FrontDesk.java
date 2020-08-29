/*  Created by IntelliJ IDEA.
 *  User: GYANENDRA YADAV(Gyanendra011Yadav-coder)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class FrontDesk {
    public static final int EXIT = 4;
    private static final int ISSUE_A_BOOK = 1;
    private static final int RETURN_PREVIOUSLY_ISSUED_BOOKS = 2;
    private static final int SHOW_ALL_BOOKS_ISSUED = 3;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);


//OBJECT CREATED FOR BOOK
        Book bookobject = new Book();
        Library libraryObject = new Library();
        Student studentObject = new Student();
        System.out.println(" enter your first name");
        String firstname = scannerObject.nextLine();
        System.out.println("ENTER YOUR MIDDLE NAME:");
        String middlename = scannerObject.nextLine();
        System.out.println("ENTER YOUR LAST NAME:");
        String lastname = scannerObject.nextLine();
        System.out.println("ENTER YOUR ROLL NUMBER:");
        Long rollNumber = scannerObject.nextLong();

        scannerObject.nextLine();

        System.out.println("-=-=--=-=-\"Welcome," + firstname + ",To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        System.out.println("ENTER YOUR CHOICE FROM: [1,2,3,4]");


        int choice = scannerObject.nextInt();
        String bookName;
        int booksIssued;
        if (choice <= 4) {

            switch (choice) {
                case ISSUE_A_BOOK:
                    System.out.println("ENTER THE NAME OF BOOK, YOU WANT TO ISSUE:");
                    bookName = scannerObject.nextLine();
                    scannerObject.nextLine();
                    libraryObject.doCheckOut(bookName);
                    break;
                case RETURN_PREVIOUSLY_ISSUED_BOOKS:
                    System.out.println("ENTER THE NAME OF BOOK,YOU WANT TO RETURN:");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    libraryObject.doReturn(bookName);
                    break;
                case SHOW_ALL_BOOKS_ISSUED:
//                System.out.println("ENTER THE NUMBER OF BOOKS ISSUED");
//                booksIssued = scannerObject.nextInt();
                    studentObject.getBooksIssuedByStudent();
                    break;
                case EXIT:
                    break;
            }
        } else {
            System.out.println("PLEASE CHOOSE THE CORRECT OPTION???");
        }
        scannerObject.close();
    }


}


