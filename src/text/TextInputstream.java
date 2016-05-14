package text;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextInputstream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream input=null;
		BufferedOutputStream output=null;
		try {
			File f = new File("C:\\Users\\NIIT\\Desktop\\z");
			f.createNewFile();
			// TODO: handle exception
		
			//long time = System.currentTimeMillis();
			input = new BufferedInputStream(new FileInputStream("D:\\Files"));
			output = new BufferedOutputStream(new FileOutputStream(f));
			int c;
			while ((c = input.read()) != -1) {
				output.write(c);

			}
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (input != null) {
				input.close();

			}
			if (output!=null) {
				output.close();
			}
		}
	}

}