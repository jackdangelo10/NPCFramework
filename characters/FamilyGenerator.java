package characters;

import javax.management.BadAttributeValueExpException;

import characters.CharacterAttributes.Sex;

public class FamilyGenerator 
{
    private static NPCGenerator npcGenerator;
    private static Breeder breeder;

    public FamilyGenerator()
    {
        npcGenerator = new NPCGenerator();
        breeder = new Breeder();
    }

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
                testFamilyPrint(source);
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

    public Family generateFamily(int familySize)
    {
        Character source = npcGenerator.generateRandomAdultNPC();
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

    private void testFamilyPrint(Character source)
    {
        CharacterPrinter printer = new CharacterPrinter();
        for(Character c : source.getFamily().getMembers())
        {
            printer.printCharacter(c);
        }
    }

}
