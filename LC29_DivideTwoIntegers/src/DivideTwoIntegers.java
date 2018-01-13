
public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
        int sign=1;
        
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0)){
            sign=-1;
        }
        //overflow: 1. divisor=0
        //2. dividend = INT_MIN and divisor = -1 (because abs(INT_MIN) = INT_MAX + 1).
        if(divisor==0||(dividend==Integer.MIN_VALUE&&divisor==-1))
            return Integer.MAX_VALUE;        
        
        
        long ldividend= Math.abs((long)dividend);  //NOT (long)Math.abs(dividend)
        long ldivisor =  Math.abs((long)divisor);
        if(ldividend==0||ldividend<ldivisor) return 0;
        
        
        long lres=divide(ldividend, ldivisor);
        int res=0;
        if(lres>Integer.MAX_VALUE){
            res= (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        else{ 
            res= (int) (lres*sign);
        }
        return res;
    }
    
    public long divide(long dividend, long divisor){
        if(dividend<divisor) return 0;
        long multiple=1;
        long sum=divisor;
        
        while(sum+sum<=dividend){
            sum+=sum;
            multiple+=multiple;
        }
        return multiple+divide(dividend-sum, divisor);
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideTwoIntegers dti= new DivideTwoIntegers();
		System.out.println(dti.divide(-2147483648, 1));
	}

}
