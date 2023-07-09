package characters;

import java.util.ArrayList;
import java.util.List;

import characters.CharacterAttributes.Sex;


//class designed to search for the characters which fulfill the conditions of
//being a certain relationship to the given character
public class FamilySearch 
{
    private List<Character> relationships = null;

    public FamilySearch() {relationships = new ArrayList<Character>();}

    /**
     * @param c - given character 
     * @param relationship - string representing the relationship to search for
     * @return - a list of characters that fulfill this relationship
     * ex. search(Jack, "Wife") returns null
     * switch case to call function specific to relationship
     * 
     * NOTES
     * consider that you currently cannot have children out of wedlock as eventually planned
     * this means that "step" relationships are not implemented
     * 
     * as of now, the primary use of this function is to test for characters related by blood
     * ex. your father's brother's wife will not be considered your aunt
     * the same goes for all other non-blood relationships for the most part (in the process
     * of implementing)
     * 
     */
    public List<Character> search(Character c, String relationship)
    {
        relationships.clear();
        switch(relationship)
        {
            case "Wife":
                wifeSearch(c);
                break;
            case "Husband":
                husbandSearch(c);
                break;
            case "Sister":
                sisterSearch(c);
                break;
            case "Brother":
                brotherSearch(c);
                break;
            case "Grandfather":
                grandfatherSearch(c);
                break;
            case "Grandmother":
                grandmotherSearch(c);
                break;
            case "Uncle":
                uncleSearch(c);
                break;
            case "Aunt":
                auntSearch(c);
                break;
            case "Cousin":
                cousinSearch(c);
                break;
            case "Son":
                sonSearch(c);
                break;
            case "Daughter":
                daughterSearch(c);
                break;
            case "Grandson":
                grandsonSearch(c);
                break;
            case "Granddaughter":
                granddaughterSearch(c);
                break;
            case "Nephew":
                nephewSearch(c);
                break;
            case "Niece":
                nieceSearch(c);
                break;
            case "Boyfriend":
                boyfriendSearch(c);
                break;
            case "Girlfriend":
                girlfriendSearch(c);
                break;
            case "Father":
                relationships.add(c.getFather());
                break;
            case "Mother":
                relationships.add(c.getMother());
                break;
            case "Sibling":
                siblingSearch(c);
                break;
            default:
                System.out.println("Relationship not recognized");     
        }
        if(relationship.isEmpty())
        {
            return null;
        }
        return relationships;
    }

    /**
     * checks if has a wife (female spouse)
     * @param c - input character
     */
    private void wifeSearch(Character c)
    {
        if(c.getSpouse() == null) {return;}
        if(c.getSpouse().getSex() == CharacterAttributes.Sex.FEMALE)
        {
            relationships.add(c.getSpouse());
        }
    }

    /**
     * checks if has a husband (male spouse)
     * @param c - input character
     */
    private void husbandSearch(Character c)
    {
        if(c.getSpouse() == null) {return;}
        if(c.getSpouse().getSex() == CharacterAttributes.Sex.MALE)
        {
            relationships.add(c.getSpouse());
        }
    }

    /**
     * checks if has a sister (female child of father)
     * @param c
     */
    private void sisterSearch(Character c)
    {
        if(c.getFather() != Adam.getInstance())
        {
            for(Character i : c.getFather().getChildren())
            {
                if(i.getSex() == Sex.FEMALE && i != c)
                {
                    relationships.add(i);
                }
            }
        }
    }

    /**
     * checks if has a brother (male child of father)
     * @param c
     */
    private void brotherSearch(Character c)
    {
        if(c.getFather() != Adam.getInstance())
        {
            for(Character i : c.getFather().getChildren())
            {
                if(i.getSex() == Sex.MALE && i != c)
                {
                    relationships.add(i);
                }
            }
        }
    }

    /**
     * checks for grandfathers (fathers of mother and father)
     * @param c
     */
    private void grandfatherSearch(Character c)
    {
        if(c.getFather() != Adam.getInstance())
        {
            if(c.getFather().getFather() != Adam.getInstance())
            {
                relationships.add(c.getFather().getFather());
            }
        }
        if(c.getMother() != Eve.getInstance())
        {
            if(c.getMother().getFather() != Adam.getInstance())
            {
                relationships.add(c.getMother().getFather());
            }
        }
    }

    /**
     * checks for grandmothers (mothers of mother and father)
     * @param c
     */
    private void grandmotherSearch(Character c)
    {
        if(c.getFather() != Adam.getInstance())
        {
            if(c.getFather().getMother() != Eve.getInstance())
            {
                relationships.add(c.getFather().getMother());
            }
        }
        if(c.getMother() != Adam.getInstance())
        {
            if(c.getMother().getMother() != Eve.getInstance())
            {
                relationships.add(c.getMother().getMother());
            }
        }
    }

