/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String nameOfStudent;
//    private String middleNameOfStudent;
//    private String lastNameOfStudent;
    private long studentUniversityRollNo;
    private int numberOfBooksIssued;
    private  String[] nameOfBooksIssuedByStudent = new String[100];


//NOW, WE WILL CREATE GETTER METHOD FOR ABOVE FIELDS

    public String getNameOfStudent(){
         return nameOfStudent;
    }
    public long getStudentUniversityRollNo(){
        return  getStudentUniversityRollNo();
    }
    public int getNumberOfBooksIssued(){
        return numberOfBooksIssued;
    }
    public  String getNameOfBooksIssuedByStudent(){
        return  getNameOfBooksIssuedByStudent();
    }
}
