package operatorjava;
import java.util.*;
import java.math.*;
public class oper {
public static void main(String[] args)
{
float a,b,c;
double s,area;
Scanner scanner= new Scanner(System.in);
System.out.println("enter the 3 sides of triangle ");
a=scanner.nextFloat();
b=scanner.nextFloat();
c=scanner.nextFloat();
s=(1/2f)*(a+b+c);
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.print(area);
}
}
