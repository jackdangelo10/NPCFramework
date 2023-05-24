package professions;

public abstract class Profession 
{
    protected double chance;
    public void setChance(double c) {chance = c;}
    public double getChance() {return chance;} 

    protected String profName;
    public void setProfName(String s) {profName = s;}
    public String getProfName() {return profName;}

    abstract public void modifyCharacter(characters.Character c);
    abstract public void revertCharacter(characters.Character c);
    abstract public boolean satisfyAllConditions(characters.Character c);
    abstract public int calculateProfessionSkill(characters.Character c);

    protected int checkProfessionSkill(characters.Character c, int skill)
    {
        if(skill > 100)
        {
            skill = 100;
        }
        if(skill < 0)
        {
            skill = 0;
        }
        return skill;
    }

}
