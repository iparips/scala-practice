package lexicalscoping

import org.scalatest.{BeforeAndAfterEach, Spec}
import org.scalatest.matchers.ShouldMatchers

class LexicalScopingTest extends Spec with ShouldMatchers {

  it("works") {

    var a = "Bu"

    val changeA = () => {
      a = "Do"
      a should be("Do")
    }

    changeA()

    a should be("Do")

  }

}
