package de.hems.view;

import javax.swing.JFrame;

/**
 * Main-Klasse des Spiels, die die Main-Methode besitzt um das Spiel zu starten
 */
public class SokobanUi {

    /**
     * Main-Methode zum Starten des Spiels
     * 
     * @param args
     */
    public static void main(String[] args) {
        new SokobanUi(); // Erzeugen eines SokobanUI Objektes
    }

    /**
     * Konstruktor der Klasse SokobanUi Ruft die Methode initUi auf um die
     * Oberflaeche zu erstellen
     */
    public SokobanUi() {
        initUi();
    }

    /**
     * Initialisieren der grafischen Benutzerobeflaeche und Laden des GamenMenu
     */
    private void initUi() {
        JFrame frame = new JFrame();
        frame.setTitle("Sokoban");

        GameMenu menu = new GameMenu(frame);
        frame.add(menu);

        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
