import java.util.Stack;
class Solution {
    

    public boolean isValid(String s) {
        Stack<Character>StringStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(StringStack.isEmpty() == true){
                StringStack.push(c);
            }
            else{
                char preview = StringStack.peek();
                switch(preview){
                    case '(':
                        if (c == ')'){
                            StringStack.pop();
                        }else{
                            StringStack.push(c);
                        }
                    break;
                    case '{':
                        if (c == '}'){
                            StringStack.pop();
                        }else{
                            StringStack.push(c);
                        }
                    break;

                    case '[':
                        if (c == ']'){
                            StringStack.pop();
                        }else{
                            StringStack.push(c);
                        }
                    break;
                    default:
                        return(false);
                }
            }
        }
        if(StringStack.isEmpty() == true){
            return true;
        }
        else{
            return false;
        }
        
    }

}