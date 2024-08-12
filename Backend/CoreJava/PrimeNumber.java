import java.util.*;
public class PrimeNumber {
 public static void main(String args[]) {
   int number,i,count;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number : ");
   number=sc.nextInt(); 
   if(number==0 || number==1) {
   System.out.println(number+" is not a Prime Number");
   }
   else {
   count=0;
   for(i=2;i<=number;i++) {
      if(number%i==0) {
          count++;
       }
      }
      if(count==1) {
        System.out.println(number+" is a Prime Number");
       }
      else {
        System.out.println(number+" is not a Prime Number");
        }
      }
    }
  }
       
        