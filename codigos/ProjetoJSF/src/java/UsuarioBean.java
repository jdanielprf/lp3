
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */


@ManagedBean
public class UsuarioBean {
   @NotNull()
   private String nome="Daniel";
   @NotNull(message = "Você deve escrever sua idade")
   @DecimalMin(value="18",message = "você é de menor! vai estudar!")
   @DecimalMax(value="100", message = "já ta velho!")
   private int idade;
   
   private ArrayList<Pessoa> lista;
   public UsuarioBean(){
       lista = new ArrayList<Pessoa>();
       lista.add(new Pessoa("Daniel","12"));
       lista.add(new Pessoa("Jose","21"));
       lista.add(new Pessoa("Jacob","11"));
       lista.add(new Pessoa("Filho","200"));
   }
   
    public void salvar(){
        nome=nome.toUpperCase();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * 
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the lista
     */
    public ArrayList<Pessoa> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }
   
}
