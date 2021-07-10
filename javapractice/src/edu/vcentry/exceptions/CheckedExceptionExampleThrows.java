package edu.vcentry.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExampleThrows {

	public static void main(String args[]) {
		try {
			new CheckedExceptionExampleThrows().readFile();
		} catch (FileNotFoundException | InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Exception handled");
	}

	public void readFile() throws FileNotFoundException, InterruptedException {
		File f = new File("E:\\coderepo\\b173java\\javapractice\\src\\edu\\vcentry\\exceptions\\a2.txt");
		FileInputStream fis = new FileInputStream(f);
		Thread.sleep(2000);
	}
}
