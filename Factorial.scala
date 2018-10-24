

object Factorial {
  def factorial(n:Int):Int=
    if (n==0) 1 else n*factorial(n-1)


  def tailrecFactorial(n:Int):Int={
    def loop(acc:Int,n:Int):Int=
      if (n==0) acc
      else loop(acc*n,n-1)
    loop(1,n)

  }
}
