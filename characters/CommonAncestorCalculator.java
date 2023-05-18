package characters;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CommonAncestorCalculator 
{
    private int count = 0;

    public boolean areCloselyRelated(Character thisOne, Character other) 
    {
        count = 0;
        return areCloselyRelated(thisOne, other, new HashSet<>());
    }

    private boolean areCloselyRelated(Character npc1, Character npc2, Set<Character> visited) 
    {
        count++;
        if(count > 5)
        {
            return false;
        }
        
        if (npc1 == npc2) 
        {
            System.out.println("They are the same character");
            return true;  // They are the same Character
        }
        
        // Check if npc1 and npc2 have common parents
        Set<Character> npc1Parents = new HashSet<>();

        if(npc1.getFather() == Adam.getInstance() && npc1.getMother() == Eve.getInstance())
        {
            System.out.println("False because doesn't have listed parents " + npc1.getName() + " " + npc2.getName());
            return false;
        }
        if(npc1.getMother() != null)
        {
            npc1Parents.add(npc1.getMother());
        }
        if(npc1.getFather() != null)
        {
            npc1Parents.add(npc1.getFather());
        }
        

        Set<Character> npc2Parents = new HashSet<>();


        if(npc2.getFather() == Adam.getInstance() && npc2.getMother() == Eve.getInstance())
        {
            System.out.println("False because doesn't have listed parents " + npc2.getName() + " " + npc2.getName());
            return false;
        }
        if(npc2.getMother() != null)
        {
            npc2Parents.add(npc2.getMother());
        }
        if(npc2.getFather() != null)
        {
            npc2Parents.add(npc2.getFather());
        }

        
        if (!Collections.disjoint(npc1Parents, npc2Parents)) {
            System.out.println("They have at least one common parent");
            return true;  // They have at least one common parent
        }
        
        // Recursively check if npc1 and npc2 have common ancestors
        visited.add(npc1);
        visited.add(npc2);
        
        for (Character parent : npc1Parents) {
            if (!visited.contains(parent) && areCloselyRelated(parent, npc2, visited)) 
            {
                System.out.println("They have a common ancestor");
                return true;  // They have a common ancestor
            }
        }
        
        for (Character parent : npc2Parents) {
            if (!visited.contains(parent) && areCloselyRelated(npc1, parent, visited)) 
            {
                System.out.println("They have a common ancestor2");
                return true;  // They have a common ancestor
            }
        }
        
        System.out.println("False because not closely related?");
        return false;  // They are not closely related
    }
}
