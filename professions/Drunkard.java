package professions;

import characters.Character;

public class Drunkard extends Profession
{
    public Drunkard()
    {
        setProfName("Drunkard");
        super.foodOutput = -3;
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setINT(c.getINT() - 3);
        c.setPER(c.getPER() - 2);
        c.setCHR(c.getCHR() + 2);
        c.setSTR(c.getSTR() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setINT(c.getINT() + 3);
        c.setPER(c.getPER() + 2);
        c.setCHR(c.getCHR() - 2);
        c.setSTR(c.getSTR() - 1);
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
        int skill = c.getCON() + c.getCHR();
        if(c.getTraits().containsKey("Charming"))
        {
            skill += 10;
        }
        if(c.getTraits().containsKey("Cruel"))
        {
            skill -= 35;
        }
        if(c.getTraits().containsKey("Depressed"))
        {
            skill -= 20;
        }
        if(c.getTraits().containsKey("Generous"))
        {
            skill += 10;
        }
        if(c.getTraits().containsKey("Brave"))
        {
            skill += 5;
        }
        return skill;
    }
}
