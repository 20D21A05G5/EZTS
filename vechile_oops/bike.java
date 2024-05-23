package vechile_oops;

public class bike extends Vechile{
	private String type;
	
	public bike (int a,int b,String c,String t) {
		super(a, b, c);
		this.type=t;
	
	}
	
	void bikeOutput() {
		super.VechileOutput();
		System.out.println("bike Type = "+this.type);
	}
}