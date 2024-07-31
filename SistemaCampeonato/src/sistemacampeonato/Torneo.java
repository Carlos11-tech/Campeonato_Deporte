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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Torneo {
    private String nombre;
    private Deporte deporte;
    List<Equipo> equipos;
    private List<Partido> partidos;

    public Torneo() {
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public void addEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void addPartido(Partido partido) {
        partidos.add(partido);
    }

    public void actualizarResultado(Partido partido, String resultado) {
        String[] goles = resultado.split("-");
        int golesEquipo1 = Integer.parseInt(goles[0]);
        int golesEquipo2 = Integer.parseInt(goles[1]);

        partido.equipo1.agregarGolesAFavor(golesEquipo1);
        partido.equipo1.agregarGolesEnContra(golesEquipo2);
        partido.equipo2.agregarGolesAFavor(golesEquipo2);
        partido.equipo2.agregarGolesEnContra(golesEquipo1);

        if (golesEquipo1 > golesEquipo2) {
            partido.equipo1.agregarPuntos(3);
        } else if (golesEquipo1 < golesEquipo2) {
            partido.equipo2.agregarPuntos(3);
        } else {
            partido.equipo1.agregarPuntos(1);
            partido.equipo2.agregarPuntos(1);
        }
    }

    public void mostrarTablaDePosiciones() {
        System.out.println("Tabla de Posiciones de " + nombre);
        System.out.println("Equipo\t\tPuntos\tGF\tGC\tDG");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombre() + "\t\t" + equipo.getPuntos() + "\t\t" + equipo.getGolesAFavor() + "\t\t\t" + equipo.getGolesEnContra() + "\t\t\t" + equipo.getDiferenciaDeGoles());
        }
    }
}
