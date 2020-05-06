
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.ArrayList;

public class NameGenerator
{
    private ArrayList<Person> persons;

    /**
     * Constructor for objects of class NameGenerator by default
     */
    public NameGenerator()
    {
        persons = new ArrayList<Person>();
    }
    
    /**
     * Constructor for objects of class NameGenerator; takes a person as argument
     */
    public NameGenerator(Person person)
    {
        persons = new ArrayList<Person>();
        if(person != null)
        {
            persons.add(person);
        }
        
    }
    
    /**
     * Constructor for objects of class NameGenerator; takes an array of persons as argument
     */
    public NameGenerator(ArrayList<Person> persons)
    {
        this.persons = new ArrayList<Person>();
        if(persons != null)
        {
            this.persons = persons;
        }
        
    }

    /**
     * add a new Person in the name generator
     */
    
    public void addPerson(Person person)
    {
        if(person != null)
        {
            persons.add(person);
        }
    }
    
    /**
     * generate a Person (given as argument) nickname based on their infos
     */
    public String generateName(Person person)
    {
        String returnValue = "La personne n'existe pas ! :(";
      
        
        for(Person p : persons)
        {
            if(p == person)
            {
                String returnedFirstName = "";
                String returnedLastName = "";

                //génère le prénom
                //on commence par récupérer les 3 premières lettres du nom
                 returnedFirstName += p.getFirstName().substring(0,1).toUpperCase()  ; //on récupère d'abord le premier qu'on met en majuscule
                returnedFirstName += p.getFirstName().substring(1,3); //puis les 2 suivants et on les concatène à la chaine à renvoyer
        
                   //on récupère ensuite les deux dernières lettres du prénom
                returnedFirstName += p.getLastName().substring(p.getLastName().length()-2,p.getLastName().length());
       
        
                //génère le nom
                //on récupère les deux premières lettres du département de naissance
                returnedLastName +=  p.getBirthRegion().substring(0,1).toUpperCase() ; //on récupère d'abord le premier qu'on met en majuscule
                returnedLastName += p.getBirthRegion().substring(1,2) ; //puis la deuxième
        
                //on récupère trois lettres au hasard dans la ville de naissance
                //on tire au hasard trois chiffres entre 0 et la taille du nom de la ville - 1
                int i = 0; 
                int j = 0;
                int k = 0;
                Random r = new Random();
                i = r.nextInt(p.getBirthCity().length());
            
                do{
                    j = r.nextInt(p.getBirthCity().length());
                    k = r.nextInt(p.getBirthCity().length());
                }while(i==j || i == k);//on prend des lettres différentes pour des raisons d'esthéthique (subjectives)...
                returnedLastName += p.getBirthCity().substring(i,i+1).toLowerCase(); // et on concatène le caractère numéro i
                returnedLastName += p.getBirthCity().substring(j,j+1).toLowerCase() ; //caractère numéro j
                returnedLastName+= p.getBirthCity().substring(k,k+1).toLowerCase(); //caractère numéro k
            
       
                returnValue = returnedFirstName + " " + returnedLastName;
        
        
       
               }
            
            
        
        }
        
        return returnValue;
    }
    
}
