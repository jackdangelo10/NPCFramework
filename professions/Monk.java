package professions;

public class Monk extends Profession
{
    public Monk()
    {
        setProfName("Monk");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() + 1);
        c.setGFT(c.getGFT() + 1);
        c.setINT(c.getINT() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() - 1);
        c.setGFT(c.getGFT() - 1);
        c.setINT(c.getINT() - 1);
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
}
