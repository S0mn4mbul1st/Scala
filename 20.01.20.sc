trait Debug {

  def debugName() {
    println("Class: " + this.getClass.getSimpleName)
  }

  def debugVars(): Any = {
    var i = 0
    val ans = this.getClass.getDeclaredFields

    for (a <- ans) {

      a.setAccessible(true)

      println("Field: " + ans(i).getName() + " => "+ ans(i).getType()+ ", "+ ans(i).get(this))

      i += 1
    }
  }
}

class Point(xv: Int, yv: Int) extends Debug {
  var x: Int = xv
  var y: Int = yv
  var a: String = "test"
}

  var p: Point = new Point(3, 4)
  p.debugName
  p.debugVars()




