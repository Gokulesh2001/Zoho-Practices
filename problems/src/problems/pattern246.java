package problems;

public class pattern246 {

	    public static void main(String[] args) {
	    	
	    	int n=4;
	    	for(int i=1;i<=n;i++) {
	    		System.out.print(i+" ");
	    		for(int j=2;j<=n+2;j+=2) {
	    			
	    				System.out.print(j);
	    				System.out.print(" ");
	    		
	    		}
	    		System.out.println();
	    	}
	    }
}
