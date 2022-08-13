
package proyecto.zoo;
import javax.swing.JOptionPane;
public class Empleado {
        private String nombreE; 
        private String apellidoE;
        private String ciudad;
        private String direccion;
        private int telefono;
        private String correoElec;
        private String estado;

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getApellidoE() {
        return apellidoE;
    }

    public void setApellidoE(String apellidoE) {
        this.apellidoE = apellidoE;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}