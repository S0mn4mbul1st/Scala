def orderedList( list: List[Int]): List[Int] = {

  if ( list.size == 0) println("Ordered")

  if ( list.head <= list.tail.head)  orderedList(list.tail)

  else println("Unordered")

  return list
}

orderedList( List ( 1, 2, 3, 4, 5) )


def listCombiner(flist : List[Int] , slist: List[Int]): List[Int] = {

  val c = flist ::: slist

  return c
}

listCombiner( List(1,2,3,4) , List(5,6,7,8) )




def replaceNth( list: List[Int] , n : Int, a : Int) : List[Int] = {

  if ( n == 0 ) list.head = a

  else replaceNth(list.tail, n - 1 , a )

}

println(List(1,2,3,4,5) , 2 , 999 )


def getFibonacci(index: Int): Int = {
  if (index <= 0) {
    return 0
  } else if (index == 1) {
   return 1
  } else {
    return ( ( getFibonacci(index - 1) ) + ( getFibonacci(index - 2) ) )
  }
}

println(getFibonacci(6))


def uniter(atm: Int) = {

  println("1 Pressure in atm -> " + atm * 14.6959 + " PSI\n")
  println("1 Pressure in atm -> " + atm * 1.01325 + " bar\n")
  println("1 Pressure in atm -> " + atm * 1.03323 + " kg/cm^2\n")

}

uniter(1)


def splitLister(lister: List[Int]): Any  = {

  var le = List[Int]

  var lo = List[Int]


  if ( lister.head % 2 == 0 ){

    println(lister.head + " is even")

    splitLister(lister.tail)

  }

  else if ( lister.head % 2 == 1 ){

    println(lister.head + " is odd")

    splitLister(lister.tail)
  }

}

splitLister( List( 1,2,3,4,5,6) )
