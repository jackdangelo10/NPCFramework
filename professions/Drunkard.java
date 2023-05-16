package professions;

public class Drunkard extends Profession
{
    public Drunkard()
    {
        setProfName("Drunkard");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setINT(c.getINT() - 3);
        c.setPER(c.getPER() - 2);
        c.setCHR(c.getCHR() + 2);
        c.setSTR(c.getSTR() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setINT(c.getINT() + 3);
        c.setPER(c.getPER() + 2);
        c.setCHR(c.getCHR() - 2);
        c.setSTR(c.getSTR() - 1);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
