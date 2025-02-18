package Test;

public class MandelbrotSetCalculator {
    private static final int MAX_ITER = 1000;
    private static final double ZOOM = 150;

    public static int calculateMandelbrot(int x, int y, int width, int height) {
        double zx = 1.5 * (x - width / 2) / ZOOM;
        double zy = (y - height / 2) / ZOOM;
        int i = 0;
        double cX = zx, cY = zy;

        while (zx * zx + zy * zy < 4 && i < MAX_ITER) {
            double tmp = zx * zx - zy * zy + cX;
            zy = 2.0 * zx * zy + cY;
            zx = tmp;
            i++;
        }

        if (i == MAX_ITER) {
            return 0x000000;
        } else {
            return (i * 255 / MAX_ITER) << 16;
        }
    }
}

