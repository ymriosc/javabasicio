/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import clase6.unit.Divisa;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class TestDivisa {
    
    @Test
    public void TestDivisa() throws Exception{
        System.out.println("sumar divisas");
        
        Divisa divisaUno = new Divisa(10, "Soles");
        Divisa divisaDos = new Divisa(20, "Soles");
        Divisa divisaEsperada = new Divisa(30, "Soles");
        
        Divisa divisaResultado = divisaDos.sumar(divisaUno);
        //verificando son iguales
        assertEquals(divisaEsperada.getImporte(),divisaResultado.getImporte());

    }

   
}
