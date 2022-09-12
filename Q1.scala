object Q1 extends App {   
    println("Enter the numbr part of first rational number: ");
    val n=scala.io.StdIn.readInt()
    println("Enter the denom part of first rational number: ");
    val d=scala.io.StdIn.readInt()

    println("Enter the numbr part of second rational number: ");
    val m=scala.io.StdIn.readInt()
    println("Enter the denom part of second rational number: ");
    val e=scala.io.StdIn.readInt()

    val firstRa = new Rational(n,d)
    val secondRa = new Rational(m,e)
    println(firstRa.neg)
    val q = firstRa.add(secondRa)
    println(q)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}
