import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupFromArrayList {

	public static void main(String args[]) {
		
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("a");
		l.add("c");
		l.add("b");
		
		Set<String> s = new LinkedHashSet<>(l);
		System.out.println(s);
		
	}
}
