package javaPJ;

public class DrawG extends AbstractDrawFunction{

	@Override
	public double f(double x) {
		return Math.log(x)+Math.pow(x, 2);
	}
	
}
