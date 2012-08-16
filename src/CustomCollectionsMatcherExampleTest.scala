import org.scalatest.{Spec, BeforeAndAfterEach}
import org.scalatest.matchers._

class CustomCollectionsMatcherExampleTest extends Spec with ShouldMatchers with BeforeAndAfterEach with MyCustomMatcher {

  it("should return true when I look up apple by colour") {

    val list = Seq("red apple", "green apple", "purple cow")
    list should haveElementSuchThat(e => e.contains("green"))

  }

}
