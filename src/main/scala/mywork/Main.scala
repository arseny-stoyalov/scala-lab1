package mywork

import mywork.classes.animals.Animal
import mywork.classes.food.Food
import mywork.patterns.PatternMatching
import mywork.patterns.PatternMatching.{Rock, Scissors}

object Main extends App {

  println(PatternMatching.isMaxOrMoritz("moritz"))

  println(PatternMatching.rPS(Rock, Scissors))
}
