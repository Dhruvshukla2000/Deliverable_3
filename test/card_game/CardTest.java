/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package card_game;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dhruv
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getValue method, of class Card.
     */
    
    @Test
    public void testGetValuegood() {
        System.out.println("getValuegood");
        Card instance = null;
        int expResult = 5;
        int result = instance.getValue();
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testGetValuebad() {
        System.out.println("getValuebad");
        Card instance = null;
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testGetValueboundry() {
        System.out.println("getValueboundry");
        Card instance = null;
        int expResult = 13;
        int result = instance.getValue();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of isGreaterThan method, of class Card.
     */
    @Test
    public void testIsGreaterThanGood() {
        System.out.println("isGreaterThangood");
        Card card = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isGreaterThan(card);
        assertEquals(expResult, result);
        
    }
    
    @Test
        public void testIsGreaterThanBad() {
        System.out.println("isGreaterThanbad");
        Card card = null;
        Card instance = null;
        boolean expResult = true;
        boolean result = instance.isGreaterThan(card);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testIsGreaterThanBoundry() {
        System.out.println("isGreaterThanboundry");
        Card card = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.isGreaterThan(card);
        assertEquals(expResult, result);
        
    }
    
    
}
