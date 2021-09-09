class Rational(n:Int,d:Int){
  require(d>0,"Denom should greater than 0")
  def numer = n/gcd(Math.abs(n),d)
  def denom = d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)
  private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)
  
  def +(r:Rational)=new Rational(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom)
  def neg =new Rational(-this.numer,this.denom)
  def sub(r:Rational)=this+r.neg
  
  override def toString= numer+"/"+denom
}

object Q2 extends App{
  val r1 = new Rational(3,4)
  val r2 = new Rational(5,8)
  val r3 = new Rational(2,7)
  
  val p = r1.sub(r2)
  val x = p.sub(r3)
  
  println(x)
  
}


