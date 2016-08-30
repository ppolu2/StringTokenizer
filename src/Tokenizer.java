import java.io.*;
import java.util.StringTokenizer;
public class Tokenizer {

	public static void main(String args[]) throws IOException
	{
		try
		{
			
			FileReader file= new FileReader("D://Poojitha//BigData//Week_1//PrideandPrejudice.txt");
			BufferedReader br= new BufferedReader(file);
			FileWriter fw= new FileWriter("D://Poojitha//BigData//Week_1//New.txt");
			String stringv= br.readLine();
			while(stringv !=null )
			{
				StringTokenizer tokenizer= new StringTokenizer(stringv);
				while(tokenizer.hasMoreTokens())
				{
					fw.write(tokenizer.nextToken());
					fw.append("\r\n");
				}
				stringv=br.readLine();
				
			}
			br.close();
			fw.close();
			
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found");
		}
	}
}
