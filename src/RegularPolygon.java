/** * Author: Albert Hoang, CISC 191, RegularPolygon.java
 *
 * Created on: 2/25/2024
 *
 @startuml

 class RegularPolygon {
 - n: int
 - side: double
 - x: double
 - y: double

 + RegularPolygon()
 + RegularPolygon(n: int, side: double)
 + RegularPolygon(n: int, side: double, x: double, y: double)
 + getN(): int
 + getSide(): double
 + getX(): double
 + getY(): double
 + getPerimeter(): double
 + getArea(): double
 + setN(n: int): void
 + setSide(side: double): void
 + setX(x: double): void
 + setY(y: double): void

 }
 @enduml
 * */
import java.lang.Math; //Importing "Math" class in order to use math functions in code
public class RegularPolygon  { //RegualrPolygon class header
    //private data fields
    private int n; //# of the sides the polygon has
    private double side; //length of each side
    private double x;//x-coordinate of the center
    private double y;//y-coordinate of the center

    //main class -- method for testing
    public static void main(String[] args) {
        //creating RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //displaying perimeter and area values of each polygon
        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
    // constructors
    // no-arg constructor
    public RegularPolygon() {
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }

    //constructor with specified number of sides (n) and length of side(side) of each side
    public RegularPolygon(int n, double side) {
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;
    }

    //constructor with specified number of sides(n), length of side(side), and center coordinates(x and y)
    public RegularPolygon(int n,double side, double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    //accessor methods
    public int getN(){

        return n;
    }

    public double getSide(){

        return side;
    }
    public double getX(){

        return x;
    }

    public double getY(){

        return y;
    }

    //mutator methods
    public void setN(int n){
        this.n=n;
    }
    public void setSide(double side){
        this.side=side;
    }
    public void setX(){
        this.x=x;
    }
    public void setY(){
        this.y=y;
    }

    // method to calculate perimeter
    public double getPerimeter(){

        return n*side;
    }

    //method to calculate area
    public double getArea(){
        return(n*side*side)/(4 * Math.tan(Math.PI / n));

    }


}