/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {

    private String[] booksCurrentlyAvailable = new String[100];

    public String[] getBooksCurrentlyAvailable() {
        return booksCurrentlyAvailable;
    }

    public void setBooksCurrentlyAvailable(String[] booksCurrentlyAvailable) {
        this.booksCurrentlyAvailable = booksCurrentlyAvailable;
    }


//    public Library(){
//        for ( int i =0 ; i < booksCurrentlyAvailable.length; i++){
//
//            this.booksCurrentlyAvailable[i] = "Discrete MathMatics";
//            this.booksCurrentlyAvailable[i+1] ="Operating System";
//            this.booksCurrentlyAvailable[i+2] ="DataBase Managemnet System";
//
//        }
//    }
}