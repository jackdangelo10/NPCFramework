package professions;

import characters.Character;

public class Brewer extends Profession
{
    public Brewer()
    {
        setProfName("Brewer");
        super.happinessOutput = 4;
        super.foodOutput = 2;
        super.manpowerOutput = -1;
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
        
        int skill = c.getDEX() + c.getCON();
        if(c.getTraits().containsKey("Impatient"))
        {
            skill -= 15;
        }
        if(c.getTraits().containsKey("Disciplined"))
        {
            skill += 15;
        }
        return skill;
    }
}
