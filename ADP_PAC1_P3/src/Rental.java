
public class Rental {
	/** Salt de línia de la plataforma. */
	private static final String LS = System.getProperty("line.separator");

	private final String type;
	private final String initialDate;
	private final Integer duration;

	private final Client Make;
	private final Vehicle IsForA;

	public Rental(String type, String initialDate, Integer duration, Client cli, Vehicle ve) {
		this.type = type;
		this.initialDate = initialDate;
		this.duration = duration;
		this.Make = cli;
		this.IsForA = ve;
	}

	public Client getClient() {
		return Make;
	}

	public Vehicle getVehicle() {
		return IsForA;
	}

}