import java.util.*;

  public class anybase{
      
      public static int s10(int n,int sB)
      {
          int r;
          int i=0;
          int ans=0;
          while(n>0)
          {
              r=n%10;
              ans=ans+r*(int)Math.pow(sB,i);
              i++;
              n/=10;
          }
          // System.out.println(ans);
          return ans;
          
      }
      
      public static int con(int n,int sB,int dB)
{
    int r;
    int i=0;
    int ans=0;
    while(n>0)
    {
        r=n%dB;
        ans=ans+r*(int)Math.pow(10,i);
        i++;
        n/=dB;
    }
    return ans;
}
  
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sB = scn.nextInt();
     int  dB= scn.nextInt();
     int f=0;
     
     if(sB!=10)
     {
         n=s10(n,sB);
         f=con(n,sB,dB);
     }
     
     else
     {
          f=con(n,sB,dB);
     }
     System.out.println(f);
   }   
  }