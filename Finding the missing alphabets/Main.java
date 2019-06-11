import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int str_len=sb.length();
      int freq[]=new int[26];
      for(int idx=0;idx<26;idx++)
      {
        freq[idx]=0;
      }
      for(int idx=0;idx<str_len;idx++)
      {
        if(sb.charAt(idx)>='a'&&sb.charAt(idx)<='z')
        {
          freq[sb.charAt(idx)-'a']++;
        }
        else if(sb.charAt(idx)>='A'&&sb.charAt(idx)<='Z')
        {
            freq[sb.charAt(idx)-'A']++;
        }
        

      }
      for(int i=0;i<26;i++)
      {
        if(freq[i]==0)
        {
          char missing_alphabet=(char)(i+'a');
          System.out.print(missing_alphabet+" ");
        }
      }
        
    }
}