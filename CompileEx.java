package Exception1;

import java.io.*;

public class CompileEx {
	public static void main(String[] args) throws IOException {
		/*
		 * File f=new File("C:\\Users\\Lenovo\\Desktop\\file1.txt");
		 *  FileReader fr=new FileReader(f);
		 *   int temp=0; 
		 *   while((temp=fr.read())!=-1) {
		 * //System.out.println(temp);//it gives ascii values because fr.read() method
		 * only read ascii values of character System.out.println((char)(temp));
		 */

		System.out.println("find the file");
		try {
			File f = new File("C:\\Users\\Lenovo\\Desktop\\fil1.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while ((temp = fr.read()) != -1) {
				// System.out.println(temp);//it gives ascii values because fr.read() method
				// only read ascii values of character
				System.out.println((char) (temp));
			}
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		} catch (FileNotFoundException ff) {
			System.out.println(ff);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
