package settlements;
import civilizations.Civilization;

public class Village extends Settlement
{
    public Village(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "Village";
        System.out.println("Initializing village...");
        super.MAX_POP = 39;
        super.MIN_POP = 16;
    }
}
