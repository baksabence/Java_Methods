

package metodus;


public class Metodus {


    public static void main(String[] args) {
        nehanySzamGyokenekMegjelenitese();
        
    }

    private static void nehanySzamGyokenekMegjelenitese() {
        haromSzamGyoke();
        
        otSzamGyoke();
    }
    
    
    private static void haromSzamGyoke() {
        int osszeg = osszegzes(2, osszegzes(3,4));
        double gyok = gyokVonas(osszeg);
        String kimenet = "%d gyöke: %.4f".formatted(osszeg, gyok);
        kiiratas(kimenet);
    }

    private static void otSzamGyoke() {
        int[] szamok = {3,5,12,3,2};
        int osszeg = osszegzes(szamok);
        double gyok = gyokVonas(osszeg);
        String kimenet = "%d gyöke: %.4f".formatted(osszeg, gyok);
        kiiratas(kimenet);
    }

    
    private static int osszegzes(int a, int b) {
        return a+b;
    }
 

    private static double gyokVonas(double osszeg) {
        return Math.sqrt(osszeg);
    }

    private static void kiiratas(String uzenet) {
        System.out.println(uzenet);
    }

    private static int osszegzes(int[] tomb) {
        int ossz = 0;
        for (int i = 0; i < tomb.length; i++) {
            ossz += tomb[i];
            
        }
        
        return ossz;
    }
    
    
    
}
