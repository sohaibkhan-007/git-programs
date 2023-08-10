class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // Create a stack to store characters

        int n = s.length(); // Get the length of the input string

        for (int i = 0; i < n; i++) { // Iterate through each character in the string
            char c = s.charAt(i); // Get the current character

            if (c == '(' || c == '[' || c == '{') { // If it's an opening bracket
                stack.push(c); // Push it onto the stack
            } else { // If it's a closing bracket
                if (stack.isEmpty()) { // If the stack is empty, there is no corresponding opening bracket
                    return false; // Return false as the string is not valid
                }
                char top = stack.peek(); // Get the top element from the stack

                // Check if the current closing bracket matches the top opening bracket
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop(); // Remove the matching opening bracket from the stack
                } else {
                    return false; // Return false as the brackets don't match
                }
            }
        }

        return stack.isEmpty(); // If the stack is empty, all brackets are matched and the string is valid
    }
}