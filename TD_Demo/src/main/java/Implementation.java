
public class Implementation implements Adder,Subtractor {
	private long result;

	public long add(long...ls) {
		 result =0;
	
		
		for(long temp : ls) {
			result += temp;
			
		}
		return result;
	}
	public long subtract(long...ls){
		long result =ls[0];
		
		for(int i=1;i < ls.length;i++) {
		  result -=ls[1];
		
		}
     
		return result;
}
}