
package proyecto.zoo;
import javax.swing.JOptionPane;
public class Animal {
   public String nombreAnimal;
   public String fechaNacimiento;
   public String especie;
   public String nombreEmpleado;
   public String estadoEmpleado;
   
    public void leerDatos(){
        nombreAnimal=JOptionPane.showInputDialog(null,
                "Digite el nombre del animal:");
        fechaNacimiento=JOptionPane.showInputDialog(null,
                "Digite la fecha de nacimiento del animal:");
        especie=JOptionPane.showInputDialog(null,
                "Digite la especie del animal:");
        nombreEmpleado=JOptionPane.showInputDialog(null,
                "Digite el nombre del empleado encargado:");
        estadoEmpleado=JOptionPane.showInputDialog(null,
                "1.Estado Activo\n2.Estado Inactivo\nInserte la opcion:");
        
        if("1".equals(estadoEmpleado)){
            estadoEmpleado="Estado Activo";
            
        }else{
            estadoEmpleado="Estado Inactivo";
            }
    }
        
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,
                "El nombre del animal es: "+nombreAnimal+"\nLa fecha de nacimiento es: "+fechaNacimiento+"\nLa especie es: "+especie+"\nEl nombre del empleado es: "+nombreEmpleado+
                        "\nEstado de empleado: "+estadoEmpleado);
        }
              
        
    
    
}
