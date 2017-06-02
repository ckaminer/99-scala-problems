object ListProblems {
  def lastWithRecursion[A](ls: List[A]) : A = ls match {
    case last :: Nil => last
    case _ :: tail   => lastWithRecursion(tail)
    case Nil         => throw new NoSuchElementException
  }

  def secondToLastWithRecursion[A](ls: List[A]): A = ls match {
    case a :: _ :: Nil => a
    case _ :: tail     => secondToLastWithRecursion(tail)
    case Nil           => throw new NoSuchElementException
  }

  def kthElementWithRecursion[A](k: Int, ls: List[A]): A = (k, ls) match {
    case (0, h :: tail) => h
    case (k, h :: tail) => kthElementWithRecursion(k - 1, tail)
    case (k, Nil)       => throw new NoSuchElementException
  }

  def listLength[A](ls: List[A]) : Int = ls match {
    case last :: Nil => 1
    case _ :: tail   => listLength(tail) + 1
    case Nil         => throw new NoSuchElementException
  }

  def listReverse[A](ls: List[A]) : List[A] = ls match {
    case last :: Nil => List(last)
    case first :: tail => listReverse(tail) :+ first
    case Nil => throw new NoSuchElementException
  }
}
