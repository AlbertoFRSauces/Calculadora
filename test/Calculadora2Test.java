/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author alber
 */
@RunWith(value=Parameterized.class)
public class Calculadora2Test {
    
    @Parameters
    public static Iterable<Object[]> datosSuma(){
        return Arrays.asList(new Object[][]
            {{2,3,5},
            {-3,-5,-8},
            {4,-8,-4}}
        );
        
    }
    
    /*@Parameters
    public static Iterable<Object[]> datosSuma(){
    List<Object[]> misCasos=new ArrayList<>();
    misCasos.add(new Object[] {3, 4, 7});
    misCasos.add(new Object[] {-5, -3, -8});
    misCasos.add(new Object[] {0, -3, -3});
    return misCasos;
    }*/
    
    int asuma, bsuma, esperadosuma;
    int aresta, bresta, esperadoresta;

    public Calculadora2Test(int asuma, int bsuma, int esperadosuma, int aresta, int bresta, int esperadoresta) {
        this.asuma = asuma;
        this.bsuma = bsuma;
        this.esperadosuma = esperadosuma;
        this.aresta = aresta;
        this.bresta = bresta;
        this.esperadoresta = esperadoresta;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora calc=new Calculadora();
        int resu=calc.suma(asuma,bsuma);
        int espe=esperadosuma;
        assertEquals(espe,resu);
    }
    
    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora calc=new Calculadora();
        int resu=calc.resta(aresta,bresta);
        int espe=esperadoresta;
        assertEquals(espe,resu);
    }
    
}
