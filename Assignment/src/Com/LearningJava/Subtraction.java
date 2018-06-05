package Com.LearningJava;

public class Subtraction extends Math {

	public void calculate() {
		super.calculate(parent_a,parent_b);
		int subtraction = (parent_a - parent_b);
		System.out.println("subtraction=" + subtraction);

		// TODO Auto-generated constructor stub
	}
}
