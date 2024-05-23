
package vechile_oops;

public class Vechile {
	private int Model;
	private int engine;
	private String color;	
	
	public Vechile(int a, int b , String c) {
		this.Model = a;
		this.engine = b;
		this.color = c;
	}
	
	void VechileOutput() {
		System.out.println("Modle = " + this.Model);
		System.out.println("Engine = " + this.engine + "cc");
		System.out.println("Colour = " + this.color);
	}
}