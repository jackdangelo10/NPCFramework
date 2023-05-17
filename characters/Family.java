package characters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Family 
{
    private List<characters.Character> members;
    private Map<characters.Character, Map<String, List<characters.Character>>> relationships;

    public Family() 
    {
        this.members = new ArrayList<>();
        this.relationships = new HashMap<>(); 
    }

    public void addMember(characters.Character person) {
        members.add(person); 
    }

    public void addRelationship(characters.Character person1, String relationship, characters.Character person2) 
    {
        Map<String, List<characters.Character>> person1Relationships = relationships.computeIfAbsent(person1, key -> new HashMap<>());
        List<characters.Character> members = person1Relationships.getOrDefault(relationship, new ArrayList<>());
        members.add(person2);
        person1Relationships.put(relationship, members);
    }

    public List<characters.Character> getFamilyMembers(characters.Character person, String relationship) 
    {
        Map<String, List<characters.Character>> personRelationships = relationships.get(person);
        if (personRelationships != null) {
            return personRelationships.getOrDefault(relationship, new ArrayList<>());
        }
        return new ArrayList<>();
    }

    public List<characters.Character> getAllMembers() {
        return members;
    }

}
