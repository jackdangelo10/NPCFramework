package settlements;
import civilizations.Civilization;

//class of settlement with 8-13 structures
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
