package mywork

/**
 * A simple animal entity
 * @param aName animal name
 * @param aSpecies animal species
 * @param aFood what animal eats
 */
class Animal(aName: String, aSpecies: String, aFood: String) {

  private val name: String = aName

  private val species: String = aSpecies

  private val food: String = aFood

  /**
   * Returns if animal eats certain food
   * @param food food that animal may or may not eat
   * @return true if animal eats the food, false otherwise
   */
  def eats(food: String): Boolean =
    ((name equals Animal.cat.name) && (food equals Animal.cat.food)) ||
      ((name equals Animal.parrot.name) && (food equals Animal.parrot.food)) ||
      ((name equals Animal.goldfish.name) && (food equals Animal.goldfish.food))

}

object Animal {

  val cat = new Animal("cat", "mammal", "meat")

  val parrot = new Animal("parrot", "bird", "vegetables")

  val goldfish = new Animal("fish", "fish", "plants")

}