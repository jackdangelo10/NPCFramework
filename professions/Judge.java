package professions;

import characters.Character;

public class Judge extends Profession
{
    Judge()
    {
        setProfName("Judge");
        super.policyOutput = 6;
        super.foodOutput = -1;
        super.cultureOutput = 1;
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
        int skill = c.getINT() + c.getPER();
        if(c.getTraits().containsKey("Just"))
        {
            skill += 20;
        }
        if(c.getTraits().containsKey("Impatient"))
        {
            skill -= 15;
        }
        return skill;
    }

    
}
