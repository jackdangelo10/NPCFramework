package animals;

import civilizations.Civilization;
import settlements.Settlement;
import structures.Structure;

/**
 * Intended to represent Animal entities of any type 
 * Can be owned by a character or left null
 * Can be assigned to a structure such as "Pasture"
 */
public abstract class Animal 
{
    protected String animalName;
    protected boolean isAlive = true;

    //intended to be either CHILD or ADULT
    protected AnimalAttributes.Age age = null;
    protected int STR = 0;
    protected int CON = 0;
    protected int DEX = 0;
    protected int INT = 0;
    protected int PER = 0;
    protected int CHR = 0;
    protected int LCK = 0;
    protected int GFT = 0;

    protected Civilization civ = null;
    protected Settlement settlement = null;
    protected Structure assignedStructure = null;

    protected Character owner = null;

// GETTERS AND SETTERS ****************************************************/

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public AnimalAttributes.Age getAge() {
        return age;
    }

    public void setAge(AnimalAttributes.Age age) {
        this.age = age;
    }

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

    public Structure getAssignedStructure() {
        return assignedStructure;
    }

    public void setAssignedStructure(Structure assignedStructure) {
        this.assignedStructure = assignedStructure;
    }

    public Character getOwner() {
        return owner;
    }

    public void setOwner(Character owner) {
        this.owner = owner;
    }

    
}
