class Solution {
    public boolean isValid(String s) {
    char c[]=s.toCharArray();
    int top=-1;
    char f[]=new char[s.length()];
    for(int i=0;i<c.length;i++){
    if(c[i]=='('||c[i]=='{'||c[i]=='[')
    {
        if(top==f.length-1){
        System.out.println("full");
        break;}
        top++;
        f[top]=c[i];
    }
    else if(c[i]==')')
      {
        if(top==-1){
            return false;
        }
        if(f[top]=='(')
        top--;
          else
        return false;
      }
      else if(c[i]=='}')
      {
         if(top==-1){
            return false;
        }
        if(f[top]=='{')
        top--;
          else
        return false;
      }
      else if(c[i]==']')
      { if(top==-1){
            return false;
        }
        if(f[top]=='[')
        top--;
        else
        return false;
      }
    }
    return top==-1;
    }
    
}
    