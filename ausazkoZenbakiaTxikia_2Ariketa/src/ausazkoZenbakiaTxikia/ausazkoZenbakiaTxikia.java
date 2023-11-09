package ausazkoZenbakiaTxikia;

import java.util.Random;

public class ausazkoZenbakiaTxikia {

    public static void main(String[] args) {

		Random rad = new Random();

		int[] zer = new int[10];
		int max = Integer.MAX_VALUE; 
		int maxPosizioa = 1;

		for (int i = 0; i < zer.length; i++) {
			zer[i] = rad.nextInt(1000);
		}

		System.out.print("Zerrenda: ");
		
		for (int i = 0; i < zer.length; i++) {
			System.out.print(zer[i] + ", ");
		}

		for (int i = 0; i < zer.length; i++) {
			if (zer[i] < max) {
				max = zer[i];
				maxPosizioa = i+1;
			}
		}
		System.out.println();
		System.out.println("Zenbaki minimoa: " + max);
		System.out.println(maxPosizioa + " posizioan dago.");
	}
}
