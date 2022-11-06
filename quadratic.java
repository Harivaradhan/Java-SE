package operatorjava;
import java.util.*;
import java.math.*;
public class oper {
public static void main(String[] args)
{
float a,b,c;
double r1,r2;
System.out.print("enter 3 numbers for coefficient");
Scanner scanner= new Scanner(System.in);
a= scanner.nextFloat();
b= scanner.nextFloat();
c=scanner.nextFloat();
r1=(-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
r2=(-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
System.out.print("root r1 is"+r1);
System.out.print("root r2 is"+r2);
}
}
