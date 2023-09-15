package Part1;

public class ColoredSquare2D extends ColoredRect2D {
    public ColoredSquare2D(){
        super();
    }
    public ColoredSquare2D(String color){
        super(color);
    }
    public ColoredSquare2D(Point2D position, double size){
        super();
        setPosition(position);
        setSize(new Point2D(size,size));
    }
    public ColoredSquare2D(Point2D position, double size, String color){
        super(color);
        setPosition(position);
        setSize(new Point2D(size,size));
    }

}
