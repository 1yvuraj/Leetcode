class Solution {
    public static boolean isNumeric(String str)
    {
        if(str.isEmpty()) return false;
        
        for (char c : str.toCharArray())
        {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
    public String discountPrices(String sentence, int discount) {
        
        
        String[]arr=sentence.split(" ");
        
        for(int i=0;i<arr.length;i++)
        {
            
             if(arr[i].charAt(0)=='$' && isNumeric(arr[i].substring(1)))
            {
                  double dc=(double)(Double.parseDouble(arr[i].substring(1))*(discount/100.0));
                  double ap=(Double.parseDouble(arr[i].substring(1))-dc);
                  if(i==arr.length-1 && arr[arr.length-1].charAt(0)=='$')arr[i]="$"+String.format("%.2f", ap);
                 else arr[i]="$"+String.format("%.2f", ap);
                 
               
            }else{
                 
                 arr[i]=arr[i];
                 
             }
           
        }
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<arr.length;i++)
         {
            if(i!=arr.length-1)sb.append(arr[i]+" ");  
             else sb.append(arr[i]);  
         }
        return sb.toString();
    }
}
// class Solution {
// public static boolean isNumeric(String str)
//     {
//         if(str.isEmpty()) return false;
        
//         for (char c : str.toCharArray())
//         {
//             if (!Character.isDigit(c)) return false;
//         }
//         return true;
//     }
    
    
//     public String discountPrices(String sentence, int discount) {
//         String[] words = sentence.split(" ");
//         for(int i=0;i<words.length;i++){
//             if(words[i].charAt(0)=='$' &&  isNumeric(words[i].substring(1))){
//                 // System.out.println(words[i]);
//                 double price = Double.parseDouble(words[i].substring(1));
//                 double discount_value = price*(discount/100.0);
//                 price -= discount_value;
//                 words[i] = "$" + String.format("%.2f", price);
//                 // System.out.println(price);
//             } 
            
//         }
        
//         StringBuilder sb = new StringBuilder();
//         String result;

//         for (String s : words) {
//             sb.append(s).append(' ');
//         }
//         result = sb.toString();
        
//         return result.substring(0,result.length()-1);
//     }

// }