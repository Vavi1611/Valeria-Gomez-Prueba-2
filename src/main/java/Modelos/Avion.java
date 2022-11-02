
package Modelos;

    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.time.format.FormatStyle;

    public class Avion extends VEHICULOAEREO{
    private String DatosExtra;
    
    public Avion() {
        this.DatosExtra = "";
    }

    public Avion(String Nombre, int ID, boolean ListoParaVolar,LocalDate FechaUltimoVuelo,int HorasVoladas,String DatosExtra) {
    super(Nombre,ID,ListoParaVolar,FechaUltimoVuelo,HorasVoladas);            
        this.DatosExtra = DatosExtra;
    }
    }
