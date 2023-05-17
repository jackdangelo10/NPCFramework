import characters.CharacterAttributes.Sex;

import javax.management.BadAttributeValueExpException;

import characters.*;
import characters.Character;

public class TestSuite 
{
     
    public static void main(String[] args) 
    {
        FamilyGenerator fam = new FamilyGenerator();
        Family f = fam.generateFamily();
        
    }
}
