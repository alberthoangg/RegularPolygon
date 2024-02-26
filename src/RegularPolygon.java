/** * Author: Albert Hoang, CISC 191, RegularPolygon.java
 *
 * Created on: 2/25/2024
 *In an n-sided regular polygon, all sides have the same length and all
 * angles have the same degree (i.e., the polygon is both equilateral and
 * equiangular).
 * Design a class named RegularPolygon that contains:
 * - A private int data field named n that defines the number of sides in
 * the polygon with default value 3.
 * - A private double data field named side that stores the length of the
 * side with default value 1.
 * - A private double data field named x that defines the x-coordinate of
 * the polygonâs center with default value 0.
 * - A private double data field named y that defines the y-coordinate of
 * the polygonâs center with default value 0.
 * - A no-arg constructor that creates a regular polygon with default
 * values.
 * - A constructor that creates a regular polygon with the specified number
 * of sides and length of side, centered at (0, 0).
 * - A constructor that creates a regular polygon with the specified number
 * of sides, length of side, and x- and y-coordinates.
 * - The accessor and mutator methods for all data fields.
 * - The method getPerimeter()that returns the perimeter of the polygon.
 * - The method getArea()that returns the area of the polygon.
 * The formula for computing the area of a regular polygon is:
 * Area = n * s^2 / (4 * tan(pi / n))
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that creates three RegularPolygon objects, created
 * using the no-arg constructor, using RegularPolygon(6, 4), and using
 * RegularPolygon(10, 4, 5.6, 7.8).
 * For each object, display its perimeter and area.
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
