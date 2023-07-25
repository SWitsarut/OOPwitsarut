
class Complex {
	private double r, i;
	Complex(double r, double i) {
		this.r = r; this.i = i;
	}
	Complex(Complex c) {
		this(c.r, c.i);
	}
	
	public void add(Complex c) {
		r += c.r;
		i += c.i;
	}
	public void sub(Complex c) {
		r -= c.r;
		i -= c.i;
	}
	
	public void mul(Complex c) {
		double tempR = this.r*c.r - this.i*c.i;
		double tempI = this.r*c.i + this.i*c.r;
		this.r = tempR;
		this.i = tempI;
	}
	
	public void div(Complex c) {
		double tempR = (this.r*c.r - this.i*c.i)/(Math.pow(c.i,2) + Math.pow(c.r, 2));
		double tempI = (this.i*c.r - this.r*c.i)/(Math.pow(c.i,2) + Math.pow(c.r, 2));
		this.r = tempR;
		this.i = tempI;
	}
	
	public void print() {
		System.out.println(r + " + "+ i+"i");
	}
}

class No1 {
	public static void main(String args[]) {
		Complex a = new Complex(1.0, 2.0);
		Complex b = new Complex(3.0, 4.0);
		Complex c = new Complex(a);
		
		c.div	(b);
		c.print();
	}	
}
