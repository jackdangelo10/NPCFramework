package professions;

import characters.Character;

public class Alchemist extends Profession
{
    public Alchemist()
    {
        setProfName("Alchemist");
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
        int skill = c.getINT() + c.getGFT();
        if(c.getTraits().containsKey("Blinded"))
        {
            skill -= 20;
        }
        if(c.getTraits().containsKey("Slow"))
        {
            skill -= 25;
        }

        if(c.getTraits().containsKey("Deceitful"))
        {
            skill += 5;
        }
        if(c.getTraits().containsKey("Inventive"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Genius"))
        {
            skill += 35;
        }
        if(c.getTraits().containsKey("Clever"))
        {
            skill += 15;
        }
        return checkProfessionSkill(c, skill);
    }
}
