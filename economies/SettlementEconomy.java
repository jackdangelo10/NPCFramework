package economies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import resources.Resource;
import settlements.Settlement;
import structures.Structure;

//refers to the economy of a specific settlement
//keeps track of the resources it has and if those resources are being worked by a structure
public class SettlementEconomy extends Economy
{
    private List<Resource> resources = new ArrayList<Resource>();
    private Map<Resource, Structure> resourceStructures = new HashMap<Resource, Structure>();
    private Settlement settlement = null;
    
    /**
     * @param r resource to be added to list of settlement resources
     */
    public void addResource(Resource r)
    {
        resources.add(r);
    }
    
    /**
     * pairs a resource and structure that works it
     * @param r - resource
     * @param str - structure
     */
    public void addResourceStructurePairing(Resource r, Structure str)
    {
        resourceStructures.put(r, str);
    }

    /**
     * @param r - resource
     * @return true or false if the resource has an assigned structure
     */
    public boolean isResourceWorked(Resource r)
    {
        if(resourceStructures.get(r) == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * calculates the outputs of the settlement economy based on the resources being worked
     * as well as the jobs being worked
     */
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

        for(Resource r : resources)
        {
            if(resourceStructures.get(r) != null)
            {
                super.happinessOutput += r.getHappinessOutput() * r.getQuantity();
                super.foodOutput += r.getFoodOutput() * r.getQuantity();
                super.researchOutput += r.getResearchOutput() * r.getQuantity();
                super.goldOutput += r.getGoldOutput() * r.getQuantity();
                super.influenceOutput += r.getInfluenceOutput() * r.getQuantity();
                super.policyOutput += r.getPolicyOutput() * r.getQuantity();
                super.manpowerOutput += r.getManpowerOutput() * r.getQuantity();
                super.cultureOutput += r.getCultureOutput() * r.getQuantity();
            }
        }

        for(Structure str : settlement.getStructures())
        {
            if(str.getAssignedNPCs() != null)
            {
                for(characters.Character c : str.getAssignedNPCs())
                {
                    super.happinessOutput += c.getProfession1().getHappinessOutput();
                    super.foodOutput += c.getProfession1().getHappinessOutput();
                    super.researchOutput += c.getProfession1().getResearchOutput();
                    super.goldOutput += c.getProfession1().getGoldOutput();
                    super.influenceOutput += c.getProfession1().getInfluenceOutput();
                    super.policyOutput += c.getProfession1().getPolicyOutput();
                    super.manpowerOutput += c.getProfession1().getManpowerOutput();
                    super.cultureOutput += c.getProfession1().getCultureOutput();

                    if(c.getProfession2() != null)
                    {
                        super.happinessOutput += c.getProfession2().getHappinessOutput();
                        super.foodOutput += c.getProfession2().getHappinessOutput();
                        super.researchOutput += c.getProfession2().getResearchOutput();
                        super.goldOutput += c.getProfession2().getGoldOutput();
                        super.influenceOutput += c.getProfession2().getInfluenceOutput();
                        super.policyOutput += c.getProfession2().getPolicyOutput();
                        super.manpowerOutput += c.getProfession2().getManpowerOutput();
                        super.cultureOutput += c.getProfession2().getCultureOutput();
                    }
                }
            }
        }
    }



    /**GETTERS AND SETTERS ************************************************************************************ */
    
    public List<Resource> getResources() {
        return resources;
    }
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
    public Map<Resource, Structure> getResourceStructures() {
        return resourceStructures;
    }
    public void setResourceStructures(Map<Resource, Structure> resourceStructures) {
        this.resourceStructures = resourceStructures;
    }
    public Settlement getSettlement() {
        return settlement;
    }
    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
    
}
