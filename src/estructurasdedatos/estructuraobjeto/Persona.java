/*
fecha: 22-02-2017
Descripcion:Clase Persona, primera estructura de datos,
            una clase es una aplatilla donde puedo instanciar un objeto detipo de persona.
            Una Istancia (objeto) es una variable o un lugar en la memoria del computador 
             y almacena los atributos y 
 */
package estructurasdedatos.estructuraobjeto;

/**
 *
 * @author utp
 */
public class Persona {
    
    private String nombre;
    private int cedula;
    private String direccion;
    private String telefono;
    private float estatura;
    private String rh;
    private boolean soltero;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the estatura
     */
    public float getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the rh
     */
    public String getRh() {
        return rh;
    }

    /**
     * @param rh the rh to set
     */
    public void setRh(String rh) {
        this.rh = rh;
    }

    /**
     * @return the soltero
     */
    public boolean isSoltero() {
        return soltero;
    }

    /**
     * @param soltero the soltero to set
     */
    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public void setCedula(int i) {
        this.cedula=i;
    }

    public float Estatura() {
       return estatura;
    }
    
}
