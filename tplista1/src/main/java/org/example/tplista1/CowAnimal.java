package org.example.tplista1;

/**
 * Class of a Cow that implements Mammal class.
 * @author Ania PC
 */
public class CowAnimal implements Mammal {
 
  @Override
  
  public void eats() {
    System.out.println("Cow eats grass.");
  }

  @Override

  public void says() {
    System.out.println("Cow says: 'Ela is a great friend'.");
  }

}