import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DupCharInString {
	
	public static void main (String args[]) {
		
		
		String s= "Shailendra Kumar Omkar";
		
		Map<Character, Integer> input= new HashMap();
		
		char[] c = s.toCharArray();
		
		for(char ch : c) {
			
			if(ch==' ')
				continue;
			if(input.containsKey(ch)) {
				input.put(ch, input.get(ch)+1);
			}
			
			else{
				input.put(ch,  1);
				
			}
			
			
			
//			for(Entry<Character, Integer> e: input.entrySet()) {
//				if(e.getValue()>1) {
//					System.out.println(e.getKey() +" " + e.getValue());
//				}
			}
		System.out.println(input);
		}
	}


