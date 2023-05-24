package professions;

import characters.Character;

public class Merchant extends Profession
{
    public Merchant()
    {
        setProfName("Merchant");
        super.goldOutput = 6;
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() + 1);
        c.setGFT(c.getGFT() + 1);
        c.setCHR(c.getCHR() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() - 1);
        c.setGFT(c.getGFT() - 1);
        c.setCHR(c.getCHR() - 1);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(c.getCHR() < 7)
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
        int skill = c.getCHR() + c.getLCK();
        if(c.getTraits().containsKey("Charming"))
        {
            skill += 20;
        }
        if(c.getTraits().containsKey("Shy"))
        {
            skill -= 10;
        }
        if(c.getTraits().containsKey("Cultulred"))
        {
            skill += 5;
        }
        return skill;
    }

    
}
