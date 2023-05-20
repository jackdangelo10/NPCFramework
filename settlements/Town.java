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
        super.MAX_STRUCTURES = 20;
        super.MIN_STRUCTURES = 13;
    }
}
