public interface GameObject extends Movable, Paintable {

    double getWidth();
    double getHeight();
    iVertex getPos();
    iVertex getDeltaPos();
    void setDeltaPos(iVertex v);
    boolean isLargerThan(GameObject that);
    boolean isLeftOf(GameObject that);
    boolean isAboveOf(GameObject that);
    boolean touches(GameObject that);
    
}
