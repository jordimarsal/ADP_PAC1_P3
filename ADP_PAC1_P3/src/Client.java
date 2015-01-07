import java.util.ArrayList;

public class Client {
	/** Salt de línia de la plataforma. */
	private static final String LS = System.getProperty("line.separator");
	private final String dni;
	private final String phone;
	/**
	 * 
	 * @element-type Rental
	 */
	private final ArrayList<Rental> Make;

	public Client(String dn1, String phone) {
		this.dni = dn1;
		this.phone = phone;
		Make = new ArrayList<Rental>();
	}

	public String getDNI() {
		return dni;
	}

	public void addRental(Rental re) {
		Make.add(re);
	}

}