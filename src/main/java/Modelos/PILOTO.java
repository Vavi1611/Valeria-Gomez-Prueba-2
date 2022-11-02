
package Modelos;


public class PILOTO {
     private int ID;
    private String Nombre;
    private VEHICULOAEREO Vehiculo;

    public PILOTO(int ID, String Nombre, VEHICULOAEREO Vehiculo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Vehiculo = Vehiculo;
    }

    public PILOTO() {
        this.ID = 0;
        this.Nombre = "";
        this.Vehiculo = new VEHICULOAEREO();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public VEHICULOAEREO getVehiculo() {
        return Vehiculo;
    }

    public void setVehiculo(VEHICULOAEREO Vehiculo) {
        this.Vehiculo = Vehiculo;
    }




}

