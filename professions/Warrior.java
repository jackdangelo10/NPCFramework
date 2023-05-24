package professions;

import characters.Character;

public class Warrior extends Profession
{
    public Warrior()
    {

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
        if(c.isIncapable())
        {
            return 0;
        }
        int skill = (int)(c.getSTR() * 2.5);
        if(c.getTraits().containsKey("Strong"))
        {
            skill += 20;
        }
        if(c.getTraits().containsKey("Brave"))
        {
            skill += 20;
        }
        if(c.getTraits().containsKey("Craven"))
        {
            skill -= 30;
        }
        if(c.getTraits().containsKey("Weak"))
        {
            skill -= 20;
        }
        if(c.getTraits().containsKey("Frail"))
        {
            skill -= 15;
        }
        if(c.getTraits().containsKey("Overweight"))
        {
            skill -= 15;
        }
        if(c.getTraits().containsKey("Pacifist"))
        {
            skill -= 30;
        }
        if(c.getTraits().containsKey("Warmonger"))
        {
            skill += 30;
        }
        return skill;
    }

    
}
