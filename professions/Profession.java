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

    protected int happinessOutput = 0;
    protected int foodOutput = 0;
    protected int researchOutput = 0;
    protected int goldOutput = 0;
    protected int influenceOutput = 0;
    protected int policyOutput = 0;
    protected int manpowerOutput = 0;
    protected int cultureOutput = 0;

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
    public int getHappinessOutput() {
        return happinessOutput;
    }
    public void setHappinessOutput(int happinessOutput) {
        this.happinessOutput = happinessOutput;
    }
    public int getFoodOutput() {
        return foodOutput;
    }
    public void setFoodOutput(int foodOutput) {
        this.foodOutput = foodOutput;
    }
    public int getResearchOutput() {
        return researchOutput;
    }
    public void setResearchOutput(int researchOutput) {
        this.researchOutput = researchOutput;
    }
    public int getGoldOutput() {
        return goldOutput;
    }
    public void setGoldOutput(int goldOutput) {
        this.goldOutput = goldOutput;
    }
    public int getInfluenceOutput() {
        return influenceOutput;
    }
    public void setInfluenceOutput(int influenceOutput) {
        this.influenceOutput = influenceOutput;
    }
    public int getPolicyOutput() {
        return policyOutput;
    }
    public void setPolicyOutput(int policyOutput) {
        this.policyOutput = policyOutput;
    }
    public int getManpowerOutput() {
        return manpowerOutput;
    }
    public void setManpowerOutput(int manpowerOutput) {
        this.manpowerOutput = manpowerOutput;
    }
    public int getCultureOutput() {
        return cultureOutput;
    }
    public void setCultureOutput(int cultureOutput) {
        this.cultureOutput = cultureOutput;
    }

    

}
