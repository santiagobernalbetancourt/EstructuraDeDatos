/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import estructuradedatos.Array.Vector;
import estructurasdedatos.estructuraobjeto.Persona;
import estructurasdedatos.estructuraobjeto.Vehiculo;
/**
 *
 * @author utp
 */
public class EstructuradeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vector primero = new Vector();
 
        Persona juan = new Persona();
        juan.setCedula((int)14569330);
        juan.setDireccion("Cartago");
        juan.setEstatura((float) 180.3);
        juan.setSoltero(true);
        
        Vehiculo chevrolet = new Vehiculo();
        chevrolet.setColor("Rojo");
        chevrolet.setModelo("2014");
        chevrolet.setNumeroSoat("29620345");
        chevrolet.setPlaca("vcy-163");
        
        System.out.println(juan.getCedula());
        System.out.println(juan.getDireccion());
        System.out.println(juan.Estatura());
        System.out.println(juan.isSoltero());
        
        System.out.println(chevrolet.getColor());
        System.out.println(chevrolet.getModelo());
        System.out.println(chevrolet.getNumeroSoat());
        System.out.println(chevrolet.getPlaca());
        
         System.out.println(primero.crearVector(3));
    }
    
}
