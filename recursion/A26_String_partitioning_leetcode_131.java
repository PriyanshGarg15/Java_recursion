import java.util.*;
public class A26_String_partitioning_leetcode_131 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        List<String> ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<List<String>>();  
        ps(s, ll, ans);
        System.out.println(ans);
    }
    public static void ps(String s, List<String> ll,List<List<String>> ans)
    {
        if(s.length()==0)
        {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=0;i<s.length();i++){
                String sb=s.substring(0, i+1);
                if((P(sb))== true)
                { 
                    ll.add(sb);
                    ps(s.substring(i+1), ll, ans);
                    ll.remove( ll.size()-1);
                }
            }
        }
        public static boolean P(String sb)
        {
          int i=0;
          int j=sb.length()-1;
          while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
          }
          return true;
        }
    }