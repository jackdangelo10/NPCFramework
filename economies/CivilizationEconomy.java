package economies;

import java.util.ArrayList;
import java.util.List;

import civilizations.Civilization;

public class CivilizationEconomy extends Economy
{
    private List<SettlementEconomy> settlementEconomies = new ArrayList<SettlementEconomy>();
    private Civilization civ = null;

    public void updateOutputs()
    {
        super.happinessOutput = 0;
        super.foodOutput = 0;
        super.researchOutput = 0;
        super.goldOutput = 0;
        super.influenceOutput = 0;
        super.policyOutput = 0;
        super.manpowerOutput = 0;
        super.cultureOutput = 0;
        for(SettlementEconomy s : settlementEconomies)
        {
            super.happinessOutput += s.happinessOutput;
            super.foodOutput += s.foodOutput;
            super.researchOutput += s.researchOutput;
            super.goldOutput += s.goldOutput;
            super.influenceOutput += s.influenceOutput;
            super.policyOutput += s.policyOutput;
            super.manpowerOutput += s.manpowerOutput;
            super.cultureOutput += s.cultureOutput;
        }
    }

    public void addSettlementEconomy(SettlementEconomy setlEcon)
    {
        settlementEconomies.add(setlEcon);
    }

    public List<SettlementEconomy> getSettlementEconomies() {
        return settlementEconomies;
    }
    public void setSettlementEconomies(List<SettlementEconomy> settlementEconomies) {
        this.settlementEconomies = settlementEconomies;
    }
    public Civilization getCiv() {
        return civ;
    }
    public void setCiv(Civilization civ) {
        this.civ = civ;
    }

    
}
