package vechile_oops;

public class bus extends Vechile {
	private int seat_cap;

	
	public bus (int a,int b,String c,int p) {
		super(a,b,c);
		this.seat_cap=p;
	
	}
	public String toString() {
		return "bus(seat_cap=" + seat_cap + ",toString()=" + super.toString() +")";
	}
	
	void busOutput() {
		super.VechileOutput();
		System.out.println("seat_cap = " + seat_cap);

	}
}
