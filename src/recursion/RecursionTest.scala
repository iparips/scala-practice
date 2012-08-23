package recursion

import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

class RecursionTest extends Spec with ShouldMatchers {

  it("works") {

    emptyFlowerBowlOf(8)

    listLength( List[String]("blah", "blah", "blah")) should be(3)

    listLength( List[String]("blah", "blah" )) should be(2)

    reverseList( List("fun", "in", "scala" )) should be(List("scala", "in", "fun" ))

  }

  def emptyFlowerBowlOf(flowerCount:Int) {
    if (flowerCount == 0) { println("zero flowers"); return; }
    println("count: " + flowerCount)
    emptyFlowerBowlOf(flowerCount - 1)
  }

  def listLength(list: List[String]):Int = {
    if (list.length == 0) return 0
    return 1 + listLength(list.tail)
  }

  def listLength2(list: List[String]): Int = {

    return list match {
      case Nil => 0
      case x::xs => 1+listLength2(xs)
    }

  }

  def reverseList(list: List[String]):List[String]= {

    return list match {
      case Nil => Nil
      case x::xs => reverseList(xs) ::: List(x)
    }

  }



}
