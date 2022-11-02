
package Modelos;
  import java.time.LocalDate;


import java.time.format.DateTimeFormatter;

public class VEHICULOAEREO {
   
    private String Nombre;
    private int ID;
    private static int ID=90;
    private boolean ListoParaVolar;
    private LocalDate FechaUltimoVuelo;
    private int HorasVoladas;

    public VEHICULOAEREO(String Nombre, int ID, boolean ListoParaVolar, LocalDate FechaUltimoVuelo, int HorasVoladas) {
    }
    public VEHICULOAEREO(String Nombre, boolean ListoParaVolar, LocalDate FechaUltimoVuelo, int HorasVoladas) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.ListoParaVolar = ListoParaVolar;
        this.FechaUltimoVuelo = FechaUltimoVuelo;
        this.HorasVoladas = HorasVoladas;
        ID=ID+10;
    }

    VEHICULOAEREO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        if(v.ValidacionesNombre(Nombre)){
             this.Nombre = Nombre;
        }
        else{
             this.Nombre = "";
        }       
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public boolean isListoParaVolar() {
        return ListoParaVolar;
    }
    public void setListoParaVolar(boolean ListoParaVolar) {
        this.ListoParaVolar = ListoParaVolar;
    }
    public LocalDate getFechaUltimoVuelo() {
        return FechaUltimoVuelo;
    }
    public void setFechaUltimoVuelo(LocalDate FechaUltimoVuelo) {
        this.FechaUltimoVuelo = FechaUltimoVuelo;
    }
    public int getHorasVoladas() {
        return HorasVoladas;
    }




}
    
        
