object sumList {

  def main(args: Array[String]): Unit ={

    var list = List(3,4,5)

    println(sList(list))

    println(list.sum)

  }

  def sList(list: List[Int]): Int = {

    if (list.isEmpty) throw new IllegalArgumentException("Error!")
    else if (list.tail.isEmpty) list.head
    else list.head + sList(list.tail)
  }

}
