package problems2;

public class sineSeriesSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=245;
		int n=17;
  System.out.println(sin(x,n));
	}
	
	static double sin(double x,int n) {
		double result=x;
		
		double factorial=1,var=1;
		double power=x*x;
		double pow=x;
		for(int i=1;i<n;i++) {
			power*=x*x;
			factorial*=(var+1)*(var+2);
			var+=2;
			double temp=(double)(1/factorial)*(pow*power);
			if(i%2==0)result+=temp;
			else
				result-=temp;
		}
		return result;
	}

}
