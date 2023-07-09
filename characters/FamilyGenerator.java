package characters;

import javax.management.BadAttributeValueExpException;

import characters.CharacterAttributes.Sex;

//designed to randomly generate a family of characters
public class FamilyGenerator 
{
    private static NPCGenerator npcGenerator;
    private static Breeder breeder;

    public FamilyGenerator()
    {
        npcGenerator = new NPCGenerator();
        breeder = new Breeder();
    }

    //***OUTDATED FIX **************************************************************** */
    public Family generateFamily()
    {
        Character source = npcGenerator.generateRandomAdultNPC();
        source.setSex(Sex.FEMALE);

        //husband generator
        if(Math.random() > .5)
        {
            try
            {
                //ensure male partner
                Character spouse = npcGenerator.generateRandomAdultNPC();
                spouse.setSex(Sex.MALE);


                MarriageMachine machine = new MarriageMachine(source, spouse);
                //marrying adds to family
                machine.marry();
                generateChildren(spouse, source);
            }
            catch(BadAttributeValueExpException e)
            {
                System.out.println(e.toString());
            }
            
        }
        else
        {
            if(Math.random() > .5)
            {
                source.setSex(Sex.MALE);
            }
        }
        return source.getFamily();
    }

    /**CURRENT WORKING FAMILY GENERATION **************************************************** */

    /**
     * @param familySize generates a family of this size
     * 1 implies one adult, 2 implies two adults, 3+ implies 2 adults and their offspring
     * @return the family object generated
     */
    public Family generateFamily(int familySize)
    {
        //first adult generated
        Character source = npcGenerator.generateRandomAdultNPC();
        source.getFamily().setFamilyName(source.getLastName());

        //randomizes the source character's sex
        if(Math.random() > .5)
        {
            source.setSex(Sex.FEMALE);
        }
        else
        {
            source.setSex(Sex.MALE);
        }
        if(familySize == 1)
        {
            return source.getFamily();
        }

        //generates a spouse
        // **NOTE** : for now I have only implemented heterosexual marriages in order to test the offspring system
        // I intended to include same sex marriage in the final version and implement an adoption system for orphans
        Character spouse = null;
        if(familySize > 1)
        {
            try
            {
                spouse = npcGenerator.generateRandomAdultNPC();
                spouse.setSex(source.getSex().getOpposite());

                MarriageMachine machine = new MarriageMachine(source, spouse);
                //marrying adds to family
                machine.marry();
            }
            catch(BadAttributeValueExpException e)
            {
                System.out.println(e.toString());
            }
        }

        //generates the appropriate amount of children
        if(familySize > 2)
        {
            int childrenNum = familySize - 2;
            for(int i = 0; i < childrenNum; i++)
            {
                try
                {
                    breeder.setCouple(spouse, source, null, null);
                }
                catch(BadAttributeValueExpException e)
                {
                    System.out.println(e.toString());
                }
            }
        }
        return source.getFamily();
    }

    //**OUTDATED ****************************************************************** */
    // generates a random amount of children up to 5
    private void generateChildren(Character spouse, Character source)
    {
        int count = 0;
        try
        {
            breeder.setCouple(spouse, source, null, null);
        }
        catch(BadAttributeValueExpException e)
        {
            System.out.println(e.toString());
        }
       
        while(Math.random() > .5 && count < 5)
        {
            try
            {
                breeder.breed();
            }
            catch(BadAttributeValueExpException e)
            {
                System.out.println(e.toString());
            }
            
        }
    }

}
