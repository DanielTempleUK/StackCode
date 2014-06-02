package frequency;

import java.util.ArrayList;
import java.util.List;
public class MostFrequent {

	public void fun(final List<Integer> l1){
		l1.clear();
	}

	public static void main(final String[] args){
		final List<Integer> l1=new ArrayList<Integer>();
		l1.add(5);
		l1.add(6);
		System.out.println("Before = "+l1.size());
		final MostFrequent vc=new MostFrequent();
		vc.fun(l1);
		System.out.println("After = "+l1.size());
	}
}