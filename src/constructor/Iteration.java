package constructor;

public class Iteration {
	int n;
	
	public Iteration(int n) {
		this.n = n;
	}
	public int calculationMethod() {
		int factorial = 1;
		for (int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	};
}
