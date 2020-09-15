
/**
 * Beschreiben Sie hier die Klasse Monster.
 * 
 * @author Noah Z
 * @version 09 2020
 */
public class Monster
{    
    private int angriffsbonus;    
    private int trefferpunkte;
    private boolean tot;
    
    public Monster(int ab, int tp){
        angriffsbonus = ab;
        trefferpunkte = tp;
    }
    
    public int getAngriffsbonus(){
        return angriffsbonus;
    }
    
    public void erleideSchaden(int schaden){
        trefferpunkte -= schaden;
        if (trefferpunkte == 0){
            tot = true;
            System.out.println("Das Monster stirbt!");
        }
    }
}
