/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class InformacoesIMC {
      private String descricao;
    private String faixa;
    public InformacoesIMC(){
        
    }
    public InformacoesIMC(String descricao,String faixa){
        this.descricao=descricao;
        this.faixa=faixa;
    }
    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the faixa
     */
    public String getFaixa() {
        return faixa;
    }

    /**
     * @param faixa the faixa to set
     */
    public void setFaixa(String faixa) {
        this.faixa = faixa;
    }

}
