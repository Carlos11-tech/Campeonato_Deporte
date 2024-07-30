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

public class Equipo {
    private String nombre;
    private String identificadorUnico; // Identificador único para diferenciar equipos
    private List<Jugador> miembros = new ArrayList<>();
    private int puntos;

    // Constructor con identificador único
    public Equipo(String nombre, String identificadorUnico) {
        this.nombre = nombre;
        this.identificadorUnico = identificadorUnico;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void addMiembro(Jugador jugador) {
        miembros.add(jugador);
    }

    public List<Jugador> getMiembros() {
        return miembros;
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}


