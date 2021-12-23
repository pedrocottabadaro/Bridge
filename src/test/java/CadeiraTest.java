import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadeiraTest {

    @Test
    public void deveImplementarCouro() {
        Tecido tecido=new Couro();
        Cadeira cadeira=new Cadeira(25,10);
        cadeira.setTecido(tecido);
        assertEquals("Couro colocado na Cadeira",cadeira.fabricarTecido());
    }

    @Test
    public void deveImplementarSeda() {
        Tecido tecido=new Seda();
        Cadeira cadeira=new Cadeira(15,20);
        cadeira.setTecido(tecido);
        assertEquals("Seda colocado na Cadeira",cadeira.fabricarTecido());

    }
}