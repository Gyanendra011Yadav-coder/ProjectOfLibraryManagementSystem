/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Book {

   private  String nameOfBooks;

   private String nameOfAuthors;
//  since it Should be a of 13 Digits
   private String isbnNumberOfBooks;


   //CREATING THE GETTER METHOD FOR THE FIELDS
    public String getNameOfBooks(){
        return nameOfBooks;
    }
    public String getNameOfAuthors(){
        return nameOfAuthors;
    }
    public String getIsbnNumberOfBooks(){
        return isbnNumberOfBooks;
    }

    }

