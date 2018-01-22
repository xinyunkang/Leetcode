
public class ZigZagConversion {
	  /*
    0       4
    1 3     5 7
    2       6
    
    0        6
    1   5    7    11
    2 4      8 10
    3        9
    
   loopSize= 2* numRows -2
    for numRows =3, loopSize=4
    for numRows =4, loopSize=6
    
    if(i<loopSize)  //like 0123  6789
        index= i% loopSize
     
    if(i>=loopSize)  //like 4,5  10,11
       index=loopSize-i%loopSize 
    
*/
public String convert(String s, int numRows) {
    if(numRows<=1) return s;
    int loopSize=2*numRows-2;
    char[] ca=s.toCharArray();
    StringBuilder[] sb = new StringBuilder[numRows]; //use stringbuilder array.
    for(int i=0;i<numRows;i++){
        sb[i]= new StringBuilder("");
    }
    for(int i=0;i<ca.length;i++){
        int index= i%loopSize;
        if(index>=numRows){ //NOT >= loopSize
            index=loopSize-index;               
        }
        sb[index].append(ca[i]);
    }
    
    for(int i=1; i<numRows;i++){  
        sb[0].append(sb[i]);  //add result to the first row of sb.
    }
    
    return sb[0].toString();
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZigZagConversion zzc = new ZigZagConversion();
		//System.out.println(zzc.convert("PAYPALISHIRING", 3));
		System.out.println(zzc.convert("A", 1));
	}

}
