/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author liborio
 */
public class Password {

    private int Longitud;
    private String Contraseña;

    public Password() {
        this.Longitud = 8;
    }

    public Password(int Longitud, String Contraseña) {
        this.Longitud = Longitud;
        this.Contraseña = Contraseña;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public boolean Fuerte(){
        boolean sw = true;
        if (this.Longitud < 6) {
            sw = false;
        }
        return sw;
    }
    

    public Password mostrar() {
        Password Contraseña;
        String Mr;
        int l;
        Mr = this.Contraseña;
        l = this.Longitud;
        Contraseña = new Password(l, Mr);
        return Contraseña;
    }

    public Password CambiarContraseña() {
        Password N;
        int l = this.Longitud;
        String Contraseña = this.Contraseña;
        N = new Password(l, Contraseña);
        return N;

    }
}
