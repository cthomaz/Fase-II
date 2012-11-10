/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Beans.Cliente;
import Beans.Produto;
import Beans.Venda;
import java.util.*;

/**
 *
 * @author Carlos Thomaz
 */
public class TPDV {
        
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Venda> vendas = new ArrayList<>();
    private static List<Produto> carrinho = new ArrayList<>();
    
    public static Cliente addCliente(String cpfCnpj, String nome){
        Cliente novoCliente = new Cliente(nome, cpfCnpj);
        clientes.add(novoCliente);
        return novoCliente;
    }
    
    public static void removerCliente(int index){
        clientes.remove(index);
    }
    
    public static Produto addProduto(String nome, long id, double valor, String descricao){
        Produto novoProduto = new Produto(nome, id, valor, descricao);
        produtos.add(novoProduto);
        return novoProduto;
    }
    
    public static void removeProduto (int index){
        produtos.remove(index);
    }
    
    public static Produto addProdutoCarrinho(String codigo, String cpfCnpj){                
        Produto produto = new Produto();
        long cod = 0;
        boolean temDesconto = false;
        double desconto = 0;
        
        try {
            cod = Long.parseLong(codigo);   
        } catch (Exception e) {
        }
            
        for(Cliente cli : clientes){
            if(cpfCnpj.equals(cli.getCpfCnpj()))
                temDesconto=true;
        }
            
        for (Produto prod : produtos){
            if(cod == prod.getCodigo()){
                produto = new Produto(prod.getNome(), prod.getCodigo(), prod.getValor(), prod.getDescricao());
                desconto = (prod.getValor()*10)/100;
                
                if(temDesconto) {
                    produto.setValor(prod.getValor() - desconto);
                }
                else {
                    produto.setValor(prod.getValor());
                }
                carrinho.add(produto);                
            }
        }        
        return produto;
    }
    
    public static double getTotal(){        
        double valorTotal = 0;
        
        for(Produto prod : carrinho){
            valorTotal += prod.getValor();
        }
        
        return valorTotal;
    }
    
    public static void removeDoCarrinho(int index){
        carrinho.remove(index);
    }
    
    public static void finalizarCompra(String cliente, String pagamento){        
        Venda novaVenda = new Venda();                
        novaVenda.setId(TPDV.getVendas().size()+1);        
                
        for(Produto produto: carrinho){
            novaVenda.getCarrinho().add(produto);
        }
        
        novaVenda.setData(new Date());
        novaVenda.setFormaPagamento(pagamento);        
        
        for(Cliente cli : TPDV.getClientes()){
            if(cliente.equals(cli.getCpfCnpj()))
                novaVenda.setCliente(cli);
        }                
        TPDV.getVendas().add(novaVenda);
        carrinho.clear();
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static void setProdutos(List<Produto> produtos) {
        TPDV.produtos = produtos;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void setClientes(List<Cliente> clientes) {
        TPDV.clientes = clientes;
    }

    public static List<Venda> getVendas() {
        return vendas;
    }

    public static void setVendas(List<Venda> vendas) {
        TPDV.vendas = vendas;
    }

    
}
