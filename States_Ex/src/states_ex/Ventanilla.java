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
public class Ventanilla {
    private String cajero;
    private EstadoVentanilla estado;
    
    public Ventanilla(){
        estado = new Abierta();
    }
    
    public void suspender(){
        estado = new Suspendida();
    }
    
    public void cerrar(){
        estado = new Cerrada();
    }
    
    public void abrir(){
        estado = new Abierta();
    }
    
    public void atender (Persona persona){
        estado.atender(persona);
    }
    
}
