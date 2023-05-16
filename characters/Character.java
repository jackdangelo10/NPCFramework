package characters;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import traits.Trait;

abstract public class Character 
{
    //base attributes
    protected int STR = 0;
    protected int CON = 0;
    protected int DEX = 0;
    protected int INT = 0;
    protected int PER = 0;
    protected int CHR = 0;
    protected int LCK = 0;
    protected int GFT = 0;

    protected Profession profession1 = null;
    protected Profession profession2 = null;

    protected Civilization civ = null;
    protected Settlement settlement = null;

    protected Structure workplace = null;
    protected Structure home = null;

    //base stats
    protected int fertility = 50;
    protected int baseReputation = 50;
    protected int baseSway = 50;
    protected int health = 100;
    protected boolean incapable = false;
    
    //demographics
    protected CharacterAttributes.Sex sex = null;
    protected CharacterAttributes.Age age = null;
    protected String firstName = "";
    protected String lastName = "";
    protected String name = firstName + " " + lastName;
    
    //update
    protected int turnAge = 0;

    //personality
    protected Map<String, Trait> traits;

//* END OF VARIABLES ************************************************************************** */

    public Character()
    {
        traits = new HashMap<>();
    }


//* TRAIT LOGIC */ **********************************************************************************
    public void addTrait(Trait t)
    {
        boolean flag = true;

        if(traits.containsKey(t.getTraitName()))
        {
            flag = false;
        }

        for(String i : t.getOpposites())
        {
            if(traits.containsKey(i))
            {
                flag = false;
            }
        }

        if(t.meetsRequirements(this) && flag)
        {
            traits.put(t.getTraitName(), t);
            t.apply(this);
        }
    }

    public void removeTrait(Trait t)
    {
        removeTrait(t.getTraitName());
    }

    public void removeTrait(String traitName)
    {
        Trait removedTrait = traits.remove(traitName);
        if (removedTrait != null) 
        {
            removedTrait.unapply(this);
        }
    }
    
    

    
    //Getter and Setter land
    public int getSTR() {
        return STR;
    }
    public void setSTR(int sTR) {
        STR = sTR;
    }
    public int getCON() {
        return CON;
    }
    public void setCON(int cON) {
        CON = cON;
    }
    public int getDEX() {
        return DEX;
    }
    public void setDEX(int dEX) {
        DEX = dEX;
    }
    public int getINT() {
        return INT;
    }
    public void setINT(int iNT) {
        INT = iNT;
    }
    public int getPER() {
        return PER;
    }
    public void setPER(int pER) {
        PER = pER;
    }
    public int getCHR() {
        return CHR;
    }
    public void setCHR(int cHR) {
        CHR = cHR;
    }
    public int getLCK() {
        return LCK;
    }
    public void setLCK(int lCK) {
        LCK = lCK;
    }
    public int getGFT() {
        return GFT;
    }
    public void setGFT(int gFT) {
        GFT = gFT;
    }
    public Profession getProfession1() {
        return profession1;
    }
    public void setProfession1(Profession profession1) {
        this.profession1 = profession1;
    }
    public Profession getProfession2() {
        return profession2;
    }
    public void setProfession2(Profession profession2) {
        this.profession2 = profession2;
    }
    public Civilization getCiv() {
        return civ;
    }
    public void setCiv(Civilization civ) {
        this.civ = civ;
    }
    public Settlement getSettlement() {
        return settlement;
    }
    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }
    public Structure getWorkplace() {
        return workplace;
    }
    public void setWorkplace(Structure workplace) {
        this.workplace = workplace;
    }
    public Structure getHome() {
        return home;
    }
    public void setHome(Structure home) {
        this.home = home;
    }
    public int getFertility() {
        return fertility;
    }
    public void setFertility(int fertility) {
        this.fertility = fertility;
    }
    public int getBaseReputation() {
        return baseReputation;
    }
    public void setBaseReputation(int baseReputation) {
        this.baseReputation = baseReputation;
    }
    public int getBaseSway() {
        return baseSway;
    }
    public void setBaseSway(int baseSway) {
        this.baseSway = baseSway;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public boolean isIncapable() {
        return incapable;
    }
    public void setIncapable(boolean incapable) {
        this.incapable = incapable;
    }
    public CharacterAttributes.Sex getSex() {
        return sex;
    }
    public void setSex(CharacterAttributes.Sex sex) {
        this.sex = sex;
    }
    public CharacterAttributes.Age getAge() {
        return age;
    }
    public void setAge(CharacterAttributes.Age age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTurnAge() {
        return turnAge;
    }
    public void setTurnAge(int turnAge) {
        this.turnAge = turnAge;
    }
    public Map<String, Trait> getTraits() {
        return traits;
    }
    public void setTraits(Map<String, Trait> traits) {
        this.traits = traits;
    }




    
}
