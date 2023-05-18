package settlements;
import civilizations.Civilization;

public class Town extends Settlement
{
    //population is 40 - 64
    public Town(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "Town";
        System.out.println("Initializing town...");
        super.MAX_POP = 64;
        super.MIN_POP = 40;
    }
}
