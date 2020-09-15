/**
 * Beschreiben Sie hier die Klasse Kampfregel.
 * 
 * @author Noah Z
 * @version 09 2020
 */
public class Kampfregel
{
    private Wuerfel wuerfel;
    public Kampfregel(){
        wuerfel = new Wuerfel();
    }
    
    public void kampf(Held h, Monster m){
        int heldBonus = h.getAngriffsbonus() + wuerfel.wuerfeln(10);
        int monsterBonus = m.getAngriffsbonus() + wuerfel.wuerfeln(10);
        int schaden = wuerfel.wuerfeln(8);
        if (heldBonus > monsterBonus){
            if (heldBonus - monsterBonus >= 10){
                m.erleideSchaden(schaden * 2);
                System.out.println(h.getName() + " trifft das Monster kritisch! " + schaden + " Schaden!");
            }else{
                m.erleideSchaden(schaden);
                System.out.println(h.getName() + " trifft das Monster. " + schaden + " Schaden!");
            }
        }else if (heldBonus < monsterBonus){
            if(monsterBonus - heldBonus >= 10){
                h.erleideSchaden(schaden * 2);
                System.out.println("Das Monster trifft " + h.getName() + " kritisch! " + schaden + " Schaden!");
            }else{
                h.erleideSchaden(schaden);
                System.out.println("Das Monster trifft " + h.getName() + ". " + schaden + " Schaden!");
            }
        }else{
            System.out.println("Niemand wird getroffen!");
        }
    }
}
