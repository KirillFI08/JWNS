package Test;

import javax.swing.*;
import java.awt.*;

public class MandelbrotPanel extends JPanel {
    // Berechnungsbereich für das Mandelbrot-Set
    private static final int MAX_ITER = 1000;
    private static final double ZOOM = 150;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Erstelle ein Graphics2D-Objekt für besseres Zeichnen
        Graphics2D g2d = (Graphics2D) g;
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                // Berechne die Farbe für jedes Pixel im Mandelbrot-Set
                int color = calculateMandelbrot(x, y);
                g2d.setColor(new Color(color));
                g2d.fillRect(x, y, 1, 1); // Zeichne das Pixel
            }
        }
    }

    // Berechnung, ob der Punkt im Mandelbrot-Set liegt
    private int calculateMandelbrot(int x, int y) {
        // Umrechnung von Pixel-Koordinaten in den komplexen Bereich
        double zx = 1.5 * (x - getWidth() / 2) / ZOOM;
        double zy = (y - getHeight() / 2) / ZOOM;
        int i = 0;
        double cX = zx, cY = zy;

        // Iteration, um zu prüfen, ob der Punkt im Mandelbrot-Set ist
        while (zx * zx + zy * zy < 4 && i < MAX_ITER) {
            double tmp = zx * zx - zy * zy + cX;
            zy = 2.0 * zx * zy + cY;
            zx = tmp;
            i++;
        }

        // Farbwert basierend auf der Anzahl der Iterationen
        if (i == MAX_ITER) {
            return 0x000000; // Schwarz für Punkte im Set
        } else {
            // Grauwert je nach Iteration (kann auch durch Farben ersetzt werden)
            return (i * 255 / MAX_ITER) << 16;
        }
    }
}

