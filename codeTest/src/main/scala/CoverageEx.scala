object CoverageEx {

  def main(args: Array[String]) = {
    val a = m()
    print("Done !")
  }
  
  def m() = {
    if1()
    if2()
    patMat(1234)
    tryB()
  }
  
  def if1():Int = {
  	if(true) {
		print("trueMain")
	} else {
		print("falseMain")
	}
    return 1
  }
  def if2() = {
  	if(false) print("thenP") else print("elseP")
  }
  
  def patMat(asd : Int) = {
    val a = 12
    val k = asd
    val c = true || false && (true && false)
    
    if(c){
        val d = a + k
        print(d)
    } else {
        print("a")
    }
    a match {
        case 0 => if(false) print("thenP") else print("elseP")
        case 12 if (k == 1234) => print("12")
        case _ => print("Other")
    }
  }
  
  def tryB() = {
    try {
       CoverageEx.throwEx(CoverageEx.throwEx(CoverageEx.throwEx(false)))
    } catch {
      case foo: IllegalArgumentException => print("Exception catched !")
      case _: Throwable => println("Got some other kind of exception")
    } finally {
            print("Finally block")
    }
  }
  
  def throwEx(a : Boolean):Boolean = {
    if(a){
        throw new IllegalArgumentException("Argument is true !")
    } else {
        true
    }
  }
  
}