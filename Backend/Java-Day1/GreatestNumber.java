import java.util.*;
public class GreatestNumber{
  public static void main(String[] args) {
     int num1,num2;
     Scanner sc=new Scanner(System.in);
     num1=sc.nextInt();
     num2=sc.nextInt();
     if(num1>num2) {
      System.out.println(num1+" is Greatest.");
      }
      else {
      System.out.println(num2+" is Greatest.");
      }
   }
}