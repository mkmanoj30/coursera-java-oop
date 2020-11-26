package samples;

public class ArrayLocation {
	
	private double coords[];
	
	public ArrayLocation(double[] coords) {
		this.coords = coords;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] coords = {4.0,11.8};
		ArrayLocation array = new ArrayLocation(coords);
		coords[0] = 32.9;
		coords[1] = -117.2;
		System.out.println(array.coords[0]);
		System.out.println(array.coords[1]);
		System.out.println(coords);
		
	}

}
	