package characters;

//prints all relevant details about a character
public class CharacterPrinter 
{
    public void printCharacter(Character c)
    {
        if(!c.isAlive())
        {
            System.out.println(c.getName() + " has died");
            return;
        }
        System.out.println(c.getName() + ": " + c.getSex() + " " + c.getAge());
        System.out.println("Health: " + c.getHealth());
        System.out.println("TurnAge: " + c.getTurnAge());

        System.out.println("STR: " + c.getSTR());
        System.out.println("CON: " + c.getCON());
        System.out.println("DEX: " + c.getDEX());
        System.out.println("INT: " + c.getINT());
        System.out.println("PER: " + c.getPER());
        System.out.println("CHR: " + c.getCHR());
        System.out.println("LCK: " + c.getLCK());
        System.out.println("GFT: " + c.getGFT());
        System.out.println("Fertility: "  + c.getFertility());
        System.out.println("Reputation: " + c.getBaseReputation());
        System.out.println("Sway: " + c.getBaseSway());
        if(c.getProfession1() != null)
        {
            System.out.println(c.getProfession1().getProfName());
        }
        System.out.println(c.getTraits().keySet());
    }
}
