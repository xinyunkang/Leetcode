
public class GasStation {
	 //https://www.cnblogs.com/boring09/p/4248482.html
    /*
    非常经典的一道题。可以转换成求最大连续和做，但是有更简单的方法。基于一个数学定理：

如果一个数组的总和非负，那么一定可以找到一个起始位置，从他开始绕数组一圈，累加和一直都是非负的
（证明貌似不难，以后有时间再补）

有了这个定理，判断到底是否存在这样的解非常容易，只需要把全部的油耗情况计算出来看看是否大于等于0即可。

那么如何求开始位置在哪？

注意到这样一个现象：

1. 假如从位置i开始，i+1，i+2...，一路开过来一路油箱都没有空。说明什么？说明从i到i+1，i+2，...肯定是正积累。
2. 现在突然发现开往位置j时油箱空了。这说明什么？说明从位置i开始没法走完全程(废话)。那么，我们要从位置i+1开始重新尝试吗？不需要！为什么？因为前面已经知道，位置i肯定是正积累，那么，如果从位置i+1开始走更加没法走完全程了，因为没有位置i的正积累了。同理，也不用从i+2，i+3，...开始尝试。所以我们可以放心地从位置j+1开始尝试。
    
    */
	public int canCompleteCircuit(int[] gas, int[] cost) {
	       int remain=0;  //the fuel left
	        int debt=0;  //the debt from unfinished trip
	        int start=0;
	        for(int i=0;i<gas.length;i++){
	            remain+=gas[i]-cost[i];
	            if(remain<0){
	                debt+=remain; //NOT debt=remain, for more parts remain<0.
	                remain=0;
	                start=i+1;
	            }
	        }
	        
	        return remain+debt>=0?start:-1;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GasStation g = new GasStation();
		System.out.println(g.canCompleteCircuit(new int[] {1,2,3,4,5}, new int[] {3,4,5,1,2}));
	}

}
