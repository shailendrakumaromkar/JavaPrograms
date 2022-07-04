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
		
		
		
		
		
		String s1= "Neha Omkar";
		char[] c1=s1.toCharArray();
		Map<Character, Integer> in= new HashMap();
		
		for(char cs: c1) {
			if(cs==' ')
				continue;
			
			if(in.containsKey(cs)) {
				in.put(cs, in.get(cs)+1);
			} else {
				in.put(cs, 1);
			}
		}
		
		System.out.println(in);
		
		
		
		
		
		
		
		String p ="Ghanishka Omkar";
		char [] cp = p.toCharArray();
		
		
		
		Map<Character, Integer> pari = new HashMap();
		
		for(char par : cp) {
			if(par==' ')
				continue;
			
			if(pari.containsKey(par)) {
				pari.put(par,  pari.get(par)+1);
			} 
			else {
				pari.put(par, 1);
			}
		}
		
		System.out.println(pari);
		
		
		
		
		
		String name = "Pari Ghanishka";
		
		char[] pg = name.toCharArray();
		
		Map<Character, Integer> i = new HashMap<Character, Integer>();
		
		for(char cad : pg) {
			if(cad ==' ')
				continue;
			
			if(i.containsKey(cad)) {
				i.put(cad,  i.get(cad)+1);
			}
			else {
				i.put(cad, 1);
			}
		}
		
		System.out.println(i);
		
		
		
		}
	}


