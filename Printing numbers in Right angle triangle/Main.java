import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int row;
      int col;
      for(row=1;row<=n;row++)
      {
        for(col=1;col<=row;col++)
        {
          System.out.print(row);
        }
         System.out.print("\n");
      }
	}
}