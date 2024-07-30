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

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Date fecha;
    private String resultado;

    // Constructor
    public Partido(Equipo equipo1, Equipo equipo2, Date fecha) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
    }

    // Getters y setters
    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}