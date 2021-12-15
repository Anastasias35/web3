
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



public class PointEntry implements Serializable {
    private Double x;
    private Double y;
    private Double r;
    private boolean result;
    private String curTime;

    public PointEntry(){
    }

    public PointEntry(Double x, Double y, Double r, boolean result, String curTime){
        this.x=x;
        this.y=y;
        this.r=r;
        this.result=result;
        this.curTime=curTime;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getCurTime() {
        return curTime;
    }

    public void setCurTime(String curTime) {
        this.curTime = curTime;
    }


}