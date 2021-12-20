package bean;

public class HitDetection {
    private Double x;
    private Double y;
    private Double r;

    public HitDetection(Double x,Double y,Double r){
        this.x=x;
        this.y=y;
        this.r=r;
    }

    public boolean HitInSquare(Double x,Double y,Double r){
        return x>=0 && y<=0 && x<=r && y>=-r;
    }

    public boolean HitInRectangle(Double x, Double y, Double r){
        return x<=0 && y<=0 && y>=-2* x-r;
    }

    public boolean HitInCircle(Double x,Double y,Double r){
        return x>=0 && y>=0 && x*x+y*y<=r*r;
    }

    public boolean Hit(Double x, Double y, Double r){
        return HitInCircle(x,y,r) || HitInRectangle(x,y,r) || HitInSquare(x,y,r);
    }
}
