
package proyecto.zoo;

public class Factura {
    // citas, modificar y eso
    private String nombreV;
    private String fecha;
    private String HoraVisita;
    private int Personas;
    public int Persona;

    public int getPersonas() {
        return Personas;
    }

    public void setPersonas(int Personas) {
        this.Personas = Personas;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraVisita() {
        return HoraVisita;
    }

    public void setHoraVisita(String HoraVisita) {
        this.HoraVisita = HoraVisita;
    }
}

