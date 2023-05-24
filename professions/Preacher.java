package professions;

import characters.Character;

public class Preacher extends Profession
{
    public Preacher()
    {
        setProfName("Preacher");
        super.cultureOutput = 5;
        super.foodOutput = -1;
        super.influenceOutput = 1;
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() + 20);
    }


    public void revertCharacter(characters.Character c)
    {
        c.setBaseReputation(c.getBaseReputation() - 20);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = false;

        if(c.getTraits().containsKey("Zealous"))
        {
            flag = true;
        
        }
        if(c.getGFT() < 7)
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
        int skill = c.getCHR() + c.getPER();
        if(c.getTraits().containsKey("Zealous"))
        {
            skill += 25;
        }
        if(c.getTraits().containsKey("Cynical"))
        {
            skill -= 25;
        }
        return skill;
    }

    
}
