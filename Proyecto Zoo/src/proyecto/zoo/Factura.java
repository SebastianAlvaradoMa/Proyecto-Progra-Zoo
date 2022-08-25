
package proyecto.zoo;

public class Factura {
    // citas, modificar y eso
    private String nombreV;
    private String fecha;
    private String HoraVisita;
    private String FechasMod;
    private String HoraMod;
    private int Personas;
    public int Persona;
    
    public Factura(){
        this.nombreV=" ";
        this.fecha=" ";
        this.HoraVisita=" ";
        this.FechasMod=" ";
        this.HoraMod=" ";
        this.Personas=0;
        this.Persona=0;
    }

    public String getHoraMod() {
        return HoraMod;
    }

    public void setHoraMod(String HoraMod) {
        this.HoraMod = HoraMod;
    }

    public String getFechasMod() {
        return FechasMod;
    }

    public void setFechasMod(String FechasMod) {
        this.FechasMod = FechasMod;
    }
    
    public int getPersonas() {
        return Personas;
    }

    public void setPersonas(int Personas) {
        this.Personas = Personas;
    }

    public String getNombreV() {
        return this.nombreV;
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

