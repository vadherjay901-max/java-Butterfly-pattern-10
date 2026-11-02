// Butterfly pattern
import java.util.Scanner;
class butterflypattern{
 public static void main(String []args){
 Scanner s1 = new Scanner(System.in);
 System.out.println("Enter number ::");
 int row = s1.nextInt();
  for(int i = 1;i<=row;i++){
      for(int j =1;j<=i;j++){
          System.out.print("* ");
      }
      for(int k=row-1;k>=i;k--){
          System.out.print("    ");
      }
      for(int x=1;x<=i;x++){
         System.out.print("* ");
      }
  System.out.println();
  }
  for(int i =1;i<=row;i++){
     for(int j=row;j>=i;j--){
         System.out.print("* ");
     } 
     for(int k=2;k<=i;k++){
         System.out.print("    ");
     }
     for(int x=row;x>=i;x--){
        System.out.print("* ");  
     } 
  System.out.println();
  }
 }
}