import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse Wuerfel.
 * 
 * @author Noah Z
 * @version 09 2020
 */
public class Wuerfel
{
    private Random r;
    public Wuerfel(){
        r = new Random();
    }
    
    public int wuerfeln(int seitenanzahl){
        int ergebnis = r.nextInt(seitenanzahl);        
        return ++ergebnis;
    }
}
