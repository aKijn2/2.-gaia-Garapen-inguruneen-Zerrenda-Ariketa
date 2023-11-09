package karaktereAzpisekuentzia_2_4Ariketa;

public class karaktereAzpisekuentzia_2_4Ariketa {

    public static void main(String[] args) {
        String luzeenaKatea = "abcdefghijklmno";
        String motzaKatea = "acegkmo";

        if (azpisekuentziaDa(motzaKatea, luzeenaKatea)) {
            System.out.println("\"" + motzaKatea + "\" luzeenaKatearen azpisekuentzia da \"" + luzeenaKatea + "\".");
        } else {
            System.out.println("\"" + motzaKatea + "\" ez da luzeenaKatearen azpisekuentzia.");
        }
    }

    public static boolean azpisekuentziaDa(String katea1, String katea2) {
        int katea1Indizea = 0;
        int katea2Indizea = 0;

        // Bi kateetan karaktereak bat-batean konparatu.
        while (katea1Indizea < katea1.length() && katea2Indizea < katea2.length()) {
            if (katea1.charAt(katea1Indizea) == katea2.charAt(katea2Indizea)) {
                katea1Indizea++; // Azpisekuentzian bat datuak bakarrik batera eraman arte, goitik behera egiten dugu.
            }
            katea2Indizea++; // LuzeenaKatea beti aurrera egingo da.
        }

        // Azpisekuentzia bada katea1 azken indizean, hau da, azken karakterea konparatu da.
        return katea1Indizea == katea1.length();
    }
}
