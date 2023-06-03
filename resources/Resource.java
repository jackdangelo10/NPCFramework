package resources;

public abstract class Resource implements Cloneable
{
    protected String resourceName;
    protected int quantity = 0;
    protected String associatedStructure = null;

    protected int happinessOutput = 0;
    protected int foodOutput = 0;
    protected int researchOutput = 0;
    protected int goldOutput = 0;
    protected int influenceOutput = 0;
    protected int policyOutput = 0;
    protected int manpowerOutput = 0;
    protected int cultureOutput = 0;

    @Override
    public Resource clone() 
    {
        try 
        {
            return (Resource) super.clone();
        } catch (CloneNotSupportedException e) 
        {
            // Handle the exception if necessary
            return null;
        }
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAssociatedStructure() {
        return associatedStructure;
    }

    public void setAssociatedStructure(String associatedStructure) {
        this.associatedStructure = associatedStructure;
    }

    public int getHappinessOutput() {
        return happinessOutput;
    }

    public void setHappinessOutput(int happinessOutput) {
        this.happinessOutput = happinessOutput;
    }

    public int getFoodOutput() {
        return foodOutput;
    }

    public void setFoodOutput(int foodOutput) {
        this.foodOutput = foodOutput;
    }

    public int getResearchOutput() {
        return researchOutput;
    }

    public void setResearchOutput(int researchOutput) {
        this.researchOutput = researchOutput;
    }

    public int getGoldOutput() {
        return goldOutput;
    }

    public void setGoldOutput(int goldOutput) {
        this.goldOutput = goldOutput;
    }

    public int getInfluenceOutput() {
        return influenceOutput;
    }

    public void setInfluenceOutput(int influenceOutput) {
        this.influenceOutput = influenceOutput;
    }

    public int getPolicyOutput() {
        return policyOutput;
    }

    public void setPolicyOutput(int policyOutput) {
        this.policyOutput = policyOutput;
    }

    public int getManpowerOutput() {
        return manpowerOutput;
    }

    public void setManpowerOutput(int manpowerOutput) {
        this.manpowerOutput = manpowerOutput;
    }

    public int getCultureOutput() {
        return cultureOutput;
    }

    public void setCultureOutput(int cultureOutput) {
        this.cultureOutput = cultureOutput;
    }

    

    
}
