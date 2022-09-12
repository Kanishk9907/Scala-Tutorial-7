object Q2 extends App {
    println("Enter the numbr part of first rational number: ");
    val n=scala.io.StdIn.readInt()
    println("Enter the denom part of first rational number: ");
    val d=scala.io.StdIn.readInt()

    println("Enter the numbr part of second rational number: ");
    val m=scala.io.StdIn.readInt()
    println("Enter the denom part of second rational number: ");
    val e=scala.io.StdIn.readInt()

    println("Enter the numbr part of third rational number: ");
    val o=scala.io.StdIn.readInt()
    println("Enter the denom part of third rational number: ");
    val f=scala.io.StdIn.readInt()

    val x = new Rational(n,d)
    val y = new Rational(m,e)
    val z = new Rational(o,f)
  
    val a = x-y-z
    
    println(a)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d
    def neg = new Rational(-this.numer, this.denom)
    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def -(r:Rational) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
}
