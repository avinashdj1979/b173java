package edu.vcentry.basics.session03.datatypes;

public class CharacterDataType {

	public static void main(String[] args) {
		char myChar1 = 'a';
		char myChar2 = 64;
		
		System.out.printf("My character is %c\n", myChar1);
		System.out.println("My char2: " + myChar2);
		
		
		char rupeeSym = '\u20B9';
		System.out.println("Rupee symbol: " + rupeeSym);
		
		// char -> 2 bytes - 15 bits
		// Character - Wrapper class
		
	}

}


// u before the unicode number 
// unicode - hexa
// unicode - single quoute
// unicode - non latin chars or spl symbols
// eclipse preferences needs to be changed other you will get ? instead of the unicode
// character
// to change text file encoding
// 1. right click on project
// 2. choose properties
// 3. change text file encoding value to UTF-8
// 4. Apply changes and close the properties dialog
// 5. run the java file

