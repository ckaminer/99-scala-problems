import org.scalatest.{Matchers, FunSuite}

class ListProblemsTest extends FunSuite with Matchers {
  test("recursively find the last element of a list") {
    ListProblems.lastWithRecursion(List(1, "a", 7)) should be (7)
  }

  test("recursively find the last but one element of a list") {
    ListProblems.secondToLastWithRecursion(List(1,2,3,4)) should be (3)
  }

  test("recursively find the kth element of a list") {
    ListProblems.kthElementWithRecursion(2, List("a", "b", "c", "d", "e")) should be ("c")
  }

  test("recursively find the kth element of a list of length 1") {
    ListProblems.kthElementWithRecursion(0, List("a")) should be ("a")
  }

  test("find the length of a list") {
    ListProblems.listLength(List("a", "b", "c", "d", "e")) should be (5)
  }

  test("reverse a list") {
    ListProblems.listReverse(List("a", "b", "c", "d", "e")) should be (List("e", "d", "c" ,"b", "a"))
  }

  test("list is a palindrome") {
    ListProblems.isPalindrome(List("a", "b", "c", "b", "a")) should be (true)
  }

  test("list is not a palindrome") {
    ListProblems.isPalindrome(List("a", "b", "c", "d", "e")) should be (false)
  }
}
