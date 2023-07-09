package characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import civilizations.Civilization;
import professions.Profession;
import settlements.Settlement;
import structures.Structure;
import traits.Trait;

/**
 * class meant to represent a human being in an RPG style
 */
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
    //profession skills will be used as percent checks as well as influence the market (ex. how much money the business makes)
    protected int profession1Skill = 0;
    protected int profession2Skill = 0;

    protected Civilization civ = null;
    protected Settlement settlement = null;

    //general housing reservoir or workplace
    protected Structure assignedStructure = null;

    //base stats
    protected int fertility = 50;
    protected int baseReputation = 50;
    protected int baseSway = 50;
    protected int health = 100;
    protected boolean incapable = false;
    protected boolean isAlive = true;
    
    //demographics
    protected CharacterAttributes.Sex sex = null;
    protected CharacterAttributes.Age age = null;
    protected governments.GovernmentAttributes.CitizenshipLevel citizenshipLevel = null;
    protected String firstName = "";
    protected String lastName = "";
    protected String name = firstName + " " + lastName;

    //family and friends
    protected Family family = null;
    protected Character father = null;
    protected Character mother = null;
    protected Character spouse = null;
    protected Character partner = null;
    protected List<Character> friends = null;
    protected List<Character> children = null;
    
    //update
    protected int turnAge = 0;

    //personality
    protected Map<String, Trait> traits;

//* END OF VARIABLES ************************************************************************** */

    public Character()
    {
        //initalization
        traits = new HashMap<>();
        friends = new ArrayList<>();
        children = new ArrayList<>();
        family = new Family();
        family.addMember(this);
    }

//**RELATIONSHIP LOGIC ******************************************************************************** */

    public void addFriend(Character c)
    {
        friends.add(c);
    }

    public void addChild(Character c)
    {
        children.add(c);
    }

//* STAT LOGIC *************************************************************************************/

    /**
     * checks if stats are within valid range (ex. 1-20 for base attributes such as strength)
     * @param stat 
     * @param min
     * @param max
     * @return adjusted stat if out of range, otherwise same number
     */
    public int statRangeCheck(int stat, final int min, final int max)
    {
        if(stat > max)
        {
            stat = max;
        }
        else if(stat < min)
        {
            stat = min;
        }
        return stat;
    }


//* TRAIT LOGIC */ **********************************************************************************
    
    /**
     * assigns traits to characters and performs necessary checks to see if the character
     * is eligible for that trait
     * @param t the trait to be added to the character
     */
    public void addTrait(Trait t)
    {
        boolean flag = true;

        //checks if character already has trait
        if(traits.containsKey(t.getTraitName()))
        {
            flag = false;
        }

        //checks if character has mutually exclusive opposite traits
        //ex. Strong and Weak
        for(String i : t.getOpposites())
        {
            if(traits.containsKey(i))
            {
                flag = false;
            }
        }

        //checks to see if the character meets the traits requirements
        //ex. trait Pregnant requires character to be FEMALE
        if(t.meetsRequirements(this) && flag)
        {
            traits.put(t.getTraitName(), t);
            t.apply(this);
        }
        else
        {
            //testing line
            //System.out.println("Trait " + t.getTraitName() + " could not be applied");
        }
    }

    /**
     * function overload of below
     * @param t trait to be removed
     */
    public void removeTrait(Trait t)
    {
        removeTrait(t.getTraitName());
    }

    /**
     * removes trait from list of traits and unapplies effects
     * @param traitName - name of trait to be removed
     */
    public void removeTrait(String traitName)
    {
        Trait removedTrait = traits.remove(traitName);
        if (removedTrait != null) 
        {
            removedTrait.unapply(this);
        }
    }

/**GETTERS AND SETTERS *********************************************************** */
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
        this.name = firstName + " " + lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        String parts[] = name.split(" ", 2);
        if(parts.length == 2)
        {
            this.firstName = parts[0];
            this.lastName = parts[1];
        }
        else
        {
            firstName = parts[0];
            lastName = "";
        }
        
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

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public governments.GovernmentAttributes.CitizenshipLevel getCitizenshipLevel() {
        return citizenshipLevel;
    }

    public void setCitizenshipLevel(governments.GovernmentAttributes.CitizenshipLevel citizenshipLevel) {
        this.citizenshipLevel = citizenshipLevel;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public int getProfession1Skill() {
        return profession1Skill;
    }

    public void setProfession1Skill(int profession1Skill) {
        this.profession1Skill = profession1Skill;
    }

    public int getProfession2Skill() {
        return profession2Skill;
    }

    public void setProfession2Skill(int profession2Skill) {
        this.profession2Skill = profession2Skill;
    }

    public Character getFather() {
        return father;
    }

    public void setFather(Character father) {
        this.father = father;
    }

    public Character getMother() {
        return mother;
    }

    public void setMother(Character mother) {
        this.mother = mother;
    }

    public List<Character> getFriends() {
        return friends;
    }

    public void setFriends(List<Character> friends) {
        this.friends = friends;
    }

    public Character getSpouse() {
        return spouse;
    }

    public void setSpouse(Character spouse) {
        this.spouse = spouse;
    }

    public Character getPartner() {
        return partner;
    }

    public void setPartner(Character partner) {
        this.partner = partner;
    }

    public List<Character> getChildren() {
        return children;
    }

    public void setChildren(List<Character> children) {
        this.children = children;
    }

    public Structure getAssignedStructure() {
        return assignedStructure;
    }

    public void setAssignedStructure(Structure assignedStructure) {
        this.assignedStructure = assignedStructure;
    }

    
    
}
