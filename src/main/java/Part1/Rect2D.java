package Part1;

public class Rect2D {
    private Point2D position;
    private Point2D size;

    public Rect2D(){
        position = new Point2D();
        size = new Point2D();
    }
    public Rect2D(double positionX, double positionY, double tailleX, double tailleY){
        setPosition(positionX,positionY);
        setSize(tailleX,tailleY);
    }
    public Rect2D(Point2D position, Point2D taille){
        setPosition(position);
        setSize(taille);
    }
    public Rect2D(Rect2D rect){
        setPosition(rect.getPosition());
        setSize(rect.getSize());
    }

    public double largeur(){
        return size.getX();
    }
    public double hauteur(){
        return size.getY();
    }

    public double permimetre(){
        return size.getX()*2+ size.getY()*2;
    }
    public double surface() {
        return size.getX()*2* size.getY()*2;
    }

    public void setSize(double sizeX, double sizeY) { size = new Point2D(sizeX, sizeY); }
    public void setPosition(double positionX, double positionY) { position = new Point2D(positionX, positionY); }
    public void setSize(Point2D size) { size = new Point2D(size.getX(), size.getY()); }
    public void setPosition(Point2D position) { position = new Point2D(position.getX(), position.getY()); }
    public Point2D getSize() { return size; }
    public Point2D getPosition() { return position; }
}
