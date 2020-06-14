import java.util.ArrayList;
import java.util.List;

public class A {
 public static void main(String[] args) {
	char[] ch1 = new char[] {'G' , 'Q' , 'R'};
	char[] ch2 = new char[] {'R' , 'T' , 'U'};
	List<Character> chars1 = new ArrayList<Character>();
	List<Character> chars2 = new ArrayList<Character>();
	
	for(char c : ch1)chars1.add(c);
	for(char c : ch2)chars2.add(c);
	for(char c : ch1) {
		if(chars2.contains(c)) {
			chars2.remove(Character.valueOf(c));
			chars1.remove(Character.valueOf(c));
		}
	}
	ArrayList<Integer> nums = new ArrayList<Integer>();
	for(char c : chars1)nums.add((int)c);

	for(char c : chars2)nums.add((int)c);
	int sum = 0;
	for(int n : nums)sum += n;
		
	while(sum >= 10) {
		int tempsum  = 0 ;
		String ss = String.valueOf(sum);
		String[] srr = ss.split("");
		for(String x : srr)
			tempsum += Integer.parseInt(x);
		sum = tempsum;
	}
	
	System.out.println(sum);
	
 }
}
