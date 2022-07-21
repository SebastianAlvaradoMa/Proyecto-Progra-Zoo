
package proyecto.zoo;

/**
 *
 * @author jeffm
 */
public class Empleado {
    
    import javax.swing.JOptionPane;



String usuario; 
        String apellido;
        String n_cuenta;
        String direccion;
        String login;
        String password;
        
        usuario = JOptionPane.showInputDialog("Digite nombre: ");
        apellido = JOptionPane.showInputDialog("Digite apellido: ");
        n_cuenta = JOptionPane.showInputDialog("Digite n_cuenta: ");
        direccion = JOptionPane.showInputDialog("Digite direccion: ");
        login = JOptionPane.showInputDialog("login: ");        
        password = JOptionPane.showInputDialog("password: ");
        
        JOptionPane.showMessageDialog(null,"El nombre es: "+ usuario);
        JOptionPane.showMessageDialog(null,"El apellido es: "+ apellido);
        JOptionPane.showMessageDialog(null,"El numero de cuenta es: "+ n_cuenta);
        JOptionPane.showMessageDialog(null,"Su direccion es: "+ direccion);
        JOptionPane.showMessageDialog(null,"Su correo es: "+ login);
        JOptionPane.showMessageDialog(null,"Su contraseña es: "+ password);
}