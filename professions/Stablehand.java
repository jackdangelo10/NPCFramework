package professions;

import characters.Character;

public class Stablehand extends Profession
{
    public Stablehand()
    {
        setProfName("Stablehand");
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
        int skill = c.getCON() + c.getPER();
        if(c.getTraits().containsKey("Impatient"))
        {
            skill -= 10;
        }
        if(c.getTraits().containsKey("Compassionate"))
        {
            skill += 15;
        }
        return skill;
    }
}
