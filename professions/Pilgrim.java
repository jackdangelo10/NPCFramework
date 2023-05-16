package professions;

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
}
