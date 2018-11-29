/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamento;

/**
 *
 * @author daniel
 */
public class Gerente extends Funcionario{
    public float bonus(){
        float b=salario*0.3f;
        return b;
    }
}
