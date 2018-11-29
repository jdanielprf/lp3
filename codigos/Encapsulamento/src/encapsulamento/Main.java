/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Main { 
    public static void main(String args[]){
        Funcionario daniel=new Funcionario();
        daniel.setNome("Jose Daniel");
        daniel.setSalario(1000);
        System.out.println("bonus="+daniel.bonus());
        
        Gerente ricellyo= new Gerente();
        ricellyo.setNome("Ricellyo Cruz");
        ricellyo.setSalario(5000);
        System.out.printf("bonus=%.2f\n",ricellyo.bonus());
        
        Funcionario lista[]=new Funcionario[2];    
        lista[0]=daniel;
        lista[1]=ricellyo;
        float total=0;
        for (Funcionario funcionario : lista) {
            total=total+funcionario.bonus();
        }
        System.out.println("total="+total);
    }
}




