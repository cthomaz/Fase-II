/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Carlos Thomaz
 */
public class Produto {
    
    private String nome;
    public static final String PROP_NOME = "nome";

    public Produto() {
    }

    
    public Produto(String nome, long codigo, double valor, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.descricao = descricao;
    }
     
    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
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
    
            private long codigo;
    public static final String PROP_CODIGO = "codigo";

    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(long codigo) {
        long oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

        private double valor;
    public static final String PROP_VALOR = "valor";

    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(double valor) {
        double oldValor = this.valor;
        this.valor = valor;
        propertyChangeSupport.firePropertyChange(PROP_VALOR, oldValor, valor);
    }


        private String descricao;
    public static final String PROP_DESCRICAO = "descricao";

    /**
     * Get the value of descricao
     *
     * @return the value of descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Set the value of descricao
     *
     * @param descricao new value of descricao
     */
    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
    }

}
