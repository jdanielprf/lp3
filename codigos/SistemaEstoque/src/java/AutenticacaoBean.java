
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

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
public class AutenticacaoBean {
    private String email;
    private String senha;
    
    public String teste(){
        if(email.equals("daniel")){
            return "daniel";
        }else{
            return null;
        }
    }
    
    public void login(){
        FacesMessage msn=null;
        DAOUsuario dao =new DAOUsuario();
        
        try{
            if(dao.autenticar(email, senha)){
                msn=new FacesMessage("Você está logado!","");
            }else{
                msn=new FacesMessage("You burro man!",
                        "Usuario ou senha invalidos");
            }
        }catch(Exception e){
            msn=new FacesMessage("Erro banco!",
                        "");
            e.printStackTrace();
        }
        FacesContext.getCurrentInstance().addMessage(null, msn);
    
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}




