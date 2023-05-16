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
}
