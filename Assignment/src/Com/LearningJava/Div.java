package Com.LearningJava;

public class Div extends Math {

	public void calculate(int par_a, int par_b) {
		super.calculate(par_a, par_b);
		this.parent_a = par_a;
		this.parent_b = par_b;
		int division = (par_a / par_b);
		System.out.println("division=" + division);

		// TODO Auto-generated constructor stub
	}
}
