import java.util.Scanner;
import java.util.*;
 class reverseWord {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     String s=new String();
     System.out.println("enter sentence");
     s=sc.nextLine();
      int i=s.length()-1;
     int k=0,j;
     while(i>=0){
         j=i;
         while(s.charAt(j)!=' '&&j>=0){
             j--;
            if(j==0)
             k=0;
            else
             k=j+1;
         }
         while(k<=i){
             System.out.print(s.charAt(k));
             k++;
         }
         if(i!=0)
         System.out.print(" ");
         i=j-1;
     }
    }
}