package characters;

import javax.management.BadAttributeValueExpException;
import characters.CharacterAttributes.Sex;

public class MarriageMachine 
{
    private static Character male = null;
    private static Character female = null;

    public MarriageMachine(Character p1, Character p2) throws BadAttributeValueExpException
    {
        setCouple(p1, p2);
    }

    public void marry()
    {
        if(Math.random() > .5)
        {
            female.setLastName(male.getLastName());
            male.setFamily(female.getFamily());
            male.getFamily().addMember(male);
            male.getFamily().addRelationship(male, "Wife", female);
            male.getFamily().addRelationship(female, "Husband", male);
        }
        else
        {
            male.setLastName(female.getLastName());
            female.setFamily(male.getFamily());
            female.getFamily().addMember(female);
            female.getFamily().addRelationship(male, "Wife", female);
            female.getFamily().addRelationship(female, "Husband", male);
        }

    }

    public void reset()
    {   
        male = null;
        female = null;
    }

    public void checkConditions(Character p1, Character p2) throws BadAttributeValueExpException
    {
        if(p1.getSex() == Sex.MALE && p2.getSex() == Sex.MALE)
        {
            throw new BadAttributeValueExpException("Both men");
        }
        if(p1.getSex() == Sex.FEMALE && p2.getSex() == Sex.FEMALE)
        {
            throw new BadAttributeValueExpException("Both women");
        }
        if(p1.getAge() == CharacterAttributes.Age.CHILD || p2.getAge() == CharacterAttributes.Age.CHILD)
        {
            throw new BadAttributeValueExpException("Ethan Paragus error");
        }
    }

    public void setCouple(Character p1, Character p2) throws BadAttributeValueExpException
    {
        try
        {
            checkConditions(p1, p2);
            if(p1.getSex() == Sex.MALE)
            {
                male = p1;
                female = p2;
            }
            else
            {
                male = p2;
                female = p1;
            }
        }
        catch(BadAttributeValueExpException e)
        {
            System.out.println(e.toString());
        }
    }
}
