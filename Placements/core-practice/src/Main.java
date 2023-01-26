import java.util.ArrayList;
import java.util.List;

public class Main{

	public static void main(String[] args) {
	   
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(25);
		list.add(7);
		list.add(-10);
		
		System.out.println(list.stream().min((n1,n2)-> Integer.compare(n1, n2)).get());
		
		
		
		
	}
	
	
	
}
