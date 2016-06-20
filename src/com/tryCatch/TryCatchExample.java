package com.tryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchExample {
	public static void main(String[] args) {
		try{
			int[] a  = new int[2];
			TryCatchExample t = new TryCatchExample();
	
			
			String filename = "hello.txt";
			   FileInputStream file = new FileInputStream(filename);
			   int x = (byte) file.read();
			   System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException|IOException e){
			System.out.println(e);
		}
	}
	
	
}
