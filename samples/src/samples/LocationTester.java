package samples;

public class LocationTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleLocation loc1 = new SimpleLocation(39.9, 116.4);
		SimpleLocation loc2 = new SimpleLocation(59.8, 36.7);
		System.out.println("Address of loc1 : "+loc1);
		System.out.println("Address of loc2 : "+loc2);
		loc1 = loc2;
		loc1.lat = -8.3;
		System.out.println(loc2.lat + "  "+loc2.lon);
		System.out.println("Address of loc1 : "+loc1);
		System.out.println("Address of loc2 : "+loc2);
	}

}
