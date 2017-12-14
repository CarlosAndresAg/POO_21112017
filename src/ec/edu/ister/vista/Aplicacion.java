package ec.edu.ister.vista;

import ec.edu.ister.modelo.Persona;
import ec.edu.ister.vista.formularios.FrmPersona;
import java.util.Date;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */

public class Aplicacion {
    public static void main(String[] args) {
        FrmPersona frm1= new FrmPersona();
        frm1.setVisible(true);
        Persona p= new Persona(); 
        Date ahora= new Date();
        JOptionPane.showMessageDialog(null,p.sumarFechasDias(ahora, 5));
    }
}
