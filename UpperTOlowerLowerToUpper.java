public class UpperTOlowerLowerToUpper {
    public static void main(String args[]) {
     String s=" vIJAY vERMA ";
     String S2=" ";
     for(int i=0;i<=s.length()-1;i++){
         char ch=s.charAt(i);
         if(ch!=' '){
             if(ch>='a'&&ch<='z')
             ch=(char)(ch-32);
             else
             ch=(char)(ch+32);
         }
         S2=S2+ch;
     }

      System.out.print(S2);
    }
}