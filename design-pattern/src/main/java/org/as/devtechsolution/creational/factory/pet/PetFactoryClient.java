package org.as.devtechsolution.creational.factory.pet;

public class PetFactoryClient {
    public static void main (String[] args) {
        PetFactory petFactory = new PetFactory();
        Pet petDog= petFactory.getPet("Bow");
        System.out.println(petDog.petSound());

        /*Pet dog= new Dog();
        System.out.println(dog.petSound());*/
        /*Pet cat = new Cat();
        System.out.println(cat.petSound());*/


    }


}
