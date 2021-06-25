package org.as.devtechsolution.creational.factory.pet;

public class PetFactory {
    public Pet getPet(String petType){
        Pet pet=null;
        if ("Bow".equals(petType))
            pet= new Dog();
        else if("Meaw".equals(petType))
            pet = new Cat();
        return pet;

    }
}
