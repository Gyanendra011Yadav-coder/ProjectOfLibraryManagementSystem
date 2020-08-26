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
        Book bookobject = new Book("DBMS" ,"Kneath Rosan","1254788521550");
        System.out.println(bookobject);


        Library libraryObject = new Library("Discrete Mathmatics");
        System.out.println(libraryObject);


        Student studentObject = new Student("GYAN","YADAV","YADUVANSHI",
                191500309 ,11);
        System.out.println(studentObject);
    }
}
