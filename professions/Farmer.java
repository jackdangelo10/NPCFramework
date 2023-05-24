package professions;

import characters.Character;

public class Farmer extends Profession
{
    public Farmer()
    {
        setProfName("Farmer");
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
        int skill = c.getSTR() * 2;
        if(c.getTraits().containsKey("Strong"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Weak"))
        {
            skill -= 20;
        }
        if(c.getTraits().containsKey("Frail"))
        {
            skill -= 15;
        }
        return skill;
    }

    
}
