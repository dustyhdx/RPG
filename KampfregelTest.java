

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse KampfregelTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class KampfregelTest
{
    private Waffe waffe1;
    private Waffe holzWaffe;
    private Waffe stahlWaffe;
    private Zauberer zauberer;
    private Krieger krieger;
    private Monster monster1;
    private Monster monster2;
    private Monster monsterBoss;
    private Kampfregel kampfregel;

    
    
    
    
    
    
    
    
    

    /**
     * Konstruktor fuer die Test-Klasse KampfregelTest
     */
    public KampfregelTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        waffe1 = new Waffe("Holz", 0);
        holzWaffe = new Waffe("holz", 0);
        stahlWaffe = new Waffe("Stahl", 5);
        zauberer = new Zauberer("Merlin", 5, 50, holzWaffe, 20);
        krieger = new Krieger("Ahmet", 15, 50, stahlWaffe, 5);
        monster1 = new Monster(20, 50);
        monster2 = new Monster(30, 75);
        monsterBoss = new Monster(50, 150);
        kampfregel = new Kampfregel();
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
