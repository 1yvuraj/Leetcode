class Solution {
  public boolean validPalindrome(String str) {
    int s=0;
    int l=str.length()-1;
      while(s<=l)
      {
          if(str.charAt(s)==str.charAt(l))
          {
              s++;
              l--;
              
          }
          else
          {
              return validPalindrome(str,s+1,l)||validPalindrome(str,s,l-1);
          }
          
      }
      return true;
  }
  public boolean validPalindrome(String str,int s,int l) {
   
    while (s <= l)
    {
      if (str.charAt(s) != str.charAt(l))
      {
       
        return false;
        

      }
      s++;
      l--;
    }

    return  true;

  }
  
}

