
/**
 * Beschreiben Sie hier die Klasse Waffe.
 * 
 * @author Noah Z
 * @version 09 2020
 */
public class Waffe
{    
    private int bonus;
    private String material;
    private int magie;    
    /**
     * Beispiele fuer Materialen:
     *  Holz, Eisen, Stahl, Adamant
     */
    public Waffe(String material, int magie){
        this.material = material;
        this.magie = magie;
    }

    private void angriffsbonusBerechnen(){
        if (material.equals("Adamant")){
            bonus = magie + 5;
        }else if (material.equals("Holz")){
            bonus = magie - 1;
        }else if (material.equals("Eisen")){
            bonus = magie + 2;
        }else if (material.equals("Stahl")){
            bonus = magie + 3;
        }else {
            bonus = magie;
        }
    }
    
    public int getAngriffsbonus(){
        angriffsbonusBerechnen();
        return bonus;
    }
    
    public String getMaterial(){
        return material;
    }
}
