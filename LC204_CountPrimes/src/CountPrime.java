
public class CountPrime {
	public static int countPrimes(int n) {
		Boolean[] notPrime= new Boolean[n];
		int count=0;
		for(int i=2;i<n;i++) {
			if(notPrime[i]==false) { 
				count++;
				for(int j=2;i*j<n;j++) {
					//prime number multiply other number will not be prime.
					notPrime[i*j]=true; //NOT notPrime[j]
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(countPrimes(3));
	}

}
