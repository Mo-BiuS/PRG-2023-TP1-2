package Part1;

public class Point2D {
    private double x;
    private double y;

    public Point2D(){
        setX(0);
        setY(0);
    }
    public Point2D(double x, double y){
        setX(x);
        setY(y);
    }
    public Point2D(Point2D p){
        setX(p.getX());
        setY(p.getY());
    }

    public boolean equals(Point2D p){
        return p.getX() == this.getX() && p.getY() == this.getY();
    }
    public String toString(){
        return "x : " + this.getX() + " | y : " + this.getY();
    }

    public double distance(Point2D p){
        return Math.sqrt(Math.pow(p.getX()-this.getX(),2)+Math.pow(p.getY()-this.getY(),2));
    }

    public void setX(double x){ this.x = x; }
    public double getX(){ return x; }
    public void setY(double y){ this.y = y; }
    public double getY(){ return y; }
}
