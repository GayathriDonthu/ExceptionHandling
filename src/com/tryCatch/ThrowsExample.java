package com.tryCatch;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowsExample  {
	public static void main(String[] args) throws IOException {
		
	String filename = "hello.txt";
	   FileInputStream file = new FileInputStream(filename);
	   int x = (byte) file.read();
	   
	}
}
