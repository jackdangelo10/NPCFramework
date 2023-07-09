package characters;

import javax.management.BadAttributeValueExpException;


//class to marry two characters and assign each other as spouses and to the same family
public class MarriageMachine 
{
    private static Character p1 = null;
    private static Character p2 = null;

    public MarriageMachine(Character character1, Character character2) throws BadAttributeValueExpException
    {
        setCouple(character1, character2);
    }

    /**
     * marries the two characters together
     */
    public void marry()
    {
        //temporary measure to test offspring generation
        if(p2.getTraits().containsKey("Homosexual") || p1.getTraits().containsKey("Homosexual"))
        {
            return;
        }
        p2.setFamily(null);
        p1.setFamily(null);
        
        //create new family together as default
        /**
         * NOTE
         * eventually there will be a dynasty/inheritance system that will be implemented which will make this
         * a bit more complex
         * Possibly the NPCs will get to choose which family they stay part of or whether they break off to form
         * a new family line. This will be affected by the culture of the civilization they are part of
         */
        
        Family family = new Family();
        p2.setFamily(family);
        p1.setFamily(family);

        family.addMember(p2);
        family.addMember(p1);

        p1.setSpouse(p2);
        p2.setSpouse(p1);
        
        if(Math.random() > .5)
        {
            p2.setLastName(p1.getLastName());
        }
        else
        {
            p1.setLastName(p2.getLastName());
        }

    }

    /**
     * resets variables
     */
    public void reset()
    {   
        p1 = null;
        p2 = null;
    }

    /**
     * checks if the characters are children
     * @param p1 - input character 1
     * @param p2 - input character 2
     * @throws BadAttributeValueExpException
     */
    public void checkConditions(Character p1, Character p2) throws BadAttributeValueExpException
    {
        if(p1.getAge() == CharacterAttributes.Age.CHILD || p2.getAge() == CharacterAttributes.Age.CHILD)
        {
            throw new BadAttributeValueExpException("One or more of characters are children.");
        }
    }

    /**
     * assigns couple after checks
     * @param character1
     * @param character2
     * @throws BadAttributeValueExpException
     */
    public void setCouple(Character character1, Character character2) throws BadAttributeValueExpException
    {
        try
        {
            checkConditions(character1, character2);
            p1 = character1;
            p2 = character2;

        }
        catch(BadAttributeValueExpException e)
        {
            System.out.println(e.toString());
        }
    }
}
