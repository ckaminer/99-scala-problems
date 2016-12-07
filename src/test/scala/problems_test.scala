import org.scalatest.{Matchers, FunSuite}

class ProblemTest extends FunSuite with Matchers {
  test("recursively find the last element of a list") {
    Problem.lastWithRecursion(List(1, "a", 7)) should be (7)
  }

  test("recursively find the last but one element of a list") {
    Problem.secondToLastWithRecursion(List(1,2,3,4)) should be (3)
  }

  test("recursively find the kth element of a list") {
    Problem.kthElementWithRecursion(2, List("a", "b", "c", "d", "e")) should be ("c")
  }

  test("recursively find the kth element of a list of length 1") {
    Problem.kthElementWithRecursion(0, List("a")) should be ("a")
  }

}
