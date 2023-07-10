package com.abc.graphics;
public class Rect
{
 private double length,breadth;
 public Rect(){ }

 public Rect(double length,double breadth)
{
this.length=length;
this.breadth=breadth;
}
public double area(){
return length*breadth;
}
}