package professions;

import characters.Character;

public class Barkeeper extends Profession 
{
    public Barkeeper()
    {
        setProfName("Barkeeper");
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

        int skill = c.getCHR() + c.getPER();
        if(c.getTraits().containsKey("Charming"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Shy"))
        {
            skill -= 20;
        }
        if(c.getTraits().containsKey("Awkward"))
        {
            skill -= 25;
        }
        if(c.getTraits().containsKey("Cultured"))
        {
            skill += 15;
        }
        if(c.getTraits().containsKey("Compassionate"))
        {
            skill += 10;
        }
        return skill;
    }
}
