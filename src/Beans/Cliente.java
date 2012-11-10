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
public class Cliente {       

    public Cliente() {
    }

    
    public Cliente(String nome, String cpfCnpj) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }
    
        private String nome;
    public static final String PROP_NOME_cli = "nome";

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
        propertyChangeSupport.firePropertyChange(PROP_NOME_cli, oldNome, nome);
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
        private String cpfCnpj;
    public static final String PROP_CPFCNPJ = "cpfCnpj";

    /**
     * Get the value of cpfCnpj
     *
     * @return the value of cpfCnpj
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Set the value of cpfCnpj
     *
     * @param cpfCnpj new value of cpfCnpj
     */
    public void setCpfCnpj(String cpfCnpj) {
        String oldCpfCnpj = this.cpfCnpj;
        this.cpfCnpj = cpfCnpj;
        propertyChangeSupport.firePropertyChange(PROP_CPFCNPJ, oldCpfCnpj, cpfCnpj);
    }
    
}
