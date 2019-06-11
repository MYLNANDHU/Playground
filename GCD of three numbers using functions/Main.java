import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int result=gcd_of_2_numbers(n1,n2);
      System.out.print(gcd_of_2_numbers(n1,n2));
    }
  public static int gcd_of_2_numbers(int n1,int n2)
  {
    int min;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if((n1%min==0&&n2%min==0))
      {
        return min;
      }
      --min;
    }
    return 0;
  }
}
      
  
