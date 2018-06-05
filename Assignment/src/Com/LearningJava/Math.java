package Com.LearningJava;

public class Math {
	int parent_a, parent_b;

	public void calculate(int par_a, int par_b) {
		this.parent_a = par_a;
		this.parent_b = par_b;
		System.out.println("par_a=" + par_a);
		System.out.println("par_b=" + par_b);
		System.out.println("parent_a=" + parent_a);
		System.out.println("parent_b=" + parent_b);
		
	}
}
