class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder st=new StringBuilder();
        while(columnNumber>0)
        {
            int r=(columnNumber-1)%26;
            st.append((char)(r+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return st.reverse().toString();
    }
}