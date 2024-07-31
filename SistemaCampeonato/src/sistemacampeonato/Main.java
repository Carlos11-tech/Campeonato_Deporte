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
        // Crear la instancia de la implementación de TipoDeporte
        TipoDeporte tipoFutbol = new Futbol();

        // Crear instancias de las clases
        Deporte deporteFutbol = new Deporte();
        deporteFutbol.setNombre("Fútbol");
        deporteFutbol.setTipo(tipoFutbol);

        // Crear equipos para el primer torneo
        Equipo barcelonaTorneo1 = new Equipo("Barcelona", "Torneo1-Barcelona");
        barcelonaTorneo1.addMiembro(new Jugador("Jugador A"));
        barcelonaTorneo1.addMiembro(new Jugador("Jugador B"));

        Equipo realMadridTorneo1 = new Equipo("Real Madrid", "Torneo1-RealMadrid");
        realMadridTorneo1.addMiembro(new Jugador("Jugador C"));
        realMadridTorneo1.addMiembro(new Jugador("Jugador D"));

        Equipo liverpoolTorneo1 = new Equipo("Liverpool", "Torneo1-Liverpool");
        liverpoolTorneo1.addMiembro(new Jugador("Jugador E"));
        liverpoolTorneo1.addMiembro(new Jugador("Jugador F"));

        Equipo psgTorneo1 = new Equipo("PSG", "Torneo1-PSG");
        psgTorneo1.addMiembro(new Jugador("Jugador G"));
        psgTorneo1.addMiembro(new Jugador("Jugador H"));

        // Crear equipos para el segundo torneo (mismo nombre, diferentes jugadores)
        Equipo barcelonaTorneo2 = new Equipo("Barcelona", "Torneo2-Barcelona");
        barcelonaTorneo2.addMiembro(new Jugador("Jugador I"));
        barcelonaTorneo2.addMiembro(new Jugador("Jugador J"));

        Equipo manchesterCityTorneo2 = new Equipo("Manchester City", "Torneo2-ManchesterCity");
        manchesterCityTorneo2.addMiembro(new Jugador("Jugador K"));
        manchesterCityTorneo2.addMiembro(new Jugador("Jugador L"));

        Equipo chelseaTorneo2 = new Equipo("Chelsea", "Torneo2-Chelsea");
        chelseaTorneo2.addMiembro(new Jugador("Jugador M"));
        chelseaTorneo2.addMiembro(new Jugador("Jugador N"));

        Equipo juventusTorneo2 = new Equipo("Juventus", "Torneo2-Juventus");
        juventusTorneo2.addMiembro(new Jugador("Jugador O"));
        juventusTorneo2.addMiembro(new Jugador("Jugador P"));

        // Crear el primer torneo
        Torneo torneo1 = new Torneo();
        torneo1.setNombre("Champions League - Grupo A");
        torneo1.setDeporte(deporteFutbol);
        torneo1.addEquipo(barcelonaTorneo1);
        torneo1.addEquipo(realMadridTorneo1);
        torneo1.addEquipo(liverpoolTorneo1);
        torneo1.addEquipo(psgTorneo1);

        // Crear el segundo torneo
        Torneo torneo2 = new Torneo();
        torneo2.setNombre("Champions League - Grupo B");
        torneo2.setDeporte(deporteFutbol);
        torneo2.addEquipo(barcelonaTorneo2);
        torneo2.addEquipo(manchesterCityTorneo2);
        torneo2.addEquipo(chelseaTorneo2);
        torneo2.addEquipo(juventusTorneo2);

        // Crear la liga mayor
        Liga liga = new Liga();
        liga.setNombre("Champions League");
        liga.addTorneo(torneo1);
        liga.addTorneo(torneo2);

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

        // Mostrar tabla de posiciones para ambos torneos
        liga.mostrarTorneos();

        scanner.close();
    }
}







