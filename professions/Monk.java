package professions;

import characters.Character;

public class Monk extends Profession
{
    public Monk()
    {
        setProfName("Monk");
        super.cultureOutput = 5;
        super.foodOutput = -1;
        super.researchOutput = 3;
        super.manpowerOutput = -1;
        super.influenceOutput = 1;
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() + 1);
        c.setGFT(c.getGFT() + 1);
        c.setINT(c.getINT() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() - 1);
        c.setGFT(c.getGFT() - 1);
        c.setINT(c.getINT() - 1);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(!c.getTraits().containsKey("Zealous"))
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
       int skill = c.getINT() + c.getGFT();
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
