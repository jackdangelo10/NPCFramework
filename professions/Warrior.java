package professions;

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
}