    /**
     * checks for uncles (brothers of father and mother)
     * @param c
     */
    private void uncleSearch(Character c)
    {
        brotherSearch(c.getFather());
        brotherSearch(c.getMother());
    }

    /**
     * checks for aunts (sisters of mother and father)
     * @param c
     */
    private void auntSearch(Character c)
    {
        sisterSearch(c.getFather());
        sisterSearch(c.getMother());
    }

    /**
     * checks for sons (male child)
     * @param c
     */
    private void sonSearch(Character c)
    {
        for(Character i : c.getChildren())
        {
            if(i.getSex() == Sex.MALE)
            {
                relationships.add(i);
            }
        }
    }

    /**
     * checks for daughters (female child)
     * @param c
     */
    private void daughterSearch(Character c)
    {
        for(Character i : c.getChildren())
        {
            if(i.getSex() == Sex.FEMALE)
            {
                relationships.add(i);
            }
        }
    }

    /**
     * checks for grandsons (sons of children)
     * @param c
     */
    private void grandsonSearch(Character c)
    {
        if(!c.getChildren().isEmpty())
        {
            for(Character i : c.getChildren())
            {
                sonSearch(i);
            }
        }
    }

    /**
     * checks for granddaughters (daughters of children)
     * @param c
     */
    private void granddaughterSearch(Character c)
    {
        if(!c.getChildren().isEmpty())
        {
            for(Character i : c.getChildren())
            {
                daughterSearch(i);
            }
        }
    }

    /**
     * checks for siblings (children of father besides this character)
     * @param c
     */
    private void siblingSearch(Character c)
    {
        if(c.getFather() != Adam.getInstance())
        {
            relationships.addAll(c.getFather().getChildren());
            relationships.remove(c);
        }
    }

    /**
     * checks for nephews (sons of siblings and spouse's siblings)
     * @param c
     */
    private void nephewSearch(Character c)
    {
        siblingSearch(c);
        List<Character> yourSiblings = new ArrayList<Character>(relationships);
        relationships.clear();

        List<Character> spouseSiblings = new ArrayList<>();
        if(c.getSpouse() != null)
        {
            siblingSearch(c.getSpouse());
            spouseSiblings = new ArrayList<>(relationships);
            relationships.clear();
        }

        for(Character i : yourSiblings)
        {
            for(Character j : i.getChildren())
            {
                if(j.getSex() == Sex.MALE && i != c)
                {
                    relationships.add(j);
                }
            }
        }

        for(Character i : spouseSiblings)
        {
            for(Character j : i.getChildren())
            {
                if(j.getSex() == Sex.MALE)
                {
                    relationships.add(j);
                }
            }
        }
    }

    /**
     * checks for nieces (daughters of siblings and spouse's siblings)
     * @param c
     */
    private void nieceSearch(Character c)
    {
        siblingSearch(c);
        List<Character> yourSiblings = new ArrayList<>(relationships);
        relationships.clear();

        List<Character> spouseSiblings = new ArrayList<>();
        if(c.getSpouse() != null)
        {
            siblingSearch(c.getSpouse());
            spouseSiblings = new ArrayList<>(relationships);
            relationships.clear();
        }

        for(Character i : yourSiblings)
        {
            for(Character j : i.getChildren())
            {
                if(j.getSex() == Sex.FEMALE)
                {
                    relationships.add(j);
                }
            }
        }

        for(Character i : spouseSiblings)
        {
            for(Character j : i.getChildren())
            {
                if(j.getSex() == Sex.FEMALE)
                {
                    relationships.add(j);
                }
            }
        }
    }

    /**
     * ONLY INCLUDES FIRST COUSINS
     * checks for cousins (children of aunts and uncles)
     * @param c
     */
    private void cousinSearch(Character c)
    {
        uncleSearch(c);
        auntSearch(c);
        List<Character> parentSiblings = new ArrayList<>(relationships);
        relationships.clear();
        for(Character i : parentSiblings)
        {
            relationships.addAll(i.getChildren());
        }
    }

    /**
     * checks for boyfriend (male partner)
     * @param c
     */
    private void boyfriendSearch(Character c)
    {
        if(c.getPartner() != null)
        {
            if(c.getPartner().getSex() == Sex.MALE)
            {
                relationships.add(c.getPartner());
            }
        }
    }

    /**
     * checks for girlfriend (female partner)
     * @param c
     */
    private void girlfriendSearch(Character c)
    {
        if(c.getPartner() != null)
        {
            if(c.getPartner().getSex() == Sex.FEMALE)
            {
                relationships.add(c.getPartner());
            }
        }
    }
    
}
