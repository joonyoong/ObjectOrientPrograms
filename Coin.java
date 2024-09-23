import java.io.*;

class Coins
{
  static int [] coins={1,5,10,11,25,50,100};
  static int M(int n)
  {
    // base cases
    if(n==0) { return 0; }
    // each coin
    for(int i=0; i<coins.length; i++)
    {
      if(coins[i]==n) { return 1; }
    }

    // recursive case
    int minsofar=n;
    for(int i=0; i<coins.length && coins[i]<n; i++)
    {
      int thismin=M(n-coins[i])+1;
      if(thismin<minsofar) { minsofar=thismin; }
    }
    return minsofar;
  }

  static int M2(int n)
  {
    // base cases
    if(n==0) { return 0; }
    int [] m=new int[n+1];
    m[0]=0;
    m[1]=1;
    for(int j=2; j<=n; j++)
    {
      int minsofar=j;
      for(int i=0; i<coins.length && coins[i]<=j; i++)
      {
        int thismin=m[j-coins[i]]+1;
        if(thismin<minsofar) { minsofar=thismin; }
      }
      m[j]=minsofar;
    }
    return m[n];
  }

  public static void main(String [] args)
  {
    for(int n=0; n<=1000; n++)
    { 
      //System.out.println("M("+n+")="+M(n)); 
      System.out.println("M2("+n+")="+M2(n)); 
    }
    System.out.println("M2("+1000000000+")="+M2(1000000000)); 

  }

}