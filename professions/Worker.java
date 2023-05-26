package professions;

public class Worker extends Profession
{
    public Worker()
    {
        setProfName("Worker");
        super.goldOutput = 1;
        super.manpowerOutput = 2;
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
        int skill = c.getSTR() + c.getDEX();
        return checkProfessionSkill(c, skill);
    }
}
