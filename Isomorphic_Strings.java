class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length())
        {
            return false;
        }

        HashMap<Character,Character> hmap=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!hmap.containsKey(s.charAt(i)))
            {
               if(!hmap.containsValue(t.charAt(i)))
               {
                  hmap.put(s.charAt(i),t.charAt(i));
               }
               else
               {
                  return false;
               }
            }
            else
            {
                if(hmap.get(s.charAt(i))!=t.charAt(i))
                {
                    return false;
                }
            }
        }

        return true;
    }
}
