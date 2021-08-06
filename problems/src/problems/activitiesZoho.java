package problems;

import java.util.*;
import java.io.*;

class activities{
	int a;
	int b;
	activities(int a,int b){
		this.a=a;
		this.b=b;
	}
}
public class activitiesZoho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      activities act[]=new activities[4];
      act[0]=new activities(0,4);
      act[1]=new activities(5,6);
      act[2]=new activities(0,7);
      act[3]=new activities(6,7);
      int n=act.length;
      Arrays.sort(act,new Comparator<activities>() {
    	  public int compare(activities a,activities b) {
    		  
    		  return a.a-b.a;
    	  }
      });
      
      
      ArrayList<ArrayList<activities>> list=new ArrayList<>();
      for(int i=0;i<n;i++) {
    	  ArrayList<activities> temp=new ArrayList<activities>();
    	  list.add(temp);
      }
      for(int i=0;i<n;i++) {
    	 
          int last=0;
    	  for(int j=i;j<n;j++) {
    	  if(last<=act[j].a) {
    		  list.get(i).add(act[j]);
    		  last=act[i].b;
    	  }
    	  }
      }
     for(int i=0;i<n;i++) {
    	 for(int j=0;j<list.get(i).size();j++) {
    		 System.out.print("{"+list.get(i).get(j).a+" "+list.get(i).get(j).b+"}");
    	 }
    	 System.out.println();
     }
	}

}
