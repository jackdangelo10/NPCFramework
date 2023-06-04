package civilizations;

import java.util.ArrayList;
import java.util.List;

import economies.CivilizationEconomy;
import governments.Government;
import settlements.Settlement;

public class Civilization 
{
    Government civilizationGovernment = null;
    Culture culture = null;
    Technology tech = null;
    CivilizationEconomy civilizationEconomy = new CivilizationEconomy();
    List<Settlement> settlements = new ArrayList<Settlement>();
}
