package lectures.week3fp

object Collections extends App {
  val aList1 = List(1, 2, 3)
  val aList2 = List(4, 6, 7)
  val aList3 = List(10, 100, 1000)

  aList1.flatMap(x => aList2.flatMap(y => if (x % 2 != 0) aList3.map(a => a * x * y)))
  aList1.map(x =>  aList3.flatMap(a => a * x))
}
