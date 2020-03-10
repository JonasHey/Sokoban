package de.hems.view;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * Stellt das Spielmenue dar und erbt von der Klasse JPanel Dies bedeutet, dass
 * die Klasse GameMenu die Eigenschaften und Funktionalitaeten eines JPanels
 * besitzt.
 */
public class GameMenu extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JFrame frame;

    /**
     * Konstruktor der Klasse GameMenu
     * 
     * @param JFrame - auf dem das JPanel (diese Klasse) angezeigt werden soll
     */
    public GameMenu(JFrame frame) {
        this.frame = frame;

        /**
         * Beginn Ihres Quellcodes Hier koennen Sie Ihre Buttons anlegen und ein Layout
         * festlegen
         */


        
        /**
         * Ende Ihres Quellcodes
         */
        // Fuegt das JPanel (diese Klasse) dem JFrame hinzu und zeigt es an!
        this.frame.add(this);
    }

    /**
     * Hilfsmethode zum Zeichnen - Hier muessen Sie nichts veraendern
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    /**
     * Eine Methode die durch das Interface ActionListener impelentiert werden muss!
     * Die Methode kann reagieren, wenn z.B. ein Button geklickt wurde
     * 
     * @param e - ein ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Ihr Quellcode zur Behandlung der Events der beiden Buttons


        
        /**
         * Der Quellcode zum laden des GameBoards Er darf erst ausgeführt werden, wenn
         * der Nutzer auf "Neues Spiel" geklickt hat
         */
        frame.remove(this); // Entfernen des GameMenu JPanels
        GameBoard gameBoard = new GameBoard(frame); // Erzeugen eines GameBoard Objektes
        frame.add(gameBoard); // Hinzufuegen des GameBoards
        gameBoard.requestFocus(); // Setzen des Fokus auf unser Fenster
        frame.validate();
    }

}
