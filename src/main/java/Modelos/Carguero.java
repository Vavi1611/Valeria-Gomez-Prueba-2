
package Modelos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Carguero extends VehiculoAereo{
    private int Tonelaje;
    
    public Carguero() {
        this.Tonelaje = 0;
    }    

    public Carguero(String Nombre, int ID, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,int Tonelaje) {
        super(Nombre,ID,ListoParaVolar,FechaUltimoVuelo,HorasVoladas); 
    public Carguero(String Nombre, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,int Tonelaje) {
        super(Nombre,ListoParaVolar,FechaUltimoVuelo,HorasVoladas); 
        this.Tonelaje = Tonelaje;
    }

    public int getTonelaje() {
        return Tonelaje;
    }
    public void setTonelaje(int Tonelaje) {
        this.Tonelaje = Tonelaje;
    }   
    
     
