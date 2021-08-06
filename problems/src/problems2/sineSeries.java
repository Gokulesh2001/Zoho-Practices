package problems2;

public class sineSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int x=25,n=7;
		
		int factorial=1,power=x;
		int result=0;
		int var=1;
		for(int i=0;i<n;i++) {
			
			int temp=(1/factorial)*power;
			if(i%2==0) {
				result+=temp;
			}
			else {
				result-=temp;
			}
			
			factorial*=(var+1)*(var+2);
			power*=x*x;
			var+=2;
		}
		System.out.println(result);
	}

}
