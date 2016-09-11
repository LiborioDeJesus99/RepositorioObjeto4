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

    private Long Longitud;
    private Long Contraseña;

    public clase(Long Longitud, Long Contraseña) {
        this.Contraseña = Contraseña;
        this.Longitud = Longitud;

    }

    public clase(long Contraseña) {

    }

    public Long getLongitud() {
        return Longitud;
    }

    public void setLongitud(Long Longitud) {
        this.Longitud = Longitud;
    }

    public Long getContraseña() {
        return Contraseña;
    }

    public void setContraseña(Long Contraseña) {
        this.Contraseña = Contraseña;
    }

    public clase Contraseña() {
        Long Contra, Longi;
        clase c;
        Longi = this.Longitud;
        Contra = this.Contraseña;
        c = new clase(Contra, Longi);

        return c;
    }

    public clase Cambiar() {
        Long camb, n1, contra;
        clase c = null;

        return c;

    }
}
