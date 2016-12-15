import static org.junit.Assert.*;

/**
 * Created by Josuemgr3 on 17/11/16.
 */
public class CuentaTest {


    @org.junit.Test
    public void mostrar() throws Exception {
        Cuenta c = new Cuenta ("Juan","A123");
        assertNotNull(c.mostrar());

    }

    @org.junit.Test
    public void pagar() throws Exception {
        System.out.println("pagar");
    }

    @org.junit.Test
    public void calcular() throws Exception {
        Cuenta c = new Cuenta ("Juan","A123");
        assertEquals(57,c.calcular(100),1);

    }

}