package professions;

public class Steward extends Profession
{
    public Steward()
    {
        setProfName("Steward");
        super.cultureOutput = 1;
        super.goldOutput = 3;
        super.influenceOutput = 1;
        super.foodOutput = -1;
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
    public int calculateProfessionSkill(characters.Character c) 
    {
        if(c.isIncapable())
        {
            return 0;
        }
        int skill = c.getCHR() + c.getINT();
        return checkProfessionSkill(c, skill);
    }
}
