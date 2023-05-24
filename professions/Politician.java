package professions;

import characters.Character;

public class Politician extends Profession
{
    public Politician()
    {
        setProfName("Politician");
        super.policyOutput = 7;
        super.foodOutput = -1;
        super.happinessOutput = -1;
    }

    public void modifyCharacter(characters.Character c)
    {
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }

    @Override
    public int calculateProfessionSkill(Character c) 
    {
        if(c.isIncapable())
        {
            return 0;
        }
        int skill = c.getINT() + c.getCHR();
        if(c.getTraits().containsKey("Charming"))
        {
            skill += 20;
        }
        if(c.getTraits().containsKey("Deceitful"))
        {
            skill += 5;
        }
        if(c.getTraits().containsKey("Honest"))
        {
            skill -= 10;
        }
        return skill;
    }
}
