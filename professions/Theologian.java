package professions;

public class Theologian extends Profession
{
    Theologian()
    {
        setProfName("Theologian");
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
        if(c.getINT() < 13)
        {
            flag = false;
        }
        if(!c.getTraits().containsKey("Zealous"));
        {
            flag = false;
        }
        return flag;
    }
}
