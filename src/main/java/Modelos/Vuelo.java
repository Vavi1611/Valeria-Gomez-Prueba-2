
package Modelos;
import java.time.LocalDate;

public class Vuelo {
    private int ID;
    private String Origen;
    private String Destino;
    private LocalDate Fecha;
    private PILOTO piloto;

    public Vuelo(int ID, String Origen, String Destino, LocalDate Fecha, PILOTO piloto) {
        this.ID = ID;
        this.Origen = Origen;
        this.Destino = Destino;
        this.Fecha = Fecha;
        this.piloto = piloto;
    }

    public Vuelo() {
        this.ID = 0;
        this.Origen = "";
        this.Destino = "";
        this.Fecha = LocalDate.now();
        this.piloto = new PILOTO();
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public PILOTO getPiloto() {
        return piloto;
    }

    public void setPiloto(PILOTO piloto) {
        this.piloto = piloto;
    }



}