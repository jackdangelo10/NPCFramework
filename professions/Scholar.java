package professions;

public class Scholar extends Profession
{
    public Scholar()
    {
        setProfName("Scholar");
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
        return flag;
    }
}
