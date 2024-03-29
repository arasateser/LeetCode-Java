class validParantheses {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<Character>();

        for(char c : s.toCharArray() ) {
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop() !=c )
                return false;
        }
        return stack.isEmpty();
    }
}
