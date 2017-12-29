import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.*;
public class SolutionTest {
	
	@Test
	public void test1(){
		Solution sol = new Solution();
		ArrayList<Scores> input = new ArrayList<Scores>();
		
		input.add(new Scores("akshay",8));
		input.add(new Scores("akshay",10));
		input.add(new Scores("abishek",10));
		input.add(new Scores("akshay",12));
		input.add(new Scores("akshay",2));
		input.add(new Scores("akshay",4));
		input.add(new Scores("abishek",20));
		input.add(new Scores("akshay",6));
		
		
		
		HashMap<String,Integer> hm = sol.getFinalScores(input);
    	for(Entry<String, Integer> entry : hm.entrySet()){
    		System.out.println(entry.getKey()+": "+entry.getValue());
    	}		
		assertEquals((int)hm.get("akshay"),8);
		assertEquals((int)hm.get("abishek"),15);
		
	}
	
}
