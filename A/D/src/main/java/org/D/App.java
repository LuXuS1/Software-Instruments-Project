package org.D;

import org.B.Animal;
import org.C.AnimalFromC;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        // can be accesed because of dependency of C(which depends on B)
        Animal animal = new Animal();
        animal.animalSound();

        AnimalFromC animalC = new AnimalFromC();
        animalC.animalSound();
    }
}
