import java.util.LinkedList;
import java.util.Collection;

public class CollectionPractical1{
	public CollectionPractical1(){
		Collection <Integer> c = new LinkedList();
		c.add(5);
		c.add(3);
		c.add(1);
		c.add(2);
		c.add(4);
		
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		System.out.println("Does the collection contain 3? " + c.contains(3));
		c.remove(3);        
	}
	public static void main(String[] args){
		new CollectionPractical1();
	}
}
