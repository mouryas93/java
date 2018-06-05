package Com.LearningJava;

public class Mul extends Math {

	public void calculate(int par_a, int par_b) {
		super.calculate(par_a, par_b);
		this.parent_a = par_a;
		this.parent_b = par_b;
		int multiplication = (par_a * par_b);
		System.out.println("multiplication=" + multiplication);

		// TODO Auto-generated constructor stub
	}
}
