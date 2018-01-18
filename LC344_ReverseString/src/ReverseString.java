
public class ReverseString {
	public String reverseString(String s) {
        //use two pointer swap 
        if(s==null||s.length()==0){
            return s;
        }
        
        int left=0;
        int right=s.length()-1;
        char[] ch= s.toCharArray(); //cast from string to char[]
            
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right]; 
            ch[right]=temp;  
            left++;
            right--;
        }
        
        return new String(ch);  //cast from char[] to string. 
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
