package javaPJ;

public class DrawF extends AbstractDrawFunction{

	@Override
	public double f(double x) {
		return 5*Math.cos(x)+ ( Math.sin(x));
	}

}
