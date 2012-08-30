package caseclasses.and.extractors

object DivisibleByTwo {
  def unapply(z: Int): Option[Int] = if (z%2 == 0) Some(z/2) else None
}