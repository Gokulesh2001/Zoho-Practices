package problems2;

public class substringIfRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str1="bose";
          String str2="sobe";
          String both=str1+str1;
          
          System.out.println(both.indexOf(str2)==-1?"NO":"YES");
          
//          System.out.println(both.substring(both.indexOf(str2),both.indexOf(str2)+str2.length()));

	}

}
