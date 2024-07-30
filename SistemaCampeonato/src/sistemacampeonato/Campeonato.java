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

public class Campeonato {
    private String nombre;
    private List<Torneo> torneos = new ArrayList<>();

    public Campeonato(String nombre) {
        this.nombre = nombre;
    }

    public void addTorneo(Torneo torneo) {
        torneos.add(torneo);
    }

    public String getNombre() {
        return nombre;
    }
}


