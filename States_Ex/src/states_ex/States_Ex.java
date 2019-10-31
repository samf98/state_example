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
public class States_Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Didier","Murillo",21);
        Persona persona2 = new Persona("Miguel","Pérez",71);
        Persona persona3 = new Persona("Carla","Juárez",82);
        Persona persona4 = new Persona("Andrea","Rivera",50);
        
        Banco banco = new Banco();
        banco.atender(persona1);
        
        banco.suspendeVentanilla();
        
        banco.atender(persona2);
        banco.atender(persona3);
        
        banco.cerrarVentanilla();
        banco.atender(persona4);
        
    }
    
}
