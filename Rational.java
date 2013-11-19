public class Rational{
    
    private int num;
    private int den;
    
    public Rational(){
	num=0;
	den=1;
    }
    public Rational(int num,int den){
	if (den == 0){
		this.num=0;
		this.den=1;}
	else{
	    this.num=num;
	    this.den=den;}
    }
    public int getNum(){
	return num;}
    public int getDen(){
	return den;}
    public String toString(){
	return "The rational is " + num+"/"+den;
    }
    public double floatValue(){
	return num*1.0/den;
    }
    public void multiply(Rational rad){
	num = num * rad.getNum();
	den = den * rad.getDen();}
    public void divide(Rational rad){
	num = num * rad.getDen();
	den = den * rad.getNum();}
    public void add(Rational rad){
	int numTwo = den*rad.getNum();
	num = num*rad.getDen();
	den = den * rad.getDen();
	num=num+numTwo;
     }
    public void subtract(Rational rad){
	int numTwo = den*rad.getNum();
	num = num*rad.getDen();
	den = den * rad.getDen();
	num=num-numTwo;
     }
    public int gcd(){
	return Stats.gcd(num,den);
    }
    public void reduce(){
	int gcd = this.gcd();
	num=num/gcd;
	den=den/gcd;}
    public static int gcd(int num, int den){
	return Stats.gcd(num,den);
    }
    public int compareTo(Rational rad){
	if (this.floatValue()==rad.floatValue()){
	    return 0;}
	else if (this.floatValue()>rad.floatValue()){
	    return 1;}
	else {return -1;}}

    public static void main( String[] arg){
	Rational one = new Rational(3,2);
	Rational two = new Rational(1,2);
	/*
	System.out.println(one + " or " + one.floatValue());
	one.multiply(two);
	System.out.println(one + " or " + one.floatValue());
	one.divide(two);
	System.out.println(one + " or " + one.floatValue());
	*//*
	System.out.println(one + " or " + one.floatValue());
	one.add(two);
	System.out.println(one + " or " + one.floatValue());
	one.subtract(two);
	System.out.println(one + " or " + one.floatValue());
	one.reduce();
	System.out.println(one + " or " + one.floatValue());
	  */
	
    }
}
