package professions;

import characters.Character;

public class Fisher extends Profession
{

    public Fisher()
    {
        setProfName("Fisher");
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
        int skill = c.getDEX() + c.getPER();
        if(c.getTraits().containsKey("Slothful"))
        {
            skill += 15;
        }
        return skill;
    }

    
}
