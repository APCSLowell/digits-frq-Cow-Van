import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		digitList = new ArrayList<>();
		String s = String.valueOf(num);
	    	for (int i = 0; i < s.length(); i++) {
	      		digitList.add(Integer.parseInt(s.substring(i, i + 1)));
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		int last = digitList.get(0);
	    	for (int i = 1; i < digitList.size(); i++) {
	     	if (last >= digitList.get(i)) {
			return false;
	      	}
	
	      	last = digitList.get(i);
    		}
	
	    return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
