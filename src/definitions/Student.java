/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long studentUniversityRollNo;
    private int numberOfBooksIssued;
    private String[] nameOfBooksIssuedByStudent = new String[100];


//NOW, WE WILL CREATE GETTER METHOD FOR ABOVE FIELDS

    public Student(String firstNameOfStudent, String secondNameOfStudent, String lastNameOfStudent,
                   long studentUniversityRollNo, int numberOfBooksIssued) {
        this.firstNameOfStudent = firstNameOfStudent;
        this.middleNameOfStudent = middleNameOfStudent;
        this.lastNameOfStudent = lastNameOfStudent;
        this.studentUniversityRollNo = studentUniversityRollNo;
        this.numberOfBooksIssued = numberOfBooksIssued;


    }

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getStudentUniversityRollNo() == student.getStudentUniversityRollNo() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getFirstNameOfStudent(), student.getFirstNameOfStudent()) &&
                Objects.equals(getMiddleNameOfStudent(), student.getMiddleNameOfStudent()) &&
                Objects.equals(getLastNameOfStudent(), student.getLastNameOfStudent()) &&
                Arrays.equals(getNameOfBooksIssuedByStudent(), student.getNameOfBooksIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getStudentUniversityRollNo(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssuedByStudent());
        return result;
    }
}
