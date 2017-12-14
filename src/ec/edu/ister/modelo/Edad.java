/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Date;
import java.sql.*;

/**
 *
 * @author Carlos Andres
 */
public interface Edad {
    
    public String calcularEdad();
    public Date sumarFechasDias(Date fech,int dias);    
    public String diferenciaEntreFechas();
}
