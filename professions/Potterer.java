package professions;

public class Potterer extends Artist
{
    public Potterer()
    {
        setProfName("Potterer");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setGFT(c.getGFT() + 3);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setGFT(c.getGFT() - 3);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = super.satisfyAllConditions(c);
        return flag;
    }
}
