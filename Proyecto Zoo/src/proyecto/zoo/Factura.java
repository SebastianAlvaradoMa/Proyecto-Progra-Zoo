//jeff
package proyecto.zoo;

public class Factura {
    // citas, modificar y eso
    private String nombreV;
    private String fecha;
    private int HoraVisita;
    private int opcion;

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

    public int getHoraVisita() {
        return HoraVisita;
    }

    public void setHoraVisita(int HoraVisita) {
        this.HoraVisita = HoraVisita;
    }
}