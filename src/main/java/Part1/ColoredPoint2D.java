package Part1;

public class ColoredPoint2D extends Point2D implements ColoredFigure{
    private String color;

    public ColoredPoint2D(){
        super();
        setColor("0,0,0,255");
    }
    public ColoredPoint2D(Point2D position){
        super(position);
        setColor("0,0,0,255");
    }
    public ColoredPoint2D(String color){
        super();
        setColor(color);
    }
    public ColoredPoint2D(Point2D position, String color){
        super(position);
        setColor(color);
    }
    public ColoredPoint2D(ColoredPoint2D coloredPoint){
        super(coloredPoint.getPos());
        setColor(coloredPoint.getColor());
    }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }
    public Point2D getPos() { return new Point2D(getX(),getY()); }
    public void setPos(double posX, double posY) { super.setX(posX); super.setY(posY); }
    public void setPos(Point2D pos) { super.setX(pos.getX()); super.setY(pos.getY()); }
}
