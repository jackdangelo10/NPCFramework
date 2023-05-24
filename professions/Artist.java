package professions;

import characters.Character;

public class Artist extends Profession
{
    public Artist()
    {
        setProfName("Artist");
        super.influenceOutput = 2;
        super.cultureOutput = 5;
        super.foodOutput = -1;
        super.goldOutput = -1;
        super.happinessOutput = 2;

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
        if(c.getGFT() < 10)
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
        int skill = c.getDEX() + c.getGFT();
        if(c.getTraits().containsKey("Impatient"))
        {
            skill -= 15;
        }
        if(c.getTraits().containsKey("Disciplined"))
        {
            skill += 15;
        }
        if(c.getTraits().containsKey("Inventive"))
        {
            skill += 10;
        }
        if(c.getTraits().containsKey("Deranged"))
        {
            skill += 25;
        }
        return skill;
    }

    
}
