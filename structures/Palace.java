package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Palace extends Structure 
{
    public Palace(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Palace";
        super.incomeFood = -1;
        super.incomeGold = -1;
        super.incomeManpower = -1;
        super.incomeInfluence = 10;
    }
}
