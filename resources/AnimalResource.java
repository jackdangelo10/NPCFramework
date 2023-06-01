package resources;

import animals.Animal;

public abstract class AnimalResource extends Resource
{
    private Animal animal = null;
    
    public AnimalResource(Animal a)
    {
        animal = a;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
