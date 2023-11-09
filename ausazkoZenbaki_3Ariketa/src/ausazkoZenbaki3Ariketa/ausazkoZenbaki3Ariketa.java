package ausazkoZenbaki3Ariketa;

import java.util.Scanner;

public class ausazkoZenbaki3Ariketa {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        int[] zerrenda = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Sartu zenbaki bat: ");
        int zenbakia = sc.nextInt(); 
        
        if (bistaratu(zerrenda, zenbakia)) {
            System.out.println(zenbakia + " zerrendan dago.");
        } else {
            System.out.println(zenbakia + " zerrendan ez dago.");
        }
    }

    public static boolean bistaratu(int[] zerrenda, int zenbakia) {
        int hasiera = 0;
        int bukaera = zerrenda.length - 1;

        while (hasiera <= bukaera) {
            int erdia = (hasiera + bukaera) / 2;

            if (zerrenda[erdia] == zenbakia) {
                return true; // Zenbakia aurkitu da.
            } else if (zerrenda[erdia] < zenbakia) {
                hasiera = erdia + 1;
            } else {
                bukaera = erdia - 1;
            }
        }

        return false; // Zenbakia ez dago zerrendan.
    }
}
