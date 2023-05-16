package professions;

public class Miner extends Profession
{
    public Miner()
    {
        setProfName("Miner");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setSTR(c.getSTR() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setSTR(c.getLCK() - 1);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return true;
    }
}
