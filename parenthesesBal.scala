object parenthesesBal {
  def balance(chars: List[Char]): Boolean={
    def newOpnCount(chars:Char,presentOpnCnt:Int):Int=
      if (chars == '(' && presentOpnCnt >= 0) presentOpnCnt+1
      else if (presentOpnCnt == 0 && chars == ')' ) -1
      else if (presentOpnCnt > 0 && chars == ')' ) presentOpnCnt-1
      else presentOpnCnt
    def loopThough(chars:List[Char],openCnt:Int):Int=
      if (chars.isEmpty) openCnt else loopThough(chars.tail,newOpnCount(chars.head,openCnt) )
    if (loopThough(chars,0) == 0) true else false
  }
}
