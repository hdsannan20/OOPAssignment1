
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hdsan
 */
public class Instructor extends Person{
    private int employeeNum;
    private LocalDate hireDate;
    ArrayList teachableCoursesCodes;
    public Instructor(String firstName,String lastName,String street,String city,String province,String postalCode,LocalDate birthday,
            int employeeNumber, LocalDate hireDate)
    {
         super(firstName, lastName, street, city, province, postalCode, birthday);
           ArrayList<String> teachableCoursesCodes = new ArrayList<String>();
           
    }
    public void addTeachableCourse(String courseCode)
    {
       teachableCoursesCodes.add(courseCode);
    }
    public boolean canTeach(String courseCodes)
    {
        return true;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public ArrayList getTeachableCourses(String courseCode) {
       return teachableCoursesCodes;
    }
    public int getYearsAtCollege()
    {
         LocalDate today = LocalDate.now();
        int yearsAtCollege =  Period.between(hireDate, today).getYears();
        return yearsAtCollege;
    }
    public String listOfSubjectsCertifiedToTeach(String courseCodes)
    {
        return courseCodes;
    }
    public void addCourseToAbilities(String courseCodes)
    {
        
    }
    public void setBirthday(LocalDate birthday)
    {
        
    }
    public void setEmployeeNum()
    {
        
    }
    public void setHireDate(LocalDate hireDate )
    {
        this.hireDate = hireDate;   
    }
    @Override
    public String toString()
    {
        return String.format("",getFirstName(),getLastName(),employeeNum);
    }
}
