import java.awt.Color;

public class GeometricObject {

    public iVertex pos;
    public double width;
    public double height;
    public Color color;

    public GeometricObject(iVertex pos, double width, double height, Color color) {
        this.pos = pos;
        this.color = color;

        if (width < 0) {
            this.width = Math.abs(width);
            this.pos.x = this.pos.x - this.width;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = Math.abs(height);
            this.pos.y = this.pos.y - this.height;
        } else {
            this.height = height;
        }

    }

    public GeometricObject(double posx, double posy, double width, double height) {
        this(new iVertex(posx, posy), width, height, new Color(0, 0, 0));

    }

    public GeometricObject(iVertex pos, double width) {
        this(pos, width, width, new Color(0, 0, 0));
    }

    public GeometricObject(double width, double height) {
        this(0, 0, width, height);
    }

    public GeometricObject(iVertex pos) {
        this(pos, 0, 0, new Color(0, 0, 0));
    }

    public GeometricObject(double x) {
        this(x, x);
    }

    public GeometricObject() {
        this(10, 10);

    }

    public double circumference() {
        return 2 * (height + width);
    }

    public double area() {
        return height * width;
    }

    public boolean contains(iVertex v) {
        return v.x >= pos.x && v.x <= pos.x + width && v.y >= pos.y && v.y <= pos.y + height;
        // ist x im GeometricObject?
    }

    public boolean isLargerAs(GeometricObject that) {
        return this.area() > that.area();
    }

    public void moveTo(iVertex v) {
        pos = v;
    }

    public void moveTo(double x, double y) {
        moveTo(new iVertex(x, y));
    }

    public void move(iVertex v) {
        moveTo(pos.add(v));
    }

    public boolean equals(GeometricObject thatObject) {
        if (thatObject instanceof GeometricObject) {
            GeometricObject that = (GeometricObject) thatObject;
            return this.pos.equals(that.pos) && // Position gleich?
                    this.width == that.width && // Breite gleich?
                    this.height == that.height; // Höhe gleich?
        }
        return false;
    }

    public String toString() {
        return "pos: " + pos + " w: " + width + " h: " + height;
    }

    public double getWidth() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getWidth'");
    }

}