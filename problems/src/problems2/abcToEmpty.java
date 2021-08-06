package problems2;

public class abcToEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="abcababcc";
		System.out.println(isTrue(input));
	}
	
	static boolean isTrue(String input) {
		if(input.equals("")) {
			return true;
		}
		
		if(input.indexOf("abc")==-1) {
			return false;
		}
		
		if(input.indexOf("abc")==0) {
			return isTrue(input.substring(3));
		}
		
		return isTrue(input.substring(0,input.indexOf("abc"))+input.substring(input.indexOf("abc")+3));
	}
	

}
