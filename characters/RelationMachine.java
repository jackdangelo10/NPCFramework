package characters;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RelationMachine 
{
    public boolean areCloselyRelated(Character thisOne, Character other) {
        return areCloselyRelated(thisOne, other, new HashSet<>());
    }

    private boolean areCloselyRelated(Character npc1, Character npc2, Set<Character> visited) 
    {
        if (npc1 == npc2) {
            return true;  // They are the same Character
        }
        
        // Check if npc1 and npc2 have common parents
        Set<Character> npc1Parents = new HashSet<>();
        npc1Parents.add(npc1.getFamily().getFamilyMembers(npc1, "Mother").get(0));
        npc1Parents.add(npc1.getFamily().getFamilyMembers(npc1, "Father").get(0));

        Set<Character> npc2Parents = new HashSet<>();
        npc2Parents.add(npc1.getFamily().getFamilyMembers(npc2, "Mother").get(0));
        npc2Parents.add(npc1.getFamily().getFamilyMembers(npc2, "Father").get(0));
        
        if (!Collections.disjoint(npc1Parents, npc2Parents)) {
            return true;  // They have at least one common parent
        }
        
        // Recursively check if npc1 and npc2 have common ancestors
        visited.add(npc1);
        visited.add(npc2);
        
        for (Character parent : npc1Parents) {
            if (!visited.contains(parent) && areCloselyRelated(parent, npc2, visited)) {
                return true;  // They have a common ancestor
            }
        }
        
        for (Character parent : npc2Parents) {
            if (!visited.contains(parent) && areCloselyRelated(npc1, parent, visited)) {
                return true;  // They have a common ancestor
            }
        }
        
        return false;  // They are not closely related
    }
}
