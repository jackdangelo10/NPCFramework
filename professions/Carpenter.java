package professions;

import characters.Character;

public class Carpenter extends Profession
{
    public Carpenter()
    {
        setProfName("Carpenter");
        super.manpowerOutput = 4;
        super.foodOutput = -1;
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
        int skill = c.getDEX() + c.getSTR();
        if(c.getTraits().containsKey("Inventive"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Disciplined"))
        {
            skill += 15;
        }
        if(c.getTraits().containsKey("Impatient"))
        {
            skill -= 10;
        }
        if(c.getTraits().containsKey("Strong"))
        {
            skill += 5;
        }
        if(c.getTraits().containsKey("Weak"))
        {
            skill -= 5;
        }
        return skill;
    }
}
