package professions;

import characters.Character;

public class Miller extends Profession
{
    public Miller()
    {
        setProfName("Miller");
        super.cultureOutput = 0;
        super.goldOutput = 1;
        super.influenceOutput = 0;
        super.foodOutput = 2;
        super.researchOutput = 0;
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
        return checkProfessionSkill(c, skill);
    }

    
}  

