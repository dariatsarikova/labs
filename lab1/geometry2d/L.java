package geometry2d;
public interface Figure{
double area();
void Show();
}

class Circle implements Figure{
Double radius;

Circle(double radius){
this.radius=radius;
}

public String toString(){return "Circle";}

double area(){
return ((radius*radius)*3.14);
}
void Show(){
	System.out.println(radius);
}
}

class Rectange implements Figure{
Double length;
Double width;

Rectange(double length, double widht){
this.length=length;
this.width=width;
}
public String toString() {return "Rectange";}

double area(){
return (length*width);
}
void Show(){
	System.out.println(length,width);
}
}
