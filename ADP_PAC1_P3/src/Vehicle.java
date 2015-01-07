import java.util.ArrayList;
import java.util.Iterator;

public class Vehicle {
	/** Salt de línia de la plataforma. */
	private static final String LS = System.getProperty("line.separator");
	private final String plateNumber;

	/**
	 * 
	 * @element-type Rental
	 */
	private final ArrayList<Rental> IsForA;

	public Vehicle(String plateNumber) {
		this.plateNumber = plateNumber;
		IsForA = new ArrayList<Rental>();
	}

	public void addRental(Rental re) {
		IsForA.add(re);
	}

	public String getClients1() {
		StringBuilder list = new StringBuilder();
		ArrayList<String> ret = new ArrayList<String>();
		for (Iterator<Rental> iter = IsForA.iterator(); iter.hasNext();) {
			Rental s = iter.next();
			Client c = s.getClient();
			String d = c.getDNI();
			list.append(s.getClient().getDNI());
			list.append(LS);
		}
		return list.toString();
	}

	public String getClients() {
		StringBuilder list = new StringBuilder();
		for (Iterator<Rental> iter = IsForA.iterator(); iter.hasNext();) {
			Rental s = iter.next();
			Client c = s.getClient();
			String d = c.getDNI();
			list.append(d).append("\n");
		}
		return list.toString();
	}

}