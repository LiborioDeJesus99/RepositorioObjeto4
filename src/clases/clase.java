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
public class clase {

    private int Longitud;
    private String Contraseña;

    public clase() {
        this.Longitud = 8;
    }

    public clase(int Longitud, String Contraseña) {
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

    public String Fuerte() {
        String F;
        if (this.Longitud >= 6) {
            F = "Es Fuerte";
        } else {
            F = "Es Debil";
        }
        return F;
    }

    public clase mostrar() {
        clase Contraseña;
        String Mr;
        int l;
        Mr = this.Contraseña;
        l = this.Longitud;
        Contraseña = new clase(l, Mr);
        return Contraseña;
    }

    public clase CambiarContraseña() {
        clase N;
        int l = this.Longitud;
        String Contraseña = this.Contraseña;
        N = new clase(l, Contraseña);
        return N;

    }
}
