/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package states_ex;

/**
 *
 * @author Sam
 */
public class Cerrada implements EstadoVentanilla{

    @Override
    public void atender(Persona persona) {
        System.out.println("Ventanilla cerrada!");
    }
    
}
