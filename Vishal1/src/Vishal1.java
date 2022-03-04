/*Write a Program Read attached Input.txt File and Write in to the  Output.txt and please
share your code file and output.txt with us.
Condition:
1) Don't Write 2 character words.
2) Don't write numbers.
3) Don't write duplicate words.
4) Every word on new line.
5) Should give numbering to each line.
6) First Character of word should be Capital.
	
*/

import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	
	
public class Vishal1 {

	
	public static void main(String[] args)
		{

			
			try {

				
				FileReader fr = new FileReader("C:\\Users\\Owner\\Desktop\\Input.txt");
				FileWriter fw = new FileWriter("C:\\Users\\Owner\\Desktop\\Output.txt");
				String str = "";

				int i;
				while ((i = fr.read()) != -1) {

					str += (char)i;
				}
				System.out.println(str);
				fw.write(str);		
				fr.close();
				fw.close();
				System.out.println(
					"File reading and writing both done");
			}
			catch (IOException e) {
				System.out.println(
					"There are some IOException");
			}
		}
}
	
/********************Output****************
 Sorry....
 This program can not run Exactly
 */

