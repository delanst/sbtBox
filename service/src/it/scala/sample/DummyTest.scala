package sample

import org.specs2.matcher.ShouldMatchers
import org.specs2.mutable.Specification


class DummyTest extends Specification with ShouldMatchers {

  "The dummy service" should {
    "save a list of dummy entities" in {
      ok
    }
  }
}
