package com.company;


 abstract class Shape
{
    abstract void draw();
}
 class Rectangle extends Shape
{
    public void draw()
    {
        int length = 10;
        int breadth = 5;
        System.out.print("drawing a rectangle of length :" + length);
        System.out.println(" breadth:"+breadth);

    }
}
 class Line extends Shape {
    public void draw()
    {
        int length = 10;
        System.out.println("drawing a line of length:" + length);
    }
}
 class Cube extends Shape
{

    public void draw()
    {
        int length = 10;
        int breadth = 5;
        int width = 3;
        System.out.print("drawing a cube of length:"+length);
        System.out.print(" breadth:"+breadth);
        System.out.print(" width:"+width);
    }
}


public class DrawingShapes {

    public static void main(String[] args) {
        Line l=new Line();
        Rectangle r=new Rectangle();
        Cube c=new Cube();
        l.draw();
        r.draw();
        c.draw();
    }
}
