public class reverseEachWord {
    public static void main(String args[]) {
      String s=" i am vijay verma";
      int j,k=0;
      int i=0;
      while(i<s.length()-1){
          j=i;
          while(s.charAt(j)!=' '&& j<s.length()-1){
              j++;
              if(j== s.length()-1)
                  k=s.length()-1;
                  else
                  k=j-1;
          }
          while(k>=i)
          {
              System.out.print(s.charAt(k));
          k--;
          }
          System.out.print(" ");
          i=j+1;
      }
    }
}