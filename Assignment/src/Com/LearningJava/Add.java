package Com.LearningJava;

public class Add extends Math {

	public void calculate(int par_a, int par_b) {
		super.calculate(par_a, par_b);
		this.parent_a = par_a;
		this.parent_b = par_b;
		int addition = (par_a + par_b);
		System.out.println("addition=" + addition);

		// TODO Auto-generated constructor stub
	}

}
