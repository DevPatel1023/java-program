/* Create an abstract class called Shape, which has an abstract method called getArea(). Create subclasses for different shapes (such as Circle, Rectangle, and Triangle) that override the getArea() method and implement their own area calculation formulas. Demonstrate dynamic method dispatch by creating an array of Shape objects and calling the getArea() method on each one.*/

abstract class shape{
    
    abstract double getArea();
}

class circle extends shape{
   double r,pi=Math.PI; 
   
   circle(double R){
      this.r=R; 
   }
   
  double getArea(){
      return pi*r*r;
  }  
    
}

class triangle extends shape{
    double height,base;
    
    triangle(double h,double b){
        height=h;
        base=b;
    }
    
    double getArea(){
        return (height*base*0.5);
    }
    
}
class Rectangle extends shape{
    double length,breath;
    
    Rectangle(double l,double b){
        length=l;
        breath=b;
    }
    
    double getArea(){
        return length*breath;
    }
}
class mainmethod{
    
    public static void main(String args[]){
        circle c=new circle(50);
        System.out.println("The area of circle is "+c.getArea());
        triangle t=new triangle(9.32,5.14);
        System.out.println("The area of triangle is "+t.getArea());
        Rectangle R=new Rectangle(9.32,5.14);
        System.out.println("The area of Rectangle is "+R.getArea());
        
    }
    
}
