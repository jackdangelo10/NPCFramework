package professions;

import characters.Character;

public class Scholar extends Profession
{
    public Scholar()
    {
        setProfName("Scholar");
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
        boolean flag = true;
        if(c.getINT() < 13)
        {
            flag = false;
        }
        return flag;
    }

    @Override
    public int calculateProfessionSkill(Character c) 
    {
        if(c.isIncapable())
        {
            return 0;
        }
        int skill = c.getINT() * 2;
        if(c.getTraits().containsKey("Genius"))
        {
            skill += 35;
        }
        if(c.getTraits().containsKey("Clever"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Slow"))
        {
            skill -= 25;
        }
        return skill;
    }
}
