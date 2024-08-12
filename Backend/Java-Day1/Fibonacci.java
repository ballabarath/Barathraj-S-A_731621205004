import java.util.*;
public class Fibonacci {
 public static void main(String args[]) {
   int i,j,first=0,second=1,third,limit;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a limit : ");
   limit=sc.nextInt();
   System.out.println("Fibanocci Series ");
   System.out.print(first+" "+second);
   for(i=0;i<limit;i++) {
   third=first+second;
   System.out.print(" "+third);
   first=second;
   second=third;
   }
  }
}
 