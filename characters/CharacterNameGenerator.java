package characters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//this class is a placeholder for name generation to distinguish characters
// ...sometimes produces okayish sounding names
public class CharacterNameGenerator 
{
    private static final String consonants = "bcdfghjklmnpqrstvwxy";
    //21 consonants
    private static final Random rand = new Random();
    private static final ArrayList<java.lang.Character> vowels = new ArrayList
        <java.lang.Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    private static ArrayList<String> suffixesC = new ArrayList<String>();
    private static ArrayList<String> suffixesV = new ArrayList<String>();
    private static int SUFFIXESC_SIZE = 0;
    private static int SUFFIXESV_SIZE = 0;
    //5 vowels

    /**
     * constructor assigns preset suffixes
     */
    public CharacterNameGenerator()
    {
        suffixesC.add("man");       
        suffixesC.add("check");
        suffixesC.add("gil");
        suffixesC.add("son");
        suffixesC.add("kan");
        suffixesC.add("lin");
        suffixesC.add("moor");
        suffixesC.add("more");
        suffixesC.add("quin");
        suffixesC.add("stad");
        suffixesC.add("tabar");
        suffixesC.add("wan");
        suffixesC.add("bourg");
        suffixesC.add("brun");
        suffixesC.add("dale");
        suffixesC.add("felt");
        suffixesC.add("gate");
        suffixesC.add("gren");
        suffixesC.add("han");
        suffixesC.add("kin");
        suffixesC.add("la");
        suffixesC.add("lay");
        suffixesC.add("lin");
        suffixesC.add("lund");
        suffixesC.add("wick");
        suffixesC.add("mont");
        suffixesC.add("ment");
        suffixesC.add("ridge");
        suffixesC.add("smith");
        SUFFIXESC_SIZE = suffixesC.size();

        suffixesV.add("off");
        suffixesV.add("onis");
        suffixesV.add("appa");
        suffixesV.add("and");
        suffixesV.add("onak");
        suffixesV.add("ian");
        suffixesV.add("eanu");
        suffixesV.add("emu");
        suffixesV.add("enya");
        SUFFIXESV_SIZE = suffixesV.size();

        

    }

    /**
     * @return the new name generated, combined string of first and last name
     */
    public String createName()
    {
        return createFirstName() + " " + createLastName();
    }

    /**
     * @return generated last name
     */
    public String createLastName()
    {
        String name = createFirstName();
        if(Math.random() > .5)
        {
            if(vowels.contains(name.charAt(name.length() - 1)))
            {
                name += suffixesC.get(rand.nextInt(SUFFIXESC_SIZE - 1));
            }
            else
            {
                name += suffixesV.get(rand.nextInt(SUFFIXESV_SIZE - 1));
            } 
        }   
        return name;  
    }

    /**
     * @return generated first name
     */
    public static String createFirstName()
    {
        int nameLength = rand.nextInt(5) + 3;
        boolean isVowel = false;
        if(Math.random() > .7)
        {
            isVowel = true;
        }
        int count = 0;
        String name = "";
        int subsequenceCounter = 0;
        while(count < nameLength)
        {
            if(isVowel)
            {
                name += vowels.get(rand.nextInt(4)); 
            }
            else
            {
                name += consonants.charAt(rand.nextInt(20));
            }
            if(Math.random() > .5 || subsequenceCounter >= 1)
            {
                isVowel = !isVowel;
                subsequenceCounter = 0;
            }
            subsequenceCounter++;
            count++;
        }
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
