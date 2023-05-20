package settlements;
import civilizations.Civilization;

public class Village extends Settlement
{
    public Village(Civilization c)
    {
        super.civilization = c;
        super.settlementSizeName = "Village";
        System.out.println("Initializing village...");
        super.MAX_STRUCTURES = 13;
        super.MIN_STRUCTURES = 8;
    }
}
