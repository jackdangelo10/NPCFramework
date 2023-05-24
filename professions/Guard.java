package professions;

import characters.Character;

public class Guard extends Warrior
{
    Guard()
    {
        setProfName("Guard");
        super.manpowerOutput = -1;
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setSTR(c.getSTR() + 2);
        c.setBaseReputation(c.getBaseReputation() + 10);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setSTR(c.getSTR() - 2);
        c.setBaseReputation(c.getBaseReputation() + 10);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(c.getSTR() < 10)
        {
            flag = false;
        } 
        return flag;
    }

    @Override
    public int calculateProfessionSkill(Character c) 
    {
        return super.calculateProfessionSkill(c);
    }



}
