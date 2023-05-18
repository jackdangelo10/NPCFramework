package structures;
import civilizations.Civilization;
import resources.Resource;
import settlements.Settlement;

public class Pasture extends Structure
{
    private Resource animal = null;

    public Pasture(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Pasture";
        super.incomeFood = 3;
        super.incomeGold = -1;
    }
}
