
import java.time.LocalDate;
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


 
public class Person {
    private String firstName, lastName, streetAddress,city,province,postalCode;
    
    private  LocalDate birthDate;
    /*
    *Constructor with instances of all variables
    */
    public Person(String firstName,String lastName,String street,String city,String province,String postalCode,LocalDate birthDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }
/*
    set methods that accepts variables as arguments 
    */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String street) {
        this.streetAddress = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }
/*
    set method for validating given postal code is 6 characters
    */
    public void setPostalCode(String postalCode) {
        
        if (postalCode.length() > 6 || postalCode.length() <6)
        {
             throw new IllegalArgumentException("Please enter only 6 characters postal code: ");
        }    
       this.postalCode = postalCode.substring(0,6);
    }
            
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;   
    }
    /*
    get age method for calculating age from given birth date
    all get methods will return the variable values
    */
    public int  getAge()
    {
        LocalDate today = LocalDate.now();
        int age =  Period.between(birthDate, today).getYears();
        return age;
        
    }
    public String  getFullAddress() {
        
        return  this.streetAddress + this.city + this.province + this.postalCode;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public LocalDate getBirthDate(
    ) {
        return birthDate;
    }
   public int getYearBorn() {
         return birthDate.getYear();    
    }
     public void changeAddress(String street, String city,String province, String postalCode) {
        this.streetAddress = street;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;       
    } 
}
