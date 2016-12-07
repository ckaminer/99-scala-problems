object Problem {
  def lastWithRecursion[A](ls: List[A]) : A = ls match {
    case last :: Nil => last
    case _ :: tail   => lastWithRecursion(tail)
    case Nil         => throw new NoSuchElementException
  }
}
