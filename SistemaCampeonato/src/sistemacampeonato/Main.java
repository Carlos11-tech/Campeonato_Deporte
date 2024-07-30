/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemacampeonato;

/**
 *
 * @author USER
 */
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Deporte deporteFutbol = new Deporte();
        deporteFutbol.setNombre("Fútbol");
        deporteFutbol.setTipo(TipoDeporte.FUTBOL);

        // Crear equipos para el primer torneo
        Equipo equipo1Torneo1 = new Equipo("Equipo 1", "Torneo1-Equipo1");
        equipo1Torneo1.addMiembro(new Jugador("Jugador A"));
        equipo1Torneo1.addMiembro(new Jugador("Jugador B"));

        Equipo equipo2Torneo1 = new Equipo("Equipo 2", "Torneo1-Equipo2");
        equipo2Torneo1.addMiembro(new Jugador("Jugador C"));
        equipo2Torneo1.addMiembro(new Jugador("Jugador D"));

        // Crear equipos para el segundo torneo (mismo nombre, diferentes jugadores)
        Equipo equipo1Torneo2 = new Equipo("Equipo 1", "Torneo2-Equipo1");
        equipo1Torneo2.addMiembro(new Jugador("Jugador E"));
        equipo1Torneo2.addMiembro(new Jugador("Jugador F"));

        Equipo equipo3Torneo2 = new Equipo("Equipo 3", "Torneo2-Equipo3");
        equipo3Torneo2.addMiembro(new Jugador("Jugador G"));
        equipo3Torneo2.addMiembro(new Jugador("Jugador H"));

        // Crear el primer torneo
        Torneo torneo1 = new Torneo();
        torneo1.setNombre("Torneo 1");
        torneo1.setDeporte(deporteFutbol);
        torneo1.addEquipo(equipo1Torneo1);
        torneo1.addEquipo(equipo2Torneo1);

        // Crear el segundo torneo
        Torneo torneo2 = new Torneo();
        torneo2.setNombre("Torneo 2");
        torneo2.setDeporte(deporteFutbol);
        torneo2.addEquipo(equipo1Torneo2);
        torneo2.addEquipo(equipo3Torneo2);

        // Simulación de partidos para el primer torneo
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < torneo1.equipos.size(); i++) {
            for (int j = i + 1; j < torneo1.equipos.size(); j++) {
                Equipo e1 = torneo1.equipos.get(i);
                Equipo e2 = torneo1.equipos.get(j);
                Partido partido = new Partido(e1, e2, new Date());

                System.out.println("Ingrese el resultado del partido entre " + e1.getNombre() + " y " + e2.getNombre() + " (formato: golesEquipo1-golesEquipo2): ");
                String resultado = scanner.nextLine();
                partido.setResultado(resultado);

                torneo1.addPartido(partido);
                torneo1.actualizarResultado(partido, resultado);
            }
        }

        // Mostrar tabla de posiciones para el primer torneo
        torneo1.mostrarTablaDePosiciones();

        // Simulación de partidos para el segundo torneo
        for (int i = 0; i < torneo2.equipos.size(); i++) {
            for (int j = i + 1; j < torneo2.equipos.size(); j++) {
                Equipo e1 = torneo2.equipos.get(i);
                Equipo e2 = torneo2.equipos.get(j);
                Partido partido = new Partido(e1, e2, new Date());

                System.out.println("Ingrese el resultado del partido entre " + e1.getNombre() + " y " + e2.getNombre() + " (formato: golesEquipo1-golesEquipo2): ");
                String resultado = scanner.nextLine();
                partido.setResultado(resultado);

                torneo2.addPartido(partido);
                torneo2.actualizarResultado(partido, resultado);
            }
        }
        torneo2.mostrarTablaDePosiciones();

        scanner.close();
    }
}



