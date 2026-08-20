class Solution {
    public int evalRPN(String[] tokens) {
        char ch;
        int ans = 0;
        int op1 = 0;
        int op2 = 0;

        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            //ch =str.charAt(0);
            if (str.equals("+") || str.equals("-") ||
                    str.equals("*") || str.equals("/")) {
                if (!stack.isEmpty()) {
                    op1 = stack.pop();
                    op2 = stack.pop();
                    if (str.equals("+")) {
                        stack.push(op1 + op2);
                    } else if (str.equals("-")) {
                        stack.push(op2 - op1);
                    } else if (str.equals("*")) {
                        stack.push(op1 * op2);
                    } else if (str.equals("/")) {
                        stack.push((int) (op2 / op1));
                    }
                }
            } else {
                stack.push(Integer.parseInt(str));

            }
        }

        ans = stack.pop();

        return ans;

    }
}
