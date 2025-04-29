import java.util.*;
import java.lang.*;

class Solution {
    public char findTheDifference(String s, String t) {
        
       List<Character> list =new ArrayList<>();

       for(int i=0;i<t.length();i++)
       {
          list.add(t.charAt(i));
       }

       for(int i=0;i<s.length();i++)
       {
          if(list.contains(s.charAt(i)))
          {
             list.remove(Character.valueOf(s.charAt(i)));
          }
       }

       char arr[]=new char[1];
       for(int i=0;i<list.size();i++)
       {
           arr[0]=list.get(i);
       }
       return arr[0];

    }
}
