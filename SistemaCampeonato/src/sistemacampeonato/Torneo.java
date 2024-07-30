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

public class Torneo {
    private String nombre;
    private Deporte deporte;
    List<Equipo> equipos = new ArrayList<>();
    private List<Partido> partidos = new ArrayList<>();

    // Getters y setters
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

        if (golesEquipo1 > golesEquipo2) {
            partido.getEquipo1().agregarPuntos(3); // Ganador
        } else if (golesEquipo1 < golesEquipo2) {
            partido.getEquipo2().agregarPuntos(3); // Ganador
        } else {
            partido.getEquipo1().agregarPuntos(1); // Empate
            partido.getEquipo2().agregarPuntos(1); // Empate
        }
    }

    public void mostrarTablaDePosiciones() {
        equipos.sort((e1, e2) -> Integer.compare(e2.getPuntos(), e1.getPuntos()));
        System.out.println("Tabla de posiciones:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombre() + ": " + equipo.getPuntos() + " puntos");
        
        }
    }
}

