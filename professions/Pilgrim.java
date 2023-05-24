package professions;

import characters.Character;

public class Pilgrim extends Profession
{
    public Pilgrim()
    {
        setProfName("Pilgrim");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setGFT(c.getGFT() + 2);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setGFT(c.getGFT() - 2);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(!c.getTraits().containsKey("Zealous"))
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
        int skill = c.getPER() + c.getINT();
        return skill;
    }

    
}
