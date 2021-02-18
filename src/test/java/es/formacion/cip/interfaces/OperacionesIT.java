/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.formacion.cip.interfaces;

import junit.framework.TestCase;

/**
 *
 * @author Saulo
 */
public class OperacionesIT extends TestCase {

    public OperacionesIT(String testName) {
        super(testName);
    }

    /**
     * Test of suma method, of class Operaciones.
     */
    public void testSuma() {
        System.out.println("suma");
        Double valor1 = (double) 3;
        Double valor2 = (double) 2;
        Double expResult = (double) 5;
        Double result;
        result = Operaciones.suma(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test Suma Correcto");
    }

    /**
     * Test of dividir method, of class Operaciones.
     */
    public void testDividir() {
        System.out.println("dividir");
        Double valor1 = (double) 12;
        Double valor2 = (double) 6;
        Double expResult = (double) 2;
        Double result = Operaciones.dividir(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test Dividir Correcto");
    }

    /**
     * Test of restar method, of class Operaciones.
     */
    public void testRestar() {
        System.out.println("restar");
        Double valor1 = (double) 12;
        Double valor2 = (double) 6;
        Double expResult = (double) 6;
        Double result = Operaciones.restar(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test Restar Correcto");
    }

    /**
     * Test of multiplicar method, of class Operaciones.
     */
    public void testMultiplicar() {
        System.out.println("multiplicar");
        Double valor1 = (double) 12;
        Double valor2 = (double) 2;
        Double expResult = (double) 24;
        Double result = Operaciones.multiplicar(valor1, valor2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test Multiplicar Correcto");
    }

}
