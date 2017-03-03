/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos.Array;

/**
 *
 * @author santiagobernalbetancourt
 */
public class Vector {
    int size = 20;
    String[] vector = new String[size];
    
    public boolean crearVector(int size)
    {
        this.vector = new String[size];
        return true;
    }
           

}
