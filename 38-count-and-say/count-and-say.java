class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=2;i<=n;i++){
            StringBuilder next=new StringBuilder();
            
            int x=0;
            while(x<s.length())
            
            {
            char digit=s.charAt(x);
             int count=0;
                
            while(x<s.length()&&digit==s.charAt(x))
            {
                
                count++;
                x++;
            }
            next.append(count);
            next.append(digit);
        }
        s=next.toString();
        }
        return s;
    }
}