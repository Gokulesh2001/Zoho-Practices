package fileProblems;
import java.io.*;
import java.util.*;
import java.lang.*;
public class wordsCountBasedIndexing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File actual = new File("E:\\Gokulesh");
		String root = "E:\\Gokulesh\\";
		int n = actual.listFiles().length;
		System.out.println(n);
		HashMap<Integer,File> map = new HashMap<Integer,File>();
		
		for(File f:actual.listFiles()) 
		{
			int count=0;
			File file = new File(root+f.getName());
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = br.readLine();
			
			while(str != null) 
			{
				String arrCount[] = str.split(" ");
				count += arrCount.length;
				
				str = br.readLine();
				
			}
			
			map.put(count, f);

		}
		
		TreeMap<Integer,File> tmap = new TreeMap<Integer,File>(map);
		
		Iterator itr = tmap.keySet().iterator();
	    int r = 1;
		while(itr.hasNext())
		{
			File fileSorted = tmap.get(itr.next());
			String content = getContent(fileSorted);
			FileWriter fw = new FileWriter(root+r+".txt");
			fw.write(content);
			r++;
			fw.close();
		}
		
		
	}
	
	static String getContent(File f) throws FileNotFoundException,IOException
	{
		String content = "";
		BufferedReader br = new BufferedReader(new FileReader(f));
		String temp = br.readLine();
		while(temp != null)
		{
			content += temp;
			temp = br.readLine();
		}
		
		br.close();
		return content;
	}
//		 File actual = new File("E:\\Gokulesh");
//		 int n=actual.listFiles().length;
//		 String root="E:\\Gokulesh\\";
//		 HashMap<Integer,File> map=new HashMap<>();
//		 System.out.println(n);
//	        for( File f : actual.listFiles()){
//	        	int count=0;
//	        	System.out.println(f.getName());
//	           File file=new File(root+f.getName());
//	           BufferedReader br=new BufferedReader(new FileReader(file));
//	           String str=br.readLine();
//	           while(str!=null) {
//	        	   String arrCount[]=str.split(" ");
//	        	   count+=arrCount.length;
//	               
//	        	   if(arrCount.length==0) {
//	        		   break;
//	        	   }
//	        	   str=br.readLine();
//	        	   
//	           }
//	           map.put(count, f);
//	           System.out.println(count);
//	        }
//	        TreeMap<Integer,File> mapTree=new TreeMap<Integer,File>(map);
//	        Iterator itr=mapTree.keySet().iterator();
//	        int i=1;
//	        while(itr.hasNext()) {
//	        	File fileSorted=mapTree.get(itr.next());
//	        	FileWriter fw=new FileWriter(root+" "+i+".txt");
//	        	String content=getContent(fileSorted);
//	        	fw.write(content);
//	        	i++;
//	        	fw.close();
//	        }
//	        
//	        
//	        
//	}
//	static String getContent(File file) throws FileNotFoundException,IOException  {
//		
//		BufferedReader br=new BufferedReader(new FileReader(file));
//		
//		String ans="";
//		String str=br.readLine();
//		while(str!=null) {
//			ans+=str;
//			 str=br.readLine();
//		}
//		
//			 br.close();
//		
//		return ans;
//				 
//	}

}
