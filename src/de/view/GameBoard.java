package de.hems.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import de.hems.model.*;

/**
 * Stellt das Spielfeld her und besitzt die Logik des gesamten Spiels Die Klasse
 * implementiert das Interface KeyListener fuer Tastatureingaben und das
 * Interface ActionListener um auf Klicks reagieren zu koennen
 */
public class GameBoard extends JPanel implements KeyListener, ActionListener {

    private static final long serialVersionUID = 1L;
    private JFrame frame;

    private String level = 
        "##########\n" + 
        "#        #\n" + 
        "#  .  #  #\n" + 
        "#  **    #\n" + 
        "#    .   #\n" + 
        "#@       #\n" + 
        "##########";

    /**
     * Konstruktor der Klasse GameBoard
     * 
     * @param JFrame - auf dem das JPanel (diese Klasse) angezeigt werden soll
     */
    public GameBoard(JFrame frame) {
        this.frame = frame;

        // Ihr Quellcode

    }

    /**
     * Eine Methode die durch das Erben von JPanel implementiert wird und für das
     * Zeichnen zuständig ist
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }

    /**
     * Eine Methode die durch das Interface KeyListener implementiert werden muss!
     * Die Methode kann reagieren, wenn z.B. eine Taste gedrueckt wurde
     * 
     * @param e - ein KeyEvent
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode(); // Auslesen welche Taste gedrueckt wurde

        /**
         * Beispiel fuer den KeyListener Bitte löschen Sie den Code wenn Sie Ihn nicht
         * mehr benötigen
         */
        if (key == KeyEvent.VK_SPACE) {
            // Dokumentation der moeglichen Tastenevents
            // https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html
            // Tastenevents werden IMMER ueber KeyEvent.DIE_TASTE geprueft
            System.out.println("Es wurde die Leertaste gedrueckt");
        }

        /**
         * Beginn Ihres Quellcodes
         */



    }

    /**
     * Eine Methode die durch das Interface ActionListener implementiert werden
     * muss! Die Methode kann reagieren, wenn z.B. ein Button geklickt wurde
     * 
     * @param e - ein ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * Wird nicht benötigt
     */
    @Override
    public void keyReleased(KeyEvent e) {    }

    /**
     * Wird nicht benötigt
     */
    @Override
    public void keyTyped(KeyEvent e) {    }

}
