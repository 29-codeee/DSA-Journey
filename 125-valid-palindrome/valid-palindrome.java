class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        char c[]=new char[n];
        s=s.toLowerCase();
        c=s.toCharArray();
        char ch[]=new char[n];
        int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            if((c[i]>=48&&c[i]<=57)||(c[i]>=97&&c[i]<=122))
             ch[j++]=c[i];
             else
             continue;
        }
        for(int i=0,m=j-1;i<j-1;i++,m--)
        {
            if(ch[i]!=(ch[m]))
            k++;
           
        }
        if(k>=1)
        return false;
        else
        return true;
    }
}