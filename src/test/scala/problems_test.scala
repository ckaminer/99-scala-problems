import org.scalatest.{Matchers, FunSuite}

class ProblemTest extends FunSuite with Matchers {
  test("recursively find the last element of a list") {
    Problem.lastWithRecursion(List(1, "a", 7)) should be (7)
  }

  test("recursively find the last but one element of a list") {
    Problem.secondToLastWithRecursion(List(1,2,3,4)) should be (3)
  }

}
