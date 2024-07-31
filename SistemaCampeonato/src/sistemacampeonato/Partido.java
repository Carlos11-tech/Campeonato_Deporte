/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacampeonato;

/**
 *
 * @author USER
 */
import java.util.Date;

class Partido {
    Equipo equipo1;
    Equipo equipo2;
    Date fecha;
    String resultado;

    public Partido(Equipo equipo1, Equipo equipo2, Date fecha) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }
}
