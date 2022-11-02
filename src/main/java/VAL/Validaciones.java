
package VAL;


public class Validaciones {
  
          
    public Boolean ValidacionesString(int cantidad, String nombre){
        
        return nombre.length()>cantidad;
    }
    
    public boolean ValidacionesNombre(String nombre){
        return nombre.length()>0;           
    }    
    public boolean ValidarEmail(String email){
        if(email.contains("@") && (email.contains(".com") ||  email.contains(".cl"))){
            return email.contains("@") && (email.endsWith(".com") ||  email.endsWith(".cl"));
    }
    
    

