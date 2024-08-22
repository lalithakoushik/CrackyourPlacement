class Solution {
    public int calculate(String s) {
        int cur = 0;
        char operator = '+';
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                cur = cur * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) && ch != ' ' || i == s.length() - 1) {
                if (operator == '+') {
                    st.push(cur);
                } else if (operator == '-') {
                    st.push(-cur);
                } else if (operator == '*') {
                    st.push(st.pop() * cur);
                } else if (operator == '/') {
                    st.push(st.pop() / cur);
                }
                operator = ch;
                cur = 0;
            }
        }

        int res = 0;
        while (!st.isEmpty()) {
            res += st.pop();
        }

        return res;
    }
}