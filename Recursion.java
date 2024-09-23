import java.io.*;

class Recursion
{
  static int factorial(int n)
  {
    if(n==0) { return 1; }
    else { return n*factorial(n-1); }
  }

  static double power(double x, int n)
  {
    if(n==0)
      { return 1; }
    else if(n<0)
      { return 1.0/power(x,-n); }
    else // general positive n
    {
      return x*power(x,n-1);
    }
  }

  static double power2(double x, int n)
  {
    if(n==0)
      { return 1; }
    else if(n<0)
      { return 1.0/power2(x,-n); }
    else // general positive n
    {
      if(n%2==0) // if n is even
      {
        double y=power2(x,n/2);
        return y*y;
      }
      else // if n is odd
      {
        double y=power2(x,(n-1)/2);
        return x*y*y;
      }
    }
  }

  static void printbackwards(int n)
  {
    if(n<10)
      { System.out.print(n); }
    else
    {
      int lsd=n%10;
      int rest=n/10;
      System.out.print(lsd);
      printbackwards(rest);
    }
  }

  static long fib(int n)
  {
    if(n<=1) { return n; }
    else { return fib(n-1)+fib(n-2); }
  }

  static long fib2(int n)
  {
    if(n<=1) { return n; }
    else
    {
      long [] f=new long[n+1];
      f[0]=0; f[1]=1;
      for(int i=2; i<=n; i++)
        { f[i]=f[i-1]+f[i-2]; }
      return f[n];
    }
  }

  public static void main(String [] args)
  {
    System.out.println(factorial(4));
    //System.out.println(factorial(-4));
    System.out.println("should be 64: "+power(2,6));
    System.out.println("should be 64: "+power2(2,6));
    printbackwards(8675309);
    System.out.println("");
    System.out.println("");
    for(int n=0; n<=1000; n++)
    { System.out.println("fib2("+n+")="+fib2(n)); }
  }

}




