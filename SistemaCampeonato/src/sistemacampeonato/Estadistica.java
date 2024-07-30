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

public class Estadistica {
    private Torneo campeonato;
    private ArrayList<Equipo> tablaPosiciones = new ArrayList<>();
    private ArrayList<Jugador> estadisticasIndividuales = new ArrayList<>();

    public ArrayList<Equipo> getTablaPosiciones() {
        return tablaPosiciones;
    }

    public ArrayList<Jugador> getEstadisticasIndividuales() {
        return estadisticasIndividuales;
    }

    public void actualizarTablaPosiciones() {
        // Lógica para actualizar la tabla de posiciones
    }

    public void actualizarEstadisticasIndividuales(Jugador jugador) {
        // Lógica para actualizar las estadísticas individuales
    }
}

