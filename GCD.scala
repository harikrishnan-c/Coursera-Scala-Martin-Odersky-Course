object GCD {
  def gcd(x:Int,y:Int):Int=
    if (y == 0 ) y else gcd(y,x%y)
}
