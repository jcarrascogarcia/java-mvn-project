package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
  public static String triangulo(int a, int b, int c)
  {
    String result = "";
    if (a + b > c && a + c > b && b + c > a)
    {     
      if (a == b && a == c && b == c)
      {
        result = "es un triangulo equilatero";
      }
    }
    else
    {
      result = "error no es un triangulo";
    }
    
    return result;
  }
  
    public static void main( String[] args )
    {
        System.out.println( "Hello World desde replit!" );
    }
}
