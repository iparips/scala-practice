package caseclasses.and.extractors

import org.scalatest.matchers.ShouldMatchers
import org.scalatest.Spec

class CaseClassesAndExtractorsTest extends Spec with ShouldMatchers {

  describe("extractors") {

    it("is a simple extractor example") {

      val x = 20

      x match {
        case DivisibleByTwo(n) => Console.println(n + " is divisible by two")
        case _ => Console.println("did not match")
      }

    }
  }

  describe("case classes") {

    it("is example exploring value object like properties of a case class") {

      val me = CaseClassPerson("Ilya", "P")

      val first = me.firstName // automatic val accessors
      val last = me.lastName

      me should be(CaseClassPerson(first, last)) // value equality
    }

    it("is a pattern matching example") {

      name(Card(11, "spades")) should be("Jack of spades")
      name(Card(12, "spades")) should be("Queen of spades")
      name(Card(6, "diamonds")) should be("6 of diamonds")

    }

    it("is another case class matching example") {

      greet(new CaseClassPerson("Ilya", "P")) should be("hello ilya")
      greet(new CaseClassPerson("Aba", "K")) should be("hello unknown")

    }

    it("is an example of matching on type") {

      plusOne(0.1) should be(1.1)
      plusOne(1) should be(2)
      plusOne("one") should be("ones")

    }

    def greet(p: CaseClassPerson): String = {

      p match {
        case CaseClassPerson("Ilya", x) => "hello ilya"
        case _ => "hello unknown"
      }
    }

    def plusOne(o: Any): Any = {
      o match {
        case i: Int => i + 1
        case d: Double => d + 1.0
        case text: String => text + "s"
      }
    }

    def name(c: Card) = c match {
      case Card(11, "spades") => "Jack of spades"
      case Card(12, suit: String) => "Queen of " + suit
      case Card(13, suit: String) => "King of " + suit
      case Card(x: Int, suit: String) => "%d of %s".format(x, suit)
    }

  }

}