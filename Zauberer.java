
/**
 * Beschreiben Sie hier die Klasse Zauberer.
 * 
 * @author Noah Z
 * @version 09 2020
 */
public class Zauberer extends Held
{
    private int zauberkraft;
    public Zauberer(String name, int staerke, int tp, Waffe waffe, int zauberkraft){
        super(name, staerke, tp, waffe);
        this.zauberkraft = zauberkraft;
    }

    @Override
    public void heldInfos(){
        System.out.println("Name: " + name + "\nKlasse: Zauberer\nZauberkraft: " + zauberkraft);
        super.heldInfos();
    }

    public void heilen(){
        if (!tot){
            trefferpunkte += zauberkraft/2;
        }else{
            System.out.println(name + " ist tot und kann nichts machen..");
        }
    }
}
