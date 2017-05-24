/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.DormofHorror.control.Equations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Office Payne
 */
public class EquationControlTest {
    
    public EquationControlTest() {
    }

    /**
     * Test of calcUrnVolume method, of class EquationControl.
     */
    @Test
    public void testCalcUrnVolume() {
        System.out.println("calcUrnVolume");
        double radius = 4.0;
        double height = 12.0;
        EquationControl instance = new EquationControl();
        double expResult = 603.1857;
        double result = instance.calcUrnVolume(radius, height);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
