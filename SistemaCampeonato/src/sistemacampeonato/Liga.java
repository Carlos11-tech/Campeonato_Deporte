/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacampeonato;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;

class Liga {
    private String nombre;
    private List<Torneo> torneos;

    public Liga() {
        torneos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addTorneo(Torneo torneo) {
        torneos.add(torneo);
    }

    public void mostrarTorneos() {
        System.out.println("LIGA: " + nombre);
        for (Torneo torneo : torneos) {
            torneo.mostrarTablaDePosiciones();
        }
    }
}

