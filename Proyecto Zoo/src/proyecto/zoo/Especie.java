
package proyecto.zoo;

import javax.swing.JOptionPane;

public class Especie {
    public class Animal {
   public String especie;
   public String estado;
   public String carac;
   
    public void leerDatos(){
        carac=JOptionPane.showInputDialog(null,
                "Digite las características de la especie:");
        especie=JOptionPane.showInputDialog(null,
                "Digite la especie que ingresa:");
        estado=JOptionPane.showInputDialog(null,
                "1.Estado activo\n2.Estado Inactivo\nInserte el estado de la especie en el zoologico:");
        
        if("1".equals(estado)){
            estado="Estado Activo";
            
        }else{
            estado="Estado Inactivo";
            }
    }
        
    public void mostrarDatos(){
        JOptionPane.showMessageDialog(null,
                "El nombre de la especie es: "+especie+"\nLas características de la especie son: "+carac+"\nEstado de la especie: "+estado);
        }
              
        
    
    
}
}
