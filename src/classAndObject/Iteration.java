package classAndObject;

public class Iteration {
	public int calculationMethod(int inputVariable) {
		int factorial = 1;
		for (int n = inputVariable; n >= 1; n--) {
			factorial = factorial * n;
		}
		return factorial;
	};
}
