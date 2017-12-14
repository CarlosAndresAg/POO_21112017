package ec.edu.ister.modelo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Persona implements Edad {
    
    private String nombre;
    private String apellido;
    private String edad;
    private String numero;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numero = numero;
    }

    
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
 public String calcularEdad()
 {
     return "";
 }
 public java.sql.Date sumarFechasDias(Date fech,int dias){
     Calendar cal= new GregorianCalendar();
     cal.setTimeInMillis(fech.getTime());
     cal.add(Calendar.DATE, dias);
     return new java.sql.Date(cal.getTimeInMillis()); 
 }

    @Override
    public String diferenciaEntreFechas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
