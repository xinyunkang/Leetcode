
public class ReverseWordsinaStringIII {
	 public String reverseWords(String s) {
	        if(s==null||s.length()==0) return s;
	        String[] strArr=s.split(" ");
	        StringBuilder sb= new StringBuilder();
	        for(String str : strArr){  //NOT in
	            char[] c= str.toCharArray();
	            reverse(c);
	            sb.append(String.valueOf(c)+" ");
	        }
	        sb.setLength(sb.length()-1);
	        return sb.toString();
	    }
	    
	    public void reverse(char[] ca){
	        int i=0;
	        int j=ca.length-1;
	        while(i<j){
	            char temp=ca[i];
	            ca[i++]=ca[j];
	            ca[j--]=temp;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaStringIII rws= new ReverseWordsinaStringIII();
		System.out.println(rws.reverseWords("Let's take LeetCode contest"));
	}

}
