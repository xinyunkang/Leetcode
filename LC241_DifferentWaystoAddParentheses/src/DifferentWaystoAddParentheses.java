import java.util.*;

public class DifferentWaystoAddParentheses {
	public List<Integer> diffWaysToCompute(String input) {
		//back tracking
        List<Integer> res= new ArrayList<>();
        if(input==null||input.length()==0) return res;
        char[] arr= input.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='+'||arr[i]=='-'||arr[i]=='*'){
                List<Integer> al= diffWaysToCompute(input.substring(0,i)); //get the list of res for first half
                List<Integer> bl= diffWaysToCompute(input.substring(i+1)); //get the list of res for second half
                for(Integer x: al){
                    for(Integer y: bl){
                        if(arr[i]=='+'){
                            res.add(x+y);
                        }else if(arr[i]=='-'){
                            res.add(x-y);
                        }else{
                            res.add(x*y);
                        }
                    }
                }                
            }
        }
        if(res.size()==0){  //contains number only.
            res.add(Integer.valueOf(input));  //cast from string to int
        }        
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
