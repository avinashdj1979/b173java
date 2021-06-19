package edu.vcentry.myths;

//Program to find area of triangle
class Triangle {
 int x, y;
 void printArea()
 {
     System.out.println("Area of triangle is: " + x * y / 2);
 }
}

class Demo {
 public static void main(String args[])
 {
     // Object creation
     Triangle t = new Triangle();
     t.x = 10;
     t.y = 13;
     t.printArea();
 }
}