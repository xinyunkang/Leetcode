import java.util.HashMap;

public class CountAndSay {
	public static String countAndSay(int n) {
		StringBuilder curr=new StringBuilder("1");
    	StringBuilder prev;
    	int count;
    	char say;
        for (int i=1;i<n;i++){
        	prev=curr;  //record the previous count+say
 	        curr=new StringBuilder();       
 	        count=1;
 	        say=prev.charAt(0); //the first say need to be counted.
 	        
 	        for (int j=1,len=prev.length();j<len;j++){ //j starts from the second number 
 	        	if (prev.charAt(j)!=say){
 	        		curr.append(count).append(say); //append the count of current say+say.
 	        		count=1;
 	        		say=prev.charAt(j); //set the new say to the diff value one.
 	        	}
 	        	else count++;
 	        }
 	        curr.append(count).append(say);
        }	       	        
        return curr.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(4));
		
	}

}
