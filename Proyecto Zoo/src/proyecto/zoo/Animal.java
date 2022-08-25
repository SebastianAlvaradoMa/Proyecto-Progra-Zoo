
package proyecto.zoo;
import javax.swing.JOptionPane;
public class Animal {
   private String nombreAnimal;
   private String fechaNacimiento;
   private String especie;
   private String nombreEmpleado;
   private String estadoEmpleado;
   
   public Animal(){
    this.nombreAnimal=" ";
    this.fechaNacimiento=" ";
    this.especie=" ";
    this.nombreEmpleado=" ";
    this.estadoEmpleado=" ";
}

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(String estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }
 
}
