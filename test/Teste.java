/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Beans.Cliente;
import Beans.Produto;
import controlador.TPDV;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos Thomaz
 */
public class Teste {
    
    public Teste() {
    }        
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testaAddProduto(){
        Produto prodEsperado = new Produto("Sabão em pó ACE", 1, 5.90, "Lavar roupa");
        
        Produto novoProduto = TPDV.addProduto("Sabão em pó ACE", 1, 5.90, "Lavar roupa");        
                
        assertEquals(prodEsperado.getCodigo(), novoProduto.getCodigo());
        
    }
    
    @Test
    public void testaAddCliente(){
        Cliente cliEsperado = new Cliente("Paulo Chavier","112.123.123-40");
        
        Cliente novoCliente = TPDV.addCliente("Paulo Chavier","112.123.123-40");        
                
        assertEquals(TPDV.getClientes().size(),1);
        
    }
    
    @Test
    public void testaRemoveCliente(){    
        TPDV.addCliente("Paulo Chavier","112.123.123-40");
        TPDV.removerCliente(0);
        assertEquals(TPDV.getClientes().size(), 0);
        
    }
    
    @Test
    public void testaAddProdutoCarrinho(){
        TPDV.addProdutoCarrinho("1", "123.123.123-40");
                
        assertTrue(TPDV.getTotal()>0);
    }
    
    @Test
    public void testaGetTotalSemProduto(){   
        assertTrue(TPDV.getTotal() == 0);
    }
    
    @Test 
    public void TestarFinalizarCompra(){
        TPDV.finalizarCompra("123.123.123-40", "Débito");
        assertTrue(TPDV.getVendas().size()>0);
    }
    
    @Test 
    public void TestarFinalizarCompra_1(){
        TPDV.finalizarCompra("", "Débito");
        assertTrue(TPDV.getVendas().size()>0);
    }
}
