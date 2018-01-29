
public class GasStation {
	 //https://www.cnblogs.com/boring09/p/4248482.html
    /*
    �ǳ������һ���⡣����ת������������������������и��򵥵ķ���������һ����ѧ����

���һ��������ܺͷǸ�����ôһ�������ҵ�һ����ʼλ�ã�������ʼ������һȦ���ۼӺ�һֱ���ǷǸ���
��֤��ò�Ʋ��ѣ��Ժ���ʱ���ٲ���

������������жϵ����Ƿ���������Ľ�ǳ����ף�ֻ��Ҫ��ȫ�����ͺ����������������Ƿ���ڵ���0���ɡ�

��ô�����ʼλ�����ģ�

ע�⵽����һ������

1. �����λ��i��ʼ��i+1��i+2...��һ·������һ·���䶼û�пա�˵��ʲô��˵����i��i+1��i+2��...�϶��������ۡ�
2. ����ͻȻ���ֿ���λ��jʱ������ˡ���˵��ʲô��˵����λ��i��ʼû������ȫ��(�ϻ�)����ô������Ҫ��λ��i+1��ʼ���³����𣿲���Ҫ��Ϊʲô����Ϊǰ���Ѿ�֪����λ��i�϶��������ۣ���ô�������λ��i+1��ʼ�߸���û������ȫ���ˣ���Ϊû��λ��i���������ˡ�ͬ��Ҳ���ô�i+2��i+3��...��ʼ���ԡ��������ǿ��Է��ĵش�λ��j+1��ʼ���ԡ�
    
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
