
package proyecto.zoo;

/**
 *
 * @author brayan
 */
import javax.swing.JOptionPane;

public class Citas {
    
    public static void main(String[] args) {
        String usuario; 
        String apellido;
        String telefono;
        double cita;

        
        usuario = JOptionPane.showInputDialog("Digite nombre: ");
        apellido = JOptionPane.showInputDialog("Digite apellido: ");
        telefono = JOptionPane.showInputDialog("Digite telefono: ");
        cita = Double.parseDouble(JOptionPane.showInputDialog("Digite fecha Cita: "));
        
        JOptionPane.showMessageDialog(null,"El nombre es: "+ usuario);
        JOptionPane.showMessageDialog(null,"El apellido es: "+ apellido);
        JOptionPane.showMessageDialog(null,"El numero de telefono es: "+ telefono);
        JOptionPane.showMessageDialog(null,"El dia de su Cita"+cita);



     }


 }
