package settlements;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SettlementNameGenerator 
{
    private static final String consonants = "bcdfghjklmnpqrstvwxy";
        //21 consonants
    private static final Random rand = new Random();
    private static final ArrayList<java.lang.Character> vowels = new ArrayList
        <java.lang.Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    private static ArrayList<String> suffixes = new ArrayList<String>();
    private static ArrayList<String> prefixes = new ArrayList<String>();

    public SettlementNameGenerator()
    {
        suffixes.add("town");
        suffixes.add("ton");
        suffixes.add("ville");
        suffixes.add("ford");
        suffixes.add("field");
        suffixes.add("vale");
        suffixes.add("wood");
        suffixes.add("ham");
        suffixes.add("wick");
        suffixes.add("stead");
        suffixes.add("dale");
        suffixes.add("bridge");
        suffixes.add("port");
        suffixes.add("view");
        suffixes.add("haven");
        suffixes.add("crest");
        suffixes.add("borough");
        suffixes.add("well");

        prefixes.add("Nova");
        prefixes.add("West");
        prefixes.add("North");
        prefixes.add("East");
        prefixes.add("South");
        prefixes.add("New ");
        prefixes.add("Old");
        prefixes.add("Upper ");
        prefixes.add("Lower ");
        prefixes.add("Golden");
        prefixes.add("Silver");
        prefixes.add("Black");
        prefixes.add("Red");
        prefixes.add("Fox");
        prefixes.add("High");
        prefixes.add("Grey");
    }

    public String generateSettlementName()
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

        if(Math.random() > .75)
        {
            name = prefixes.get(rand.nextInt(prefixes.size())) + name;
        }
        if(Math.random() > .75)
        {
            name += suffixes.get(rand.nextInt(suffixes.size()));
        }
        if(Math.random() > .75)
        {
            name = prefixes.get(rand.nextInt(prefixes.size())) 
                + suffixes.get(rand.nextInt(suffixes.size()));
        }
        return name;
    }
}
