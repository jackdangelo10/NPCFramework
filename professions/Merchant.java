package professions;

public class Merchant extends Profession
{
    public Merchant()
    {
        setProfName("Merchant");
    }

    public void modifyCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() + 1);
        c.setGFT(c.getGFT() + 1);
        c.setCHR(c.getCHR() + 1);
        return;
    }


    public void revertCharacter(characters.Character c)
    {
        c.setLCK(c.getLCK() - 1);
        c.setGFT(c.getGFT() - 1);
        c.setCHR(c.getCHR() - 1);
        return;
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        boolean flag = true;
        if(c.getCHR() < 7)
        {
            flag = false;
        }
        return flag;
    }
}
