import java.util.*;
public class Arr{
public static void main(String []args){

int sum=0;
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}


for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
}
System.out.print(sum);
}
}