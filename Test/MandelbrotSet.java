package Test;

import javax.swing.*;

public class MandelbrotSet {
    public static void main(String[] args) {
        // Erstelle das Hauptfenster
        JFrame frame = new JFrame("Mandelbrot Set");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800); // Setze die Größe des Fensters
        frame.add(new MandelbrotPanel()); // Füge das Panel hinzu
        frame.setVisible(true); // Mache das Fenster sichtbar
    }
}
