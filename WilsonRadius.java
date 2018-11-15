import java.io.*;
import java.util.*;
import java.lang.StrictMath.*;
public class WilsonRadius
{  
  public static void main(String args[])
  {
   Scanner areaReader = new Scanner(System.in);
   System.out.println("Enter the area of a circle:");
   double a = areaReader.nextDouble();
   double s = StrictMath.sqrt(a);   
   System.out.println("The radius of this circle is " + s);  
  } 
}

