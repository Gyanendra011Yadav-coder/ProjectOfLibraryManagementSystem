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
    private String[] nameOfBooksIssuedByStudent = new String[nameOfStudent.length()];


//NOW, WE WILL CREATE GETTER METHOD FOR ABOVE FIELDS

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public long getStudentUniversityRollNo() {
        return getStudentUniversityRollNo();
    }

    public void setStudentUniversityRollNo(long studentUniversityRollNo) {
        this.studentUniversityRollNo = studentUniversityRollNo;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public String[] getNameOfBooksIssuedByStudent() {
        return getNameOfBooksIssuedByStudent();
    }
}
