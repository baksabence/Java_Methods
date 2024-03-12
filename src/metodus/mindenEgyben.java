/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodus;


public class mindenEgyben {
    
    public static void main(String[] args) {
        String[] betuk = {"a", "b", "c", "d", "e", "f", "g"};
        String egeszSor = osszefuz(betuk);
        kiiras(egeszSor);
        
        
        final int sor_max = 3;
        final int oszlop_max = 4;
        String[][] kockas = new String[sor_max][oszlop_max];
        
        for (int sor = 0; sor < kockas.length; sor++) {
            kockas[sor] = new String[3]; //lepcsos 
            kockas[0][0] = "a";
            kockas[0][1] = "b";
            kockas[0][2] = "c";
            kockas[1][0] = "d";
            kockas[1][1] = "e";
            kockas[1][2] = "f";
            kockas[2][0] = "g";
            kockas[2][1] = "h";
            kockas[2][2] = "i";

        }
        
        //megjelenites
        int sorDb = kockas.length;
        for (int sor = 0; sor < kockas.length; sor++) {
            int oszlopDb = kockas[sor].length;
            for (int oszl = 0; oszl < oszlopDb; oszl++) {
                System.out.print(kockas[sor][oszl] + "");
                
            }
            System.out.println("");
        }
        System.out.println("");

    }



    private static String osszefuz(String[] betuk) {
        String osszBetuk = "";
        for (int i = 0; i < betuk.length; i++) {
            osszBetuk += betuk[i];
            
        }
        return osszBetuk;
        
    }
    
        private static void kiiras(String kiir) {
            System.out.println(kiir);
    }

}
