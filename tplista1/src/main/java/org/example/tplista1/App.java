package org.example.tplista1;

/**
 * Hello world!
 *
 */
public class App 
{
  /**
   * Within we create two objects - cow and calf.
   * 
   */
  public static void main(String[] args) {
    final CowAnimal littleCow = new CowAnimal();
    littleCow.eats();
    littleCow.says();
    final CalfAnimal littleCalf = new CalfAnimal();
    littleCalf.walks();
    System.out.println("Dziala!");
    System.out.println("Dziala");
  }
}
