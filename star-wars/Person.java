
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private String birthRegion;
    private String birthCity;


    /**
     * Constructor for objects of class Person
     */
    public Person(String firstName, String lastName, String birthRegion, String birthCity)
    {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthRegion = birthRegion;
        this.birthCity = birthCity;
        
    
    }

    /**
     * @return the first name of a Person
     */
    public String getFirstName()
    {
        // put your code here
        return firstName;
    }
    
    /**
     * @return the last name of a Person
     */
    public String getLastName()
    {
        // put your code here
        return lastName;
    }
    
    /**
     * @return the birth region of a Person
     */
    public String getBirthRegion()
    {
        // put your code here
        return birthRegion;
    }
    
    /**
     * @return the first name of a Person
     */
    public String getBirthCity()
    {
        // put your code here
        return birthCity;
    }
}
