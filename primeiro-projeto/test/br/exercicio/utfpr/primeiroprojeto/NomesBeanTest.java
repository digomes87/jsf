/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.exercicio.utfpr.primeiroprojeto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dgomes
 */
public class NomesBeanTest {
    
    public NomesBeanTest() {
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
     * Test of dizerOla method, of class NomesBean.
     */
    @Test
    public void testDizerOla() {
        System.out.println("dizerOla");
        NomesBean instance = new NomesBean();
        instance.dizerOla();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class NomesBean.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        NomesBean instance = new NomesBean();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class NomesBean.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        NomesBean instance = new NomesBean();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSobreNome method, of class NomesBean.
     */
    @Test
    public void testGetSobreNome() {
        System.out.println("getSobreNome");
        NomesBean instance = new NomesBean();
        String expResult = "";
        String result = instance.getSobreNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSobreNome method, of class NomesBean.
     */
    @Test
    public void testSetSobreNome() {
        System.out.println("setSobreNome");
        String sobrenome = "";
        NomesBean instance = new NomesBean();
        instance.setSobreNome(sobrenome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensagem method, of class NomesBean.
     */
    @Test
    public void testGetMensagem() {
        System.out.println("getMensagem");
        NomesBean instance = new NomesBean();
        String expResult = "";
        String result = instance.getMensagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensagem method, of class NomesBean.
     */
    @Test
    public void testSetMensagem() {
        System.out.println("setMensagem");
        String mensagem = "";
        NomesBean instance = new NomesBean();
        instance.setMensagem(mensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
