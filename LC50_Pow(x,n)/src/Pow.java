
public class Pow {

	 public double myPow(double x, int n) {
	        long N=n;  //use long, not int.
	        if(N<0){
	            x=1/x;
	            N=-N;
	        }
	        
	        double currentProduct=x;  //start with x, not 1
	        double ans=1;
	        
	        for(long i=N;i>0;i=i/2)   // divide 2 in each loop.
	        {
	            if((i%2)==1){
	                ans*=currentProduct;
	            }
	            
	            currentProduct*=currentProduct;  //NOT else
	            
	        }
	        
	        return ans;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
