import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(sum(n));
    }
  public static int sum(int x)
  {
    int sum=0;
    for(int i=0;i<=x;i++)
    {
      sum=sum+i;
    }
      return sum;
    }
	
}