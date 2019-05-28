import java.util.Scanner;
class Main
{
  public static int square_num(int n)
  {
    int res;
    res=n*n;
    return res;
  }
  public static void main (String[] args)
    {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int square=square_num(n);
    n=square;
    System.out.println(n);
	 // Type your code here   
	} 
}