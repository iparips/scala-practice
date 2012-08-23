package custommatcher

import org.scalatest.matchers.{MatchResult, Matcher}

trait MyCustomMatcher {

  def haveElementSuchThat(predicate: (String) => Boolean) =
    new Matcher[Seq[String]] {
      def apply(list: Seq[String]) =
        MatchResult(
          list.exists(predicate(_)),
          list + " does not contain desired element.",
          list + " desired element found."
        )
    }

}
