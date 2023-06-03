package resources.Foodstuffs.AnimalResources;

import animals.Animal;

public class DomesticAnimalResource extends AnimalResource
{
    public DomesticAnimalResource(Animal a)
    {
        super.resourceName = "Domestic Animal";
        super.happinessOutput = 3;
        super.cultureOutput = 1;
    }
}
