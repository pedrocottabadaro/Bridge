import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SofaTest {

    @Test
    public void deveImplementarCouro() {
        Tecido tecido=new Couro();
        Sofa sofa=new Sofa(25,10);
        sofa.setTecido(tecido);
        assertEquals("Sofa feito com Couro",sofa.ConstruirTecido());
    }

    @Test
    public void deveImplementarSeda() {
        Tecido tecido=new Seda();
        Sofa sofa=new Sofa(15,20);
        sofa.setTecido(tecido);
        assertEquals("Sofa feito com Seda",sofa.ConstruirTecido());

    }
}