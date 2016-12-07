object Problem {
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
}
