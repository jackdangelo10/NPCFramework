package professions;

import characters.Character;

public class Physician extends Profession
{
    public Physician()
    {
        setProfName("Physician");
        super.researchOutput = 5;
        super.influenceOutput = 1;
        super.manpowerOutput = -1;
        super.foodOutput = -1;
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setINT(c.getINT() + 2);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setINT(c.getINT() - 2);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(c.getINT() < 10)
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
             skill += 30;
        }
        if(c.getTraits().containsKey("Clever"))
        {
             skill += 20;
        }
        if(c.getTraits().containsKey("Slow"))
        {
             skill -= 20;
        }
        return skill;
    }
}
