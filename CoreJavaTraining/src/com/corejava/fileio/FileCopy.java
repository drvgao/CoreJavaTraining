package com.corejava.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		PrintWriter inputWriter = new PrintWriter("E:/javaex/input.txt");
		inputWriter.println("this is first line. this is a title.");
		inputWriter.println("This is second line");
		/*inputWriter.println("this is 3 line");
		inputWriter.println("This is 4 line");
		inputWriter.println("this is 5 line");
		inputWriter.println("This is 6 line");
		inputWriter.println("this is 7 line");
		inputWriter.println("This is 8 line");
		inputWriter.println("this is 9 line");
		inputWriter.println("This is 10 line");*/
		inputWriter.close();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("E:/javaex/input.txt"));
		PrintWriter printWriter = new PrintWriter("E:/javaex/output.txt");
		String line = null;
		String[] currentline=null;//write to 
		
		ArrayList<String> list = new ArrayList<>();
		while((line = bufferedReader.readLine()) != null){
//			System.out.println("line: "+line);
			printWriter.println(line);
			currentline = line.split(" ");
//			System.out.println(currentline.length);
			for(int i=0; i < currentline.length; i++){
				list.add(currentline[i]);
				//while array length
				//read word by word
				//compare with other, and if matches increase count by 1
				//repeat for all array elements
				//print al counts
			}
		}
		
		
		
		printWriter.close();
		bufferedReader.close();
	}
}
