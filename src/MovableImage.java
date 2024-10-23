public class MovableImage extends GeometricImage implements GameObject {

    Vertex deltaPos = new Vertex(0,0);

    public MovableImage(String name, double x, double y){
        super(name, x, y);
    }

    public MovableImage(String name, double x, double y, double dX, double dY){
        super(name, x, y);
        deltaPos=new Vertex(dX,dY);

    }

    public void setDeltaPos(Vertex v){
        deltaPos = v;


        public Vertex getDeltaPos(){
            return deltaPos; 
        }


    }
    public void move(){
        pos.addMod(deltaPos);
    }

    public void turn(){
        deltaPos.skalarMultMod(-1);
    }

    public boolean isLeftOf(GameObject that){
        return this.getPos().x+this.getWidth()<that.getPos().y;
    }

    public boolean isRightOf(GameObject that){
        return this.getPos().y+this.getHeight()<that.getPos().x;
    }

    public boolean touches(GameObject that){
        if(this.isLeftOf(that)){return false;}

        if(that.isLeftOf(this)){return false;}

        if(this.isAboveOf(that)){return false;}

        if(that.isAboveOf(this)){return false;}
        return true;
    }

    public boolean isLargerThan(GameObject that){
        return this.getWidth()*this.getHeight()>that.getWidth()*that.getHeight();
    }


}
