package com.mkyong.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * ArrayOfBytesToFile
 */
public class ArrayOfBytesToFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		FileInputStream fileInputStream = null;

		File file = new File("resources/testing.txt");

		byte[] bFile = new byte[(int) file.length()];

		try {
			//convert file into array of bytes
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(bFile);
			fileInputStream.close();

			//convert array of bytes into file
			FileOutputStream fileOuputStream = new FileOutputStream("resources/testing2.txt");
			fileOuputStream.write(bFile);
			fileOuputStream.close();

			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
