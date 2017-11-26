
public class AddBinary {
	public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {  //how to sum binary.
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2); //if 1 still 1, if 2 keep 0
            carry = sum / 2; //2/2=1, 1/2 =0
        }
        if (carry != 0) sb.append(carry); //001
        return sb.reverse().toString();   //100
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("11","1"));
	}

}
