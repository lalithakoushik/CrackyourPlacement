public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }
    public String compare(String str)
    {
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='#' && sb.length()!=0)
            {
                sb.deleteCharAt(sb.length()-1);
                continue;

            }
            if(ch[i]!='#')
            {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}