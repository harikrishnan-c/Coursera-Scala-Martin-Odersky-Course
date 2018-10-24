object NewtonsSqureRoot {

  def abs(x:Double) = if (x<0) -x else x
  def sqrt(x:Double)={

    def iterSqrt(guess:Double):Double=
      if(isGoodEnough(guess)) guess
      else iterSqrt(improve(guess))

    def isGoodEnough(guess:Double)=
      (abs(guess*guess - x)/x < 0.001 )

    def improve(guess:Double)=
      (guess+x/guess)/2

    iterSqrt(1.0)

  }
  println(sqrt(2))
}
