import java.util.Scanner;
class Main{
  public static int add_num(int n)
  {
   
     int sum=(n*(n+1))/2;
   return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int sum=add_num(n);
      n=sum;
      System.out.println(n);
	}
}