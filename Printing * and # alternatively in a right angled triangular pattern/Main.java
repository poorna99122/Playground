
import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int row;
      int col;
      for(row=1;row<=n;row++)
      {
        
          if(row==1)
          {
          System.out.print("*");
          }
          else if(row==2)
          {
           System.out.print("#*"); 
          }
          else if(row==3)
          {
           System.out.print("#*#"); 
          }
          else if(row==4)
          {
           System.out.print("*#*#"); 
          }
          else if(row==5)
          {
           System.out.print("*#*#*"); 
          }
         else if(row==6)
          {
           System.out.print("#*#*#*"); 
          }
        
        System.out.print("\n");
      }
  		// Type your code here
    }
}