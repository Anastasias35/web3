package bean;

import DataBase.PointEntryDao;
import bean.HitDetection;

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

    Double canvascoordX;
    Double canvascoordY;

    List<PointEntry> pointEntryList;
    PointEntryDao pointEntryDao;

    public PointBean(){
        pointEntryList=new ArrayList<PointEntry>();
       // pointEntryDao = new PointEntryDao();
    }

    public Double getCanvascoordX() {
        return canvascoordX;
    }

    public void setCanvascoordX(Double canvasX) {
        this.canvascoordX = canvasX;
    }

    public Double getCanvascoordY() {
        return canvascoordY;
    }

    public void setCanvascoordY(Double canvasY) {
        this.canvascoordY = canvasY;
    }

    public PointEntryDao getPointEntryDao() {
        return pointEntryDao;
    }

    public void setPointEntryDao(PointEntryDao pointEntryDao) {
        this.pointEntryDao = pointEntryDao;
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

    public void action3(){
        System.out.println("2");
       // x=canvasX;
      //  y=canvasY;
        System.out.println(canvascoordX);
        System.out.println(canvascoordY);
      //  HitDetection hitDetection=new HitDetection(x,y,r);
     //   System.out.println(hitDetection.Hit(x,y,r));
      //  PointEntry pointEntry=new PointEntry(x,y,r,hitDetection.Hit(x,y,r),new SimpleDateFormat("HH:mm:ss").format(new Date()));
      //  pointEntryList.add(pointEntry);
    }

    public void action1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(r);
        HitDetection hitDetection=new HitDetection(x,y,r);
        System.out.println(hitDetection.Hit(x,y,r));
        PointEntry pointEntry=new PointEntry(x,y,r,hitDetection.Hit(x,y,r),new SimpleDateFormat("HH:mm:ss").format(new Date()));
        pointEntryList.add(pointEntry);
        //pointEntryDao.save(pointEntry);
    //    System.out.println(pointEntryList.size());







    }
}
