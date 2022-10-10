package scalatesting
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.GivenWhenThen

class dummy_test_code extends AnyFeatureSpec with GivenWhenThen {

  def fibo(n: Int, secondlast: Int, last: Int): Int = {
    if (n == 1) {
      last
    }

    else {
      // println("hahaahah")
      fibo(n - 1, last, last + secondlast)
    }
  }

  Feature("entering number") {

    info("As a programmer")
    Scenario("entering prime number") {

      Given("setting number to check")
      val v = (fibo(8, 1, 1))
      When("number is given now")
      Then("check now")
      assert(v === 34)
    }

    Scenario("entering prime number 2") {
      Given("setting number to check")
      val v = (fibo(9, 1, 1))
      When("number is given now")
      Then("check now")
      assert(v === 55)
    }
  }
}