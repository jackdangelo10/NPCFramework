package resources.Foodstuffs.AnimalResources;

import animals.Animal;

public class BeastOfBurdenAnimalResource extends AnimalResource
{

    public BeastOfBurdenAnimalResource(Animal a) 
    {
        super.resourceName = "Beast of Burden";
        super.manpowerOutput = 3;
        super.foodOutput = 1;
    }
    
}
