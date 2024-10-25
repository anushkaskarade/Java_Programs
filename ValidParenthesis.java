import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        
        Stack<Character> stack=new Stack<Character>();

        for(char c:s.toCharArray())
        {
         
         if(c=='(')
          {
            stack.push(')');
          }
         else if(c=='{')
         {
            stack.push('}');
         }
         else if(c=='[')
          {
            stack.push(']');
          } 

        else if(stack.isEmpty() || stack.pop() !=c)
        {
            return false;
        }
    }    

     return stack.isEmpty();
    }  
      
}

class validParenthesis{

  public static void main(String[] args) {
      
    Solution s=new Solution();

    s.isValid("()");
  }

}