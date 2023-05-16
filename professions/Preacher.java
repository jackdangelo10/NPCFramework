package professions;

public class Preacher extends Profession
{
    public Preacher()
    {
        setProfName("Preacher");
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
}
