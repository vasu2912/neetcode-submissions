class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char ch: charArray){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                char topElem = stack.peek();
                if (ch == ')' && topElem == '(' || 
                ch == '}' && topElem == '{' ||
                ch == ']' && topElem == '['){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }

            }
        }
        return stack.isEmpty();
    }
}
