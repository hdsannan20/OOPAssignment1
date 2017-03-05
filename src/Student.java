
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hdsan
 */
public class Student extends Person{
    private String major;
    
    private  LocalDate  enrollmentDate;
    private int  studentNumber;
    private boolean goodStanding = true;
   
    
    public Student(String firstName,String lastName,String street,String city,String province,String postalCode,
                   LocalDate birthday,String major,int studentNumber,LocalDate enrollmentDate)
    {
        super(firstName, lastName, street, city, province, postalCode, birthday); //calls the constructor of the parent class
          this.major = major;
         setStudentNumber(studentNumber);
         
          
       
    }
      public int getYearEnrolled()
    {
         return enrollmentDate.getYear();
    }
     public int getYearsAtCollege()
    {
        LocalDate today = LocalDate.now();
        int yearsAtCollege =  Period.between(enrollmentDate, today).getYears();
        return yearsAtCollege;
       
    }
  
   
    public boolean inGoodStanding()
    {
       if (goodStanding == true)
       {
           return (true);
       }
       else return (false);
    }
    
    public void reinstateStudent()
    {
        inGoodStanding();      goodStanding = true;

    }
      public void setBirthday(LocalDate birthday)
      {
     LocalDate today = LocalDate.now();
        int age = Period.between(birthday, today).getYears();
        
        if (age >= 14 && age<= 19)
        {
          birthday = birthday;
         
        }
        else 
throw new IllegalArgumentException("Employees must be 15-90 years old");
    }
    public void setStudentNumber(int studentNumber)
    {
        if (studentNumber <=0)
        {
            throw new IllegalArgumentException ("Student must be a positive number: ");
        }
        
    }
    
    public void suspendStudent() {
        goodStanding = false;
        inGoodStanding();
    }
    
    @Override
    public String toString()
    {
        return String.format("%s%s, student number is %d",getFirstName(),getLastName());
    }
}
