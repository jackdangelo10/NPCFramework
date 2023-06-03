package economies;

public class EconomyPrinter 
{
    public void printEconomy(Economy e)
    {
        System.out.println("HappinessOutput: " + e.happinessOutput);
        System.out.println("FoodOutput : " + e.foodOutput);
        System.out.println("ResearchOutput: " + e.researchOutput);
        System.out.println("GoldOutput: " + e.goldOutput);
        System.out.println("InfluenceOutput: " + e.influenceOutput);
        System.out.println("PolicyOutput: " + e.policyOutput);
        System.out.println("ManpowerOutput: " + e.manpowerOutput);
        System.out.println("CultureOutput: " + e.cultureOutput);
    }
}
