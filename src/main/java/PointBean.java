import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class PointBean implements Serializable {

    Double x ;
    Double y ;
    Double r ;

    Double xFromCanvas;
    Double yFromCanvas;


    public Double getxFromCanvas() {
        return xFromCanvas;
    }

    public void setxFromCanvas(Double xFromCanvas) {
        this.xFromCanvas = xFromCanvas;
    }

    public Double getyFromCanvas() {
        return yFromCanvas;
    }

    public void setyFromCanvas(Double yFromCanvas) {
        this.yFromCanvas = yFromCanvas;
    }


    List<PointEntry> pointEntryList;

    public PointBean(){
        pointEntryList=new ArrayList<PointEntry>();
    }

    public List<PointEntry> getPointEntryList() {
        return pointEntryList;
    }

    public void setPointEntryList(List<PointEntry> pointEntryList) {
        this.pointEntryList = pointEntryList;
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


    public void action(){}

    public void action1(){


        System.out.println("2222");
        HitDetection hitDetection=new HitDetection(x,y,r);
        System.out.println(hitDetection.Hit(x,y,r));
        PointEntry pointEntry=new PointEntry(x,y,r,hitDetection.Hit(x,y,r),new SimpleDateFormat("HH:mm:ss").format(new Date()));
        pointEntryList.add(pointEntry);
        System.out.println(pointEntryList.size());


    }
}
