package zerrendaKaraktereSekuentziaTA;

import java.util.Scanner;

public class zerrendaKaraktereSekuentziaTA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Idatzi zerbait: ");
		String idatzi = sc.next();

		int taKopurua = 0;

		for (int i = 0; i < idatzi.length() - 1; i++) {
			if (idatzi.substring(i, i + 2).equals("TA")) {
				taKopurua++;
			} else if (idatzi.substring(i, i + 2).equals("ta")) {
				taKopurua++;
			}else if (idatzi.substring(i, i + 2).equals("Ta")) {
				taKopurua++;
			}else if (idatzi.substring(i, i + 2).equals("tA")) {
				taKopurua++;
			}


		}

		System.out.println("“TA” sekuentzia kopurua: " + taKopurua);
	}

}
