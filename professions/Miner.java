package professions;

import characters.Character;

public class Miner extends Profession
{
    public Miner()
    {
        setProfName("Miner");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setSTR(c.getSTR() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setSTR(c.getLCK() - 1);
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
        int skill = c.getSTR() + c.getCON();
        if(c.getTraits().containsKey("Strong"))
        {
            skill += 15;
        }
        if(c.getTraits().containsKey("Weak"))
        {
            skill -= 15;
        }
        return skill;
    }
}
