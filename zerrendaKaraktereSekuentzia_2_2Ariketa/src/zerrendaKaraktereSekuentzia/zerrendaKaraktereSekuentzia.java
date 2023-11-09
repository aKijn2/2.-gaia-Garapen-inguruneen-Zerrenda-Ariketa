package zerrendaKaraktereSekuentzia;

public class zerrendaKaraktereSekuentzia {

	public static void main(String[] args) {

		String karaktereak = "Kaixo zermoduz zaude?";
		String izena = karaktereak.replaceAll("\\s", "");

		System.out.println(izena);
	}
}