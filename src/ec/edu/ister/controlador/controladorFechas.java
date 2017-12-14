/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.controlador;

import java.text.DateFormat;
import java.util.Date;

/**
 *@Instituto Rumiñahui 
    @Carlos Aguinaga
 * @author Carlos Andres
 */
public class controladorFechas {
public static synchronized int diferenciafechas(Date fechain,Date fechafin ){
    DateFormat df= DateFormat.getDateInstance(DateFormat.MEDIUM);
    String fechainstring= df.format(fechain);
    long msinicial= fechain.getTime();
    long msfinal= fechafin.getTime();
    long diferencia= msfinal-msinicial;
    double dias=Math.floor(diferencia/(1000*60*60*24));
    try {
    fechain =df.parse(fechainstring);
    } catch (Exception e) {
    }
    try {
    fechafin =df.parse(fechainstring);
    } catch (Exception e) {
    }
    return (int) dias; 
}
}
    
