/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Club
{
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
       members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        if(member != null){
            members.add(member);
        }
    }
   

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
     /**
     * @return The number of members (Membership objects) who have joined in a mounth and a year given as arguments
     */
    
    public int numberMembersJoinedInMY(int mounth, int year)
    {
        int i = 0;
        
        for(Membership m : members)
        {
            if(m.getMonth() == mounth && m.getYear() == year )
            {
                i++;
            }
        }
        
        return i;
    }
    
    /**
     * @return members (Membership objects) who have joined in a mounth and a year given as arguments
     */
    public ArrayList<Membership> membersJoinedInMY(int mounth, int year)
    {
        ArrayList<Membership> returnValue = new ArrayList<Membership>();
        
        for(Membership m : members)
        {
            if(m.getMonth() == mounth && m.getYear() == year)
            {
                returnValue.add(m);
            }
        }
        
        return returnValue;
    }
    
}
