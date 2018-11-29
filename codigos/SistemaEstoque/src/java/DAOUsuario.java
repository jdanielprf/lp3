
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class DAOUsuario {
    public boolean autenticar(String username,String password) 
            throws ClassNotFoundException, SQLException{
        Connection conn=SingletonBD.getConexao();
        PreparedStatement query = conn.prepareStatement(
                "select * from pessoas where cpf=? and senha=?");
        query.setString(1, username);
        query.setString(2, password);
        ResultSet resultados=query.executeQuery();
        return resultados.first();
    } 
    
    void cadastrar(){
    }
    void atualizar(){
    }
    void buscar(){
    }
    void listar(){
    }
    void deletar(){
    }
}
