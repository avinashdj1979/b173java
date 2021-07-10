package edu.vcentry.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionExample {
	
	public static void main(String args[]) {
		new CheckedExceptionExample().readFile();
	}
	
	public void readFile() {
		File f = new File("E:\\coderepo\\b173java\\javapractice\\src\\edu\\vcentry\\exceptions\\a.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			Thread.sleep(2000);
		} catch (FileNotFoundException | InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
