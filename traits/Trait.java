package traits;

import java.util.List;

abstract public class Trait 
{
    protected double chance;
    protected String traitName;
    protected boolean inheritable = true;
    protected List<String> opposites;

    abstract public void apply(characters.Character c);
    abstract public void unapply(characters.Character c);
    abstract public boolean meetsRequirements(characters.Character c);
    
    
    public double getChance() {
        return chance;
    }
    public void setChance(double chance) {
        this.chance = chance;
    }
    public String getTraitName() {
        return traitName;
    }
    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }
    public boolean isInheritable() {
        return inheritable;
    }
    public void setInheritable(boolean inheritable) {
        this.inheritable = inheritable;
    }
    public List<String> getOpposites() {
        return opposites;
    }
    public void setOpposites(List<String> opposites) {
        this.opposites = opposites;
    }
}
