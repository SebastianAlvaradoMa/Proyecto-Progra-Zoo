
package proyecto.zoo;

import javax.swing.JOptionPane;

public class Especie {

   private String especie;
   private String estado;
   private String carac;

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getCarac() {
            return carac;
        }

        public void setCarac(String carac) {
            this.carac = carac;
        }
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
    




