package javaPJ;

public class DrawE extends AbstractDrawFunction{

	@Override
	public double f(double x) {
		return Math.cos(x)+ (5* Math.sin(x));
	}
	
}
