package professions;

public class Mercenary extends Warrior
{
    Mercenary()
    {
        setProfName("Mercenary");
        super.goldOutput = 2;
        super.foodOutput = -1;
    }

    public void modifyCharacter(characters.Character c)
    {
        super.modifyCharacter(c);
        c.setBaseReputation(c.getBaseReputation() + 5);
    }

    public void revertCharacter(characters.Character c)
    {
        super.revertCharacter(c);
        c.setBaseReputation(c.getBaseReputation() - 5);
    }

    public boolean satisfyAllConditions(characters.Character c)
    {
        return super.satisfyAllConditions(c);
    }

    
}
