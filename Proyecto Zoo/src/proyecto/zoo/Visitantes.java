
package proyecto.zoo;

public class Visitantes {
    
    private String NombreV;
    private String apellidosV;
    private int edad;
    
    public Visitantes(){
        this.NombreV=" ";
        this.apellidosV=" ";
        this.edad=0;
    }

    public String getNombreV() {
        return NombreV;
    }

    public void setNombreV(String NombreV) {
        this.NombreV = NombreV;
    }

    public String getApellidosV() {
        return apellidosV;
    }

    public void setApellidosV(String apellidosV) {
        this.apellidosV = apellidosV;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
