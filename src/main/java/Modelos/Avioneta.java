
package Modelos;

   import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Avioneta extends VehiculoAereo{
    private boolean UltraSonico;

    public Avioneta(String Nombre, int ID, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,boolean UltraSonico) {
        super(Nombre,ID,ListoParaVolar,FechaUltimoVuelo,HorasVoladas); 
    public Avioneta(String Nombre, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,boolean UltraSonico) {
        super(Nombre,ListoParaVolar,FechaUltimoVuelo,HorasVoladas); 
        this.UltraSonico = UltraSonico;
    }

    public Avioneta() {
        this.UltraSonico = false;
    }
    public boolean isUltraSonico() {
        return UltraSonico;
    }
    public void setUltraSonico(boolean UltraSonico) {
        this.UltraSonico = UltraSonico;
    }
    
    
}
