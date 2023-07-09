package economies;

//represents count of abstract resources and how many are earned per turn
//the game will be in real time so this will be every in game day
public abstract class Economy 
{
    protected int happinessOutput = 0;
    protected int foodOutput = 0;
    protected int researchOutput = 0;
    protected int goldOutput = 0;
    protected int influenceOutput = 0;
    protected int policyOutput = 0;
    protected int manpowerOutput = 0;
    protected int cultureOutput = 0;

    protected int happinessCount = 0;
    protected int foodCount = 0;
    protected int researchCount = 0;
    protected int goldCount = 0;
    protected int influenceCount = 0;
    protected int policyCount = 0;
    protected int manpowerCount = 0;
    protected int cultureCount = 0;

    abstract void updateOutputs();
}
