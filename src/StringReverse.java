
public class StringReverse {
	
	//Method1
	public static void main(String args[]) {
		String s1="Shailendra";
		String s2 = new StringBuffer(s1).reverse().toString();
		System.out.println(s2);
		
		
		
		//Method2
		
		String s3="";
		for(int i=s1.length()-1;i>=0;i--) {
			s3=s3+s1.charAt(i);
		}
		System.out.println(s3);
		
	}

}
