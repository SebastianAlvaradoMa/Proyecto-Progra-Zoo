
package proyecto.zoo;
/**
 *
 * @author jeffm
 */
import javax.swing.JOptionPane;
public class Usuario {
    private String Nombre;
    private String apellidos;
    private String Nickname;
    private String password;
    private int estado;//(activo o inactivo)
    
    public Usuario(){
        this.Nombre=" ";
        this.apellidos=" ";
        this.Nickname=" ";
        this.password=" ";
        this.estado=0;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
        public void Desactivar() {
        this.estado = 1;
    }
}


    
  

