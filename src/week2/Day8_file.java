package week2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day8_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File nf = new File("text.txt");

		System.out.println(nf.getAbsolutePath());
		System.out.println(nf.getPath());

//		nf.setReadOnly(); // if the code written cannot able to make changes only able to read

		if (nf.createNewFile()) {

			System.out.println("file created");
		} else {
			System.out.println("already file created");
		}

//		if (nf.canWrite()) {
//
//			FileWriter fwrite = new FileWriter(nf);
//
//			fwrite.append("this is java \t this is program");
//			fwrite.append("\n");
//			fwrite.append("this is python");
//			fwrite.close();
//
//			System.out.println("writable");
//		} else {
//			System.out.println("can not writable");
//		}

//		write
		FileWriter fwrite = new FileWriter(nf);

		fwrite.append("this is java \t this is program");
		fwrite.append("\n");
		fwrite.append("this is python");
		fwrite.close();

//		read
		FileReader fread = new FileReader(nf);
		Scanner sc = new Scanner(fread);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

//		while (sc.hasNext()) {
//			System.out.println(sc.next());
//		}

	}

}