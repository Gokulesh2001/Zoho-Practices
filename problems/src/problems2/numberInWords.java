package problems2;

public class numberInWords {

	static String ones[]= {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten ","eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nighteen "};
	static String tens[]= {"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","nighty "};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n=38237764;
		
		numToWords(n);
	}
	
	static void numToWords(long n) {
		if(n==0) {
			System.out.println("Zero");
			return;
		}
		String ans="";
		
		ans+=numToWordHelper((int)(n/10000000)%10,"crore ");
		ans+=numToWordHelper((int)(n/100000)%100,"lakhs ");
		ans+=numToWordHelper((int)(n/1000)%100,"thousand ");
		ans+=numToWordHelper((int)(n/100)%10,"hundred ");
		
		if(n>100&&n%100!=0) {
			ans+="and ";
		}
		
		ans+=numToWordHelper((int)n%100,"");
		
		
		
		System.out.println(ans);
		
		
	}
	static String numToWordHelper(int n,String s) {
		String ans="";
		if(n>19) {
			ans+=tens[n/10]+ones[n%10];
		}
		else {
			ans+=ones[n];
		}
		
		if(n!=0) {
			ans+=s;
		}
		return ans;
	}

}
