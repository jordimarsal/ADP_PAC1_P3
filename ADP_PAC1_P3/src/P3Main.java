public class P3Main {

	public static void main(String[] args) {

		Client c1 = new Client("38-111", "555");
		Client c2 = new Client("38-222", "555");
		Client c3 = new Client("38-333", "555");
		Client c4 = new Client("38-444", "555");
		Client c5 = new Client("38-555", "555");
		Client c6 = new Client("38-666", "555");

		Vehicle v1 = new Vehicle("MA1");
		Vehicle v2 = new Vehicle("MA2");

		Rental rent1 = new Rental("A1", "25092014", 3, c1, v1);
		c1.addRental(rent1);
		v1.addRental(rent1);
		Rental rent2 = new Rental("A2", "25092014", 3, c2, v2);
		c2.addRental(rent2);
		v2.addRental(rent2);
		Rental rent3 = new Rental("A3", "25092014", 3, c3, v1);
		c3.addRental(rent3);
		v1.addRental(rent3);
		Rental rent4 = new Rental("A4", "25092014", 3, c4, v2);
		c4.addRental(rent4);
		v2.addRental(rent4);
		Rental rent5 = new Rental("A5", "25092014", 3, c5, v1);
		c5.addRental(rent5);
		v1.addRental(rent5);
		Rental rent6 = new Rental("A6", "25092014", 3, c6, v2);
		c6.addRental(rent6);
		v2.addRental(rent6);

		System.out.println("############## Enunciat:");
		System.out.println(v1.getClients());
		System.out.println("------------");
		System.out.println(v2.getClients());

	}

}
