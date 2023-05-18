package characters;

import java.util.ArrayList;
import java.util.List;

import characters.CharacterAttributes.Sex;

public class FamilySearch 
{
    private List<Character> relationships = null;

    public FamilySearch() {relationships = new ArrayList<Character>();}

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
            default:
                System.out.println("Relationship not recognized");     
        }
        if(relationship.isEmpty())
        {
            return null;
        }
        return relationships;
    }

    private void wifeSearch(Character c)
    {
        if(c.getSpouse() == null) {return;}
        if(c.getSpouse().getSex() == CharacterAttributes.Sex.FEMALE)
        {
            relationships.add(c.getSpouse());
        }
    }

    private void husbandSearch(Character c)
    {
        if(c.getSpouse() == null) {return;}
        if(c.getSpouse().getSex() == CharacterAttributes.Sex.MALE)
        {
            relationships.add(c.getSpouse());
        }
    }

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

    private void uncleSearch(Character c)
    {
        brotherSearch(c.getFather());
        brotherSearch(c.getMother());
    }

    private void auntSearch(Character c)
    {
        sisterSearch(c.getFather());
        sisterSearch(c.getMother());
    }

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

    private void siblingSearch(Character c)
    {
        if(c.getFather() != Adam.getInstance())
        {
            relationships.addAll(c.getFather().getChildren());
            relationships.remove(c);
        }
    }

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
                if(j.getSex() == Sex.MALE)
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
