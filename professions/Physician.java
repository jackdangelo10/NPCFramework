package professions;

public class Physician extends Profession
{
    public Physician()
    {
        setProfName("Physician");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setINT(c.getINT() + 2);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setINT(c.getINT() - 2);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(c.getINT() < 10)
        {
            flag = false;
        }
        return flag;
    }
}
