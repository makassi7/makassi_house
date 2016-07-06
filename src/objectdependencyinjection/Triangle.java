/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectdependencyinjection;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class Triangle {
    
//  private Point A,B,C;
//
//    public Point getA() {
//        return A;
//    }
//
//    public void setA(Point A) {
//        this.A = A;
//    }
//
//    public Point getB() {
//        return B;
//    }
//
//    public void setB(Point B) {
//        this.B = B;
//    }
//
//    public Point getC() {
//        return C;
//    }
//
//    public void setC(Point C) {
//        this.C = C;
//    }
//    
//    public void draw(){
//    
//        System.out.println("A="+getA().getX() +" "  +getA().getY() );
//        System.out.println("B:"+getB().getX()+ " "  +getB().getY() );
//        System.out.println("C:"+getC().getX()+ " "  +getC().getY() );
//    
//    
//    }
    
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    public void draw (){
        for(Point point : points)
            System.out.println("X: " + point.getX() +"****"+ "Y: " + point.getY());
    }
}
