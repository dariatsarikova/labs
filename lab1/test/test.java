import java.util.Scanner;

public class test{
public static void main(String[] args){
Rectange r = new Rectange(0,0);
Circle c = new Circle(0);
Figure[] s = {r,c};
System.out.print("Rectange: ");
Scanner in = new Scanner(System.in);
System.out.print("Input length: ");
double l = in.nextDouble();
r.length = l;
System.out.print("Input width: ");
double w = in.nextDouble();
r.width = w;
System.out.print("Circle: ");
System.out.print("Input radius: ");
double rad = in.nextDouble();
c.radius = rad;
System.out.println("Areas Figure");
for (int i=0; i<s.length;i++) {
    System.out.println(s[i].toString() + ":" + s[i].area());
}
System.out.println(c.Show());
System.out.println(r.Show());
}
}