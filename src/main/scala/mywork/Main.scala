package mywork

import mywork.classes.animals.Animal
import mywork.classes.food.Food
import mywork.patterns.PatternMatching
import mywork.patterns.PatternMatching.{Rock, Scissor}

object Main extends App {

  println(PatternMatching.isMaxOrMoritz("moritz"))
  println(PatternMatching.rPS(Rock, Scissor))
  println(PatternMatching.updateFood(PatternMatching.Bird("eagle", PatternMatching.Meat)))

}
