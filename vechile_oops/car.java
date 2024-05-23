package vechile_oops;

public class car extends Vechile {
	private String fuel_type;
	
	public car (int a,int b,String c,String fuel_type) {
		super(a,b,c);
		this.fuel_type=z;
	
	}
	public String toString() {
		return "car(fuel_type" + fuel_type + ",toString()=" + super.toString() + ")";
	}
	
	void bikeOutput() {
		super.VechileOutput();
		System.out.println("fuel_type = "+this.fuel_type);
	}
}
