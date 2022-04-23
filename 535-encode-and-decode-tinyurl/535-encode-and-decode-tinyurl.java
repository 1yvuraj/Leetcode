public class Codec {
    String[] arr; //To give store the components and give the code to that component of that component(which is the index of the location at which that component is present)
    StringBuilder encoded; //To store the encoded url
    StringBuilder decoded; //To store the decoded url
    int ctr;
    StringBuilder initial; //To store the initial of the url which could be either of      "https://" or "http://"
    int lastSlash; //To check if there is a slash at the last of the url
    public Codec(){
        arr=new String[100000];
        encoded=new StringBuilder();
        decoded=new StringBuilder();
        initial=new StringBuilder();
        ctr=0;
        lastSlash=0; //Initially we assume that there is no slash present at the last of the url
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int slash=0;
        int loc=0;
        for(int i=0;i<longUrl.length();i++) { //This loop has been used to store the initial of the url whether it is https:// or http://
            encoded.append(longUrl.charAt(i));
            if(longUrl.charAt(i)=='/'){
                slash++;
            }
            if(slash==1) {
                loc=i;
                break;
            }
        }
        if(longUrl.charAt(longUrl.length()-1)=='/'){
            lastSlash=1; //If there is a slash at the end of the url then we make lastSlash as 1 else it remains 0
        }
        initial.append(encoded);
        String ns=longUrl.substring(loc+2,longUrl.length()); //We extract the string which is present after the initials 
        String[] parts=ns.split("/"); // We split the url with the occurrence of every separator which is a slash and store every separated comment in an array
        for(String part:parts) {
            arr[ctr]=part;
            encoded.append("/");
            encoded.append(Integer.toString(ctr));
            ctr++;
        }
        return encoded.toString(); //This gives the encoded string like https://1/2/3/4 where 1,2,3 and 4 represent the index of the array where the actual component is present
    }
    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        decoded.append(initial);
        for(int i=0;i<ctr;i++){ //In this loop, we decode the value of every number(1,2,3,4..) with the help of array and add the decoded component to the decoded variable
            decoded.append("/");
           decoded.append(arr[i]);  
        }
        if(lastSlash==1){ //If there is a last slash at the end of url , then we manually append it 
            decoded.append("/");
        }
        return decoded.toString(); // Gives the finally decoded string
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));