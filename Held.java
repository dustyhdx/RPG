/**
 * Abstrakte Klasse Held - beschreiben Sie hier die Klasse
 * 
 * @author Noah Z
 * @version 09 2020
 */
public abstract class Held
{
    protected String name;
    protected int staerke;
    protected int angriffsbonus;
    protected int trefferpunkte;
    protected Waffe waffe;
    protected boolean tot;

    public Held(String name, int staerke, int tp, Waffe waffe){
        this.name = name;
        this.staerke = staerke;
        trefferpunkte = tp;
        this.waffe = waffe;
    }

    public void angreifen(Monster m, Kampfregel k){
        if (!tot){
            k.kampf(this, m);
        }else{
            System.out.println(name + " ist tot und kann nichts machen..");
        }
    }

    protected void angriffsbonusBerechnen(){
        angriffsbonus = staerke + waffe.getAngriffsbonus();
    }

    public void erleideSchaden(int schaden){
        trefferpunkte -= schaden;
        if (trefferpunkte == 0){
            tot = true;
            System.out.println(name + " stirbt!");
        }
    }

    public void heldInfos(){
        System.out.println("Staerke: " + staerke + "\nAngriffsbonus: " + getAngriffsbonus() + "\nWaffe: " + waffe.getMaterial());
    }

    public int getAngriffsbonus(){
        angriffsbonusBerechnen();
        return angriffsbonus;
    }

    public String getName(){
        return name;
    }
}
