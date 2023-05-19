import characters.CharacterAttributes.Sex;

import java.util.ArrayList;
import java.util.List;

import javax.management.BadAttributeValueExpException;

import characters.*;
import characters.Character;

public class TestSuite 
{
     
    public static void main(String[] args) 
    {
        NPCGenerator gen = new NPCGenerator();

        NPC grandpa = gen.generateRandomAdultNPC(Sex.MALE);
        grandpa.setName("Jim Carney");
        NPC grandma = gen.generateRandomAdultNPC(Sex.FEMALE);
        grandma.setName("Anne Carney");
        NPC mom = gen.generateRandomAdultNPC(Sex.FEMALE);
        mom.setName("Erin D'Angelo");
        NPC uncle_mike = gen.generateRandomAdultNPC(Sex.MALE);
        uncle_mike.setName("Michael Carney");
        NPC aunt_andy = gen.generateRandomAdultNPC(Sex.FEMALE);
        aunt_andy.setName("Andrea Farrell");

        grandpa.addChild(uncle_mike);
        grandpa.addChild(mom);
        grandpa.addChild(aunt_andy);
        grandpa.setSpouse(grandma);

        grandma.addChild(uncle_mike);
        grandma.addChild(mom);
        grandma.addChild(aunt_andy);
        grandma.setSpouse(grandpa);

        mom.setMother(grandma);
        mom.setFather(grandpa);
        aunt_andy.setMother(grandma);
        aunt_andy.setFather(grandpa);
        uncle_mike.setMother(grandma);
        uncle_mike.setFather(grandpa);

        NPC dad = gen.generateRandomAdultNPC(Sex.MALE);
        dad.setName("Jack D'Angelo II");
        dad.setSpouse(mom);
        mom.setSpouse(dad);

        NPC lucas = gen.generateRandomAdultNPC(Sex.MALE);
        lucas.setName("Lucas D'Angelo");
        NPC katie = gen.generateRandomAdultNPC(Sex.FEMALE);
        katie.setName("Katie D'Angelo");
        NPC me = gen.generateRandomAdultNPC(Sex.MALE);
        me.setName("Jack D'Angelo III");

        dad.addChild(lucas);
        dad.addChild(katie);
        dad.addChild(me);

        mom.addChild(lucas);
        mom.addChild(katie);
        mom.addChild(me);

        lucas.setMother(mom);
        katie.setMother(mom);
        me.setMother(mom);
        lucas.setFather(dad);
        katie.setFather(dad);
        me.setFather(dad);

        NPC aunt_carry = gen.generateRandomAdultNPC(Sex.FEMALE);
        aunt_carry.setName("Carry Carney");
        aunt_carry.setSpouse(uncle_mike);
        uncle_mike.setSpouse(aunt_carry);

        NPC maddy = gen.generateRandomAdultNPC(Sex.FEMALE);
        maddy.setName("Maddy Carney");
        NPC nick = gen.generateRandomAdultNPC(Sex.MALE);
        nick.setName("Nick Carney");

        aunt_carry.addChild(nick);
        aunt_carry.addChild(maddy);
        uncle_mike.addChild(nick);
        uncle_mike.addChild(maddy);

        maddy.setMother(aunt_carry);
        maddy.setFather(uncle_mike);
        nick.setMother(aunt_carry);
        nick.setFather(uncle_mike);

        NPC uncle_john = gen.generateRandomAdultNPC(Sex.MALE);
        uncle_john.setName("John Farrell");
        uncle_john.setSpouse(aunt_andy);
        aunt_andy.setSpouse(uncle_john);

        NPC danny = gen.generateRandomAdultNPC(Sex.MALE);
        danny.setName("Danny Mitchell");
        NPC joey = gen.generateRandomAdultNPC(Sex.MALE);
        joey.setName("Joey Mitchell");

        uncle_john.addChild(danny);
        uncle_john.addChild(joey);
        aunt_andy.addChild(danny);
        aunt_andy.addChild(joey);

        danny.setMother(aunt_andy);
        danny.setFather(uncle_john);
        joey.setMother(aunt_andy);
        joey.setFather(uncle_john);

        NPC pop_pop = gen.generateRandomAdultNPC(Sex.MALE);
        pop_pop.setName("Jack D'Angelo I");
        NPC connie = gen.generateRandomAdultNPC(Sex.FEMALE);
        connie.setName("Connie D'Angelo");
        pop_pop.setSpouse(connie);
        connie.setSpouse(pop_pop);

        NPC uncle_james = gen.generateRandomAdultNPC(Sex.MALE);
        uncle_james.setName("James D'Angelo I");

        pop_pop.addChild(uncle_james);
        pop_pop.addChild(dad);
        connie.addChild(uncle_james);
        connie.addChild(dad);

        dad.setMother(connie);
        dad.setFather(pop_pop);
        uncle_james.setFather(pop_pop);
        uncle_james.setMother(connie);

        NPC aunt_amy = gen.generateRandomAdultNPC(Sex.FEMALE);
        aunt_amy.setName("Amy D'Angelo");
        aunt_amy.setSpouse(uncle_james);
        uncle_james.setSpouse(aunt_amy);

        NPC james = gen.generateRandomAdultNPC(Sex.MALE);
        james.setName("James D'Angelo II");
        NPC eve = gen.generateRandomAdultNPC(Sex.FEMALE);
        eve.setName("Eve D'Angelo");

        aunt_amy.addChild(james);
        aunt_amy.addChild(eve);
        uncle_james.addChild(james);
        uncle_james.addChild(eve);

        eve.setMother(aunt_amy);
        eve.setFather(uncle_james);
        james.setMother(aunt_amy);
        james.setFather(uncle_james);


        RelationshipFinder finder = new RelationshipFinder();
        String relationship = finder.findFamilialRelationship(nick, uncle_mike);
        System.out.println(relationship);
        
        FamilySearch search = new FamilySearch();
        //Cousins and nephew/niece not working.

        List<Character> people = search.search(joey, "Sibling");
        for(Character i : people)
        {
            System.out.println(i.getName());
        }
    }
}
