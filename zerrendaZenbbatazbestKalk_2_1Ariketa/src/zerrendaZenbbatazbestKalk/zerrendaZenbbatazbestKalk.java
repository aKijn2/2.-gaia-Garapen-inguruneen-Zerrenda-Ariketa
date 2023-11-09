package zerrendaZenbbatazbestKalk;

import java.util.Iterator;

public class zerrendaZenbbatazbestKalk {

	public static void main(String[] args) {

		double[] zenbakiak = {1, 2, 3, 4};
		double totala = 0;

		for (int i = 0; i < zenbakiak.length; i++) {
			totala += zenbakiak[i];
		}

		for (int i = 0; i < zenbakiak.length; i++) {

		}

		System.out.println("Batura guztia: " + totala);
		System.out.println("Zenbakiaren batazbestekoa da: " + totala/zenbakiak.length);

	}
}
