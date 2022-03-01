class Solution {
    public String reverseWords(String s) {
          String fin = "";
    String arr[] = s.split(" ");
    for(int i = 0;i<arr.length;i++){
        StringBuilder str = new StringBuilder(arr[i]);
        fin += (str.reverse()).toString();
        fin += " ";
    }
    return fin.substring(0,fin.length()-1);  
    }
}