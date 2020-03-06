import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Assign8_2 {

	public static void main(String[] args) throws Exception {
		
		/*File file = new File("output.txt");

	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            int i = sc.nextInt();
	            System.out.println(i);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
*/		
		
		File file =new File("output.txt");
		Scanner sc=new Scanner(file);
		StringBuffer sb=new StringBuffer();
		
		while(sc.hasNext())
		{
			sb.append(""+sc.nextLine());
		}
		System.out.println(sb);
	
		int b=sb.length();
	
		char a[]=new char[b];
		int j=0;
		for(int i=0;i<sb.length();i++)
		{
			
			if(sb.charAt(i)!=',')
			{
			   a[j]=sb.charAt(i);
			   j++;
			
			}
		}
		for(int i=0;i<b;i++)
		{
		System.out.println(""+a[i]);
		
		}
		//System.out.println(a);
	}

}

