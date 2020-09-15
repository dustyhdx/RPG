
/**
 * Beschreiben Sie hier die Klasse Krieger.
 * 
 * @author Noah Z
 * @version 09 2020
 */
public class Krieger extends Held
{
    private int ausdauer;    
    public Krieger(String name, int staerke, int tp, Waffe waffe, int ausdauer){
        super(name, staerke,tp, waffe);
        this.ausdauer = ausdauer;
    }
    
    @Override
    public void heldInfos(){
        System.out.println("Name: " + name + "\nKlasse: Krieger\nAusdauer: " + ausdauer);
        super.heldInfos();
    }
    
    @Override
    public void angriffsbonusBerechnen(){
        angriffsbonus = ausdauer * staerke + waffe.getAngriffsbonus();
    }
}
