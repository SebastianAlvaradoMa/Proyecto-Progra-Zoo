
package proyecto.zoo;
/**
 *
 * @author jeffm
 */
import javax.swing.JOptionPane;
public class Usuario {
    public String nombre;
    public String apellido1;
    public String apellido2;
    public String Nickname;
    public String password;
    public String estado;
    public String visitante1;
    public String visitante2;
    public String visitante3;
    public String visitante4;
    public String visitante5;
    
    public void leerDatosU(){
        nombre=JOptionPane.showInputDialog(null,"Digite su nombre:");
        apellido1=JOptionPane.showInputDialog(null,"Digite su 1er apellido");
        apellido2=JOptionPane.showInputDialog(null,"Digite su 2do apellido");
        Nickname=JOptionPane.showInputDialog(null,"Digite su Nickname por favor:");
        password=JOptionPane.showInputDialog(null,"Digite su contraseña:");
         estado=JOptionPane.showInputDialog(null,"Escriba activo o inactivo según corresponda");
        }
    public void mostrarDatosU(){
        JOptionPane.showMessageDialog(null,"Hola!, "+ nombre + apellido1 + apellido2 + "\n"+"su nickname es " + Nickname + "\n"+"contraseña: "+ password +"\n"+" y su estado es: " +estado+ "." );
    }
        public void leerDatosV(){
            visitante1=JOptionPane.showInputDialog(null,"Digite su nombre completo:");
            visitante2=JOptionPane.showInputDialog(null,"Digite su nombre completo:");
            visitante3=JOptionPane.showInputDialog(null,"Digite su nombre completo:");
            visitante4=JOptionPane.showInputDialog(null,"Digite su nombre completo:");
            visitante5=JOptionPane.showInputDialog(null,"Digite su nombre completo:");
        }
        public void mostrarDatosV(){
            JOptionPane.showMessageDialog(null,"Bienvenidos visitantes!\n" + visitante1+"\n"+ visitante2+ "\n"+ visitante2+ "\n"+ visitante3+ "\n"+ visitante4+ "\n"+visitante5+"\n"+" al zoológico Happy Animals!!.");
        }

    }


    
  

