/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Carlos Thomaz
 */
public class Venda {
    
        private long id;
    public static final String PROP_ID = "id";

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(long id) {
        long oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    private List<Produto> carrinho = new ArrayList<Produto>();
    public static final String PROP_CARRINHO = "carrinho";

    /**
     * Get the value of carrinho
     *
     * @return the value of carrinho
     */
    public List<Produto> getCarrinho() {
        return carrinho;
    }

    /**
     * Set the value of carrinho
     *
     * @param carrinho new value of carrinho
     */
    public void setCarrinho(List<Produto> carrinho) {
        List<Produto> oldCarrinho = this.carrinho;
        this.carrinho = carrinho;
        propertyChangeSupport.firePropertyChange(PROP_CARRINHO, oldCarrinho, carrinho);
    }
    private String formaPagamento;
    public static final String PROP_FORMAPAGAMENTO = "formaPagamento";

    /**
     * Get the value of formaPagamento
     *
     * @return the value of formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Set the value of formaPagamento
     *
     * @param formaPagamento new value of formaPagamento
     */
    public void setFormaPagamento(String formaPagamento) {
        String oldFormaPagamento = this.formaPagamento;
        this.formaPagamento = formaPagamento;
        propertyChangeSupport.firePropertyChange(PROP_FORMAPAGAMENTO, oldFormaPagamento, formaPagamento);
    }
    private Cliente cliente;
    public static final String PROP_CLIENTE = "cliente";

    /**
     * Get the value of cliente
     *
     * @return the value of cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Set the value of cliente
     *
     * @param cliente new value of cliente
     */
    public void setCliente(Cliente cliente) {
        Cliente oldCliente = this.cliente;
        this.cliente = cliente;
        propertyChangeSupport.firePropertyChange(PROP_CLIENTE, oldCliente, cliente);
    }
    
        private Date data;
    public static final String PROP_DATA = "data";

    /**
     * Get the value of data
     *
     * @return the value of data
     */
    public Date getData() {
        return data;
    }

    /**
     * Set the value of data
     *
     * @param data new value of data
     */
    public void setData(Date data) {
        Date oldData = this.data;
        this.data = data;
        propertyChangeSupport.firePropertyChange(PROP_DATA, oldData, data);
    }

}
