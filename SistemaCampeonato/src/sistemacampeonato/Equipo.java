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

class Equipo {
    private String nombre;
    private String identificador;
    private List<Jugador> miembros;
    private int golesAFavor;
    private int golesEnContra;
    private int puntos;

    public Equipo(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.miembros = new ArrayList<>();
        this.golesAFavor = 0;
        this.golesEnContra = 0;
        this.puntos = 0;
    }

    public void addMiembro(Jugador jugador) {
        miembros.add(jugador);
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getDiferenciaDeGoles() {
        return golesAFavor - golesEnContra;
    }

    public void agregarGolesAFavor(int goles) {
        golesAFavor += goles;
    }

    public void agregarGolesEnContra(int goles) {
        golesEnContra += goles;
    }

    public void agregarPuntos(int puntos) {
        this.puntos += puntos;
    }
}
