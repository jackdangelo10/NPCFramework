package professions;

import characters.Character;

public class Banker extends Profession
{
    public Banker()
    {
        setProfName("Banker");
        super.foodOutput = -1;
        super.goldOutput = 7;
        super.influenceOutput = 2;
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
        int skill = c.getCHR() + c.getINT();
        if(c.getTraits().containsKey("Awkward"))
        {
            skill -= 15;
        }
        if(c.getTraits().containsKey("Deranged"))
        {
            skill -= 25;
        }
        if(c.getTraits().containsKey("Frugal"))
        {
            skill += 30;
        }
        if(c.getTraits().containsKey("Generous"))
        {
            skill -= 10;
        }
        if(c.getTraits().containsKey("Cultured"))
        {
            skill += 5;
        }
        if(c.getTraits().containsKey("Honest"))
        {
            skill -= 5;
        }
        return checkProfessionSkill(c, skill);
    }
}
