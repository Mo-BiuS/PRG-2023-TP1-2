package Part1;

public class ColoredRect2D extends Rect2D implements ColoredFigure{
    private String color;

    public ColoredRect2D(){
        super();
        setColor("0,0,0,255");
    }
    public ColoredRect2D(String color){
        super();
        setColor(color);
    }
    public ColoredRect2D(Rect2D rect){
        super(rect);
        setColor("0,0,0,255");
    }
    public ColoredRect2D(Rect2D rect, String color){
        super(rect);
        setColor(color);
    }

    public void setColor(String c) {color = c;}
    public String getColor() {return color;}
}
