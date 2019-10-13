package fibonacci

object fibonacci {

  def main(args: Array[String]): Unit ={

    println(fib(1))
    println(fib(2))
    println(fib(3))
    println(fib(4))
    println(fib(5))

  }

  def fib( n : Int): Int = {

    var i = 0
    var a = 0
    var b = 1

    while ( i < n - 1 ){

      val c = a + b

      a = b

      b = c

      i += 1

    }

    return a
  }

}
