package structures;
import civilizations.Civilization;
import settlements.Settlement;

public class Shrine extends Structure
{
    public Shrine(Civilization c, Settlement s)
    {
        super.civ = c;
        super.settlement = s;
        super.structureName = "Farmstead";
        super.incomeInfluence = 3;
    }
}
