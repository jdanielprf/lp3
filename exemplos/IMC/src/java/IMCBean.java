
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.Facelet;

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
public class IMCBean {
    private float peso;
    private float estatura;
    private float calculo;
    private String info;
    private List<InformacoesIMC> listaPeso;
    public IMCBean(){
        listaPeso=new ArrayList<InformacoesIMC>();
        listaPeso.add(new InformacoesIMC("Magro","imc<18"));
        listaPeso.add(new InformacoesIMC("Normal","18<imc<24"));
        listaPeso.add(new InformacoesIMC("Gordo","imc>24"));
    }
    //gear get e set
    public void calcular(){
        calculo=(float)(peso/Math.pow(estatura, 2));
        if(calculo<18){
            setInfo("Magro");
        }else if(calculo>24){
            setInfo("Gordo");
        }else{
            setInfo("Normal");
        }
        FacesMessage msg=new FacesMessage("IMC="+calculo+" "+getInfo());
        
        FacesContext contexto=FacesContext.getCurrentInstance();
        contexto.addMessage(null, msg);
    }
    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the calculo
     */
    public float getCalculo() {
        return calculo;
    }

    /**
     * @param calculo the calculo to set
     */
    public void setCalculo(float calculo) {
        this.calculo = calculo;
    }

    /**
     * @return the listaPeso
     */
    public List<InformacoesIMC> getListaPeso() {
        return listaPeso;
    }

    /**
     * @param listaPeso the listaPeso to set
     */
    public void setListaPeso(List<InformacoesIMC> listaPeso) {
        this.listaPeso = listaPeso;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }
   
    
}
